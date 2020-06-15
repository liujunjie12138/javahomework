package club.banyuan;

// import club.banyuan.Product;

public class Main{
	public static void main(String [] args){
		Product product1=new Product("华为",4000);
		Product product2=new Product("小米",2000);
		Product product3=new Product("苹果",5000);
		Product product4=new Product("魅族",3000);
		boolean judge;
		String info;

		product1.setNum(300);
		product2.setNum(500);
		product3.setNum(1000);
		product4.setNum(100);

		product1.getScanCode();
		product2.getScanCode();
		product3.getScanCode();
		product4.getScanCode();

		product1.changePrice(3000);
		product2.changePrice(1000);
		product3.changePrice(4000);
		product4.changePrice(2000);

		info=product1.getInfo();
		System.out.println(info);
		info=product2.getInfo();
		System.out.println(info);
		info=product3.getInfo();
		System.out.println(info);
		info=product4.getInfo();
		System.out.println(info);

		judge=product1.buy(200);
		System.out.println(judge);
		judge=product2.buy(400);
		System.out.println(judge);
		judge=product3.buy(1200);
		System.out.println(judge);
		judge=product4.buy(50);
		System.out.println(judge);



	}
}