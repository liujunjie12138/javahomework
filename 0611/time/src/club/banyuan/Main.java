package club.banyuan;

import club.com.Hour;
import club.com.Minute;
import club.com.Second;
import club.com.Printclock;

public class Main{
	public static void main(String [] args){
		Hour hour1 =new Hour ();
		hour1.hour =23;
		Minute minute1= new Minute();
		minute1.minute=59;
		Second second1=new Second();
		second1.second=60;

		Printclock printclock1=new Printclock();

		printclock1.nextSecond(hour1,minute1,second1);

		printclock1.setTime(hour1,minute1,second1);

		//printclock1.toString();


	}
}