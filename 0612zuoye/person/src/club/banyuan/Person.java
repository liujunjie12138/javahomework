package club.banyuan;
// 补全`class Person`代码，分别统计创建Person对象的总数和调用了两个参数的构造方法的总数
// 补全`class Main`中的`main`方法，结尾处输出以下内容

// <pre>
// 一共创建了5个对象
// 两个参数的构造方法被调用了2次
// </pre>



public class Person {

  private String name;
  private int age;
  public static int count1;
  public static int count2;
  // int count01;
  // int count02;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.count2++;
    // this.count02=this.count2;
    //System.out.println("调用了两个参数的构造方法总数是："+count2);
  }

  public Person(String name) {
    this.name = name;
  }

  public Person() {
    this.count1+=1;;
    //this.count01=this.count1;
    //System.out.println("创建Person对象的总数是："+count1);
    //System.out.println("调用了两个参数的构造方法总数是："+count2);

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
