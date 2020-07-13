package club.banyuan;

import java.util.Arrays;

public class VendingMachine {
    String []productInfo=new String[]{" A ", " B ", " C ", " D ", " E "};
    int [] produnctPrice=new int[]{10, 6, 5, 8, 7};
    String[] tatusproductS=new String[]{"   ","   ","   ","   ","   "};
    int releft=0;
    String selectProduct="===";

    @Override
    public String toString() {
        return
                "*-----------------------------------------*"+"\n"+
                "|        Vending         Machine          |"+"\n"+
                "|-----------------------------------------|"+"\n"+
                "|"+ Arrays.toString(productInfo)+"                |"+"\n"+
                "|"+"$"+ Arrays.toString(produnctPrice) + "                        |"+"\n"+
                "|"+ Arrays.toString(tatusproductS) +"                |"+"\n"+
                "*-----------------------------------------*"+"\n"+
                "|                              "+releft+"          |"+"\n"+
                "|                                         |"+"\n"+
                "|     " + selectProduct +"                                 |"+"\n"+
                "*-----------------------------------------*"+"\n";
    }
}
