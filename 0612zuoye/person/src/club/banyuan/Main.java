package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    Person zhangsan = new Person("张三", 18);
    Person lisi = new Person("李四");
    Person wangwu = new Person("王五");
    Person zhaoliu = new Person("赵六", 20);
    System.out.println("创建Person对象的总数是："+zhaoliu.count1);
    System.out.println("调用了两个参数的构造方法总数是："+zhaoliu.count2);


  }
}
