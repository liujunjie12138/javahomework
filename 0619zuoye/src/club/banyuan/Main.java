package club.banyuan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student=new Student();
        PrimaryStudent primaryStudent=new PrimaryStudent("小红");
        MiddleStudent middleStudent=new MiddleStudent("小米");
        SeniorStudent seniorStudent=new SeniorStudent("小明");

        System.out.println(primaryStudent.getName());
        System.out.println(middleStudent.getName());
        System.out.println(seniorStudent.getName());

        primaryStudent.Study();
        middleStudent.Study();
        seniorStudent.Study();

        primaryStudent.setName("小花");
        middleStudent.setName("小华");
        seniorStudent.setName("小宇");

        System.out.println(primaryStudent.getName());
        System.out.println(middleStudent.getName());
        System.out.println(seniorStudent.getName());


    }
}
