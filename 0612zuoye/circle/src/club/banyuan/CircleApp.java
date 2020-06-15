package club.banyuan;
import club.banyuan.Circle;
public class CircleApp {

	public static void main(String[] args) {
		double rd = 12.3;
		System.out.println("半径 = " + rd);

		Circle circle1 = new Circle(rd);
		//circle1.setRadius(2.5);
		Circle circle2 = new Circle(circle1);
		circle1.setRadius(2.5);
		Circle circle3 = new Circle(circle2);
		// circle3=circle2;
		circle2.setRadius(5);
		double cir1 = circle1.calPerimeter();
		double area1 = circle1.calArea();

		System.out.println("周长：" + cir1);
		System.out.println("面积：" + area1); 

		// circle1.setRadius(2.5);


		double cir2 = circle2.calPerimeter();
		double area2 = circle2.calArea();

		System.out.println("周长：" + cir2);
		System.out.println("面积：" + area2);

		double cir3 = circle3.calPerimeter();
		double area3 = circle3.calArea();

		System.out.println("周长：" + cir3);
		System.out.println("面积：" + area3);
	}
}
