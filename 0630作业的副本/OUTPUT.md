#### 1.
```
class Main {
   public static void main(String args[]) {
      try {
         throw 10;
      }
      catch(int e) {
         System.out.println("Got the  Exception " + e);
      }
  }
}
编译错误
throw后面的类型必须是Throwable。
```

#### 2.
```
class Test extends Exception { }
  
class Main {
   public static void main(String args[]) { 
      try {
         throw new Test();
      }
      catch(Test t) {
         System.out.println("Got the Test Exception");
      }
      finally {
         System.out.println("Inside finally block ");
      }
  }
}
Got the Test Exception
Inside finally block 
```
#### 3.
```
class Main {
   public static void main(String args[]) {
      int x = 0;
      int y = 10;
      int z = y/x;
  }
}
运行错误
```
#### 4.
```
class Base extends Exception {}
class Derived extends Base  {}
 
public class Main {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
    catch(Derived d)  { 
       System.out.println("Caught derived class exception"); 
    }
  }
} 
编译报错
Derived是Base的子类，在捕获异常时，应将子类放在父类的前面；让子类对象先执行。
```
#### 5.
```
class Test
{
    public static void main (String[] args)
    {
        try
        {
            int a = 0;
            System.out.println ("a = " + a);
            int b = 20 / a;
            System.out.println ("b = " + b);
        }
 
        catch(ArithmeticException e)
        {
            System.out.println ("Divide by zero error");
        }
 
        finally
        {
            System.out.println ("inside the finally block");
        }
    }
}
a=0
Divide by zero error
inside the finally block
```
#### 6.
```
class Test
{
    public static void main(String[] args)
    {
        try
        {
            int a[]= {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++)
            {
                System.out.println ("a[" + i + "]=" + a[i] + "n");
            }
        }
         
        catch (Exception e)
        {
            System.out.println ("error = " + e);
        }
         
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("ArrayIndexOutOfBoundsException");
        }
    }
}
编译错误，ArrayIndexOutOfBoundsException是Exception，子类应放在父类的前面，让子类先执行。颠倒报错。
a[1]=2n
a[2]=3n
a[3]=4n
ArrayIndexOutOfBoundsException
```
#### 7.
```
class Test
{
    String str = "a";
 
    void A()
    {
        try
        {
            str +="b";//ab
            B();
        }
        catch (Exception e)
        {
            str += "c";//abdec
        }
    }
 
    void B() throws Exception
    {
        try
        {
            str += "d";//abd
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
            str += "e";//abde
        }
 
        str += "f";
 
    }
     
    void C() throws Exception
    {
        throw new Exception();
    }
 
    void display()
    {
        System.out.println(str);
    }
 
    public static void main(String[] args)
    {
        Test object = new Test();
        object.A();
        object.display();
    }
 
}
abdec
```
#### 8.
```
class Test
{   int count = 0;
 
    void A() throws Exception
    {
        try
        {
            count++;//1
             
            try
            {
                count++;//2
 
                try
                {
                    count++;//3
                    throw new Exception();
 
                }
                 
                catch(Exception ex)
                {
                    count++;//4
                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;//5
            }
        }
         
        catch(Exception ex)
        {
            count++;
        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
        Test obj = new Test();
        obj.A();
        obj.display();
    }
}
5
```

#### 9.方法返回值是
```
public int myMethod(){

  try {

  return 1;

  }

  Catch (Exception e){

  return 2;

  }

  finally{

  return 3;

 }

}
3 return只会返回一次
```
#### 10.

```
 try {

      File file = new File("filename.txt");

      Scanner sc = new Scanner(file);

      throw new IOException();
    }

    catch (FileNotFoundException e) {

      System.out.println("FileNotFoundException called!!!");

    }

    catch (IOException e) {

      System.out.println("IOException called!!!");

    } 
FileNotFoundException called!!!
因为FileNotFoundException是IOException的子类，所以捕获是先优先执行子类对象
```
#### 11.

```
try {

      File file = new File("filename.txt");

      Scanner sc = new Scanner(file);

      throw new IOException();
    }

    catch (IOException e) {

      System.out.println("IOException called!!!");

    } 
    IOException called!!!
```

#### 12.
```
public class Test {
 
    private static String result = "";
 
    public static void main(String[] args) {
        test(1);
        result += "*";//1245*
        test(0);
        System.out.println(result);//1245*03
    }
 
    public static void test(int i) {
        result += "1";//1//1
        try {
            if (i == 0) {
                throw new RuntimeException("");
            }
            result += "2";//12
        } catch (Exception e) {
            result += "3";//13
            return;
        } finally {
            result += "4";//124//134
        }
        result += "5";//1245
    }
}
1245*134
```

