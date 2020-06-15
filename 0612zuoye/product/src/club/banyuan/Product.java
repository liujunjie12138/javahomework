package club.banyuan;
// ### 实现Product类具备以下属性和方法

// 属性

// - name : String
// - price : double
// - scanCode : int
// - num : int

// 方法

// - 构造方法(String name,double price)
// - String getName()
// - int getScanCode()
// - double getPrice()
// - void changePrice(double)
// - int getNum()
// - void setNum(int)
// - String getInfo()
// - boolean buy(int)

// ScanCode 是一个4位数字，首位数字不能为0，将在构造对象的时候自动生成，保证每一个Product对象的ScanCode是唯一的
// buy 方法将num 减去传入的数字，如果传入数字较大表示库存不足，num不做修改则返回false，否则返回true

// getInfo() 返回一个字符串如下

// ```
// --- 产品信息 ---
// 名称: 手机
// 编码：1001
// 价格: 2001.00元
// ```

// 自己编写一个测试用的类，测试所有的方法功能正常

public class Product{
	private String name;
	private double price;
	private int scanCode;
	private int num;
	// private int i=0;
	private static int count=0;
	private static int arr[]=new int [100];
	//private static int i=1000; 

	public Product(String name,double price){
		this.name=name;
		this.price=price;
	}

	public String getname(){
		return name;
	}

	public int getScanCode(){
		scanCode=(int)((Math.random()*9+1)*1000);
		arr[count]=scanCode;
		count++;
		int i=0;
		while(i<count){
			if(scanCode==arr[i]){
				scanCode=(int)((Math.random()*9+1)*1000);
				arr[count]=scanCode;
				i=0;
			}
			else{
				++i;
			}
			
		}
		//arr[count]=scanCode;
		return scanCode;
	}

	public double getPrice(){
		return price;
	}

	public void changePrice(double price){
		this.price=price;
	}

	public int getNum(){
		return num;
	}

	public void setNum(int num){
		this.num=num;

	}

	public String getInfo(){
		// System.out.println("``````");
		// System.out.println("--- 产品信息 ---");
		// System.out.println("名称："+this.name);
		// System.out.println("编码："+this.scanCode);
		// System.out.println("价格："+this.price);
		// System.out.println("``````");
		String info="``````"+"\n"+"--- 产品信息 ---"+"\n"+"名称："+this.name+"\n"+"编码："+this.scanCode
			+"\n"+"价格："+this.price+"\n"+"``````"+"\n";
		//System.out.print("``````"+"\n"+"--- 产品信息 ---"+"\n"+"名称："+this.name+"\n"+"编码："+this.scanCode
			//+"\n"+"价格："+this.price+"\n"+"``````"+"\n");
		return info;

	}

	public boolean buy(int num){
		if(this.num-num<0)
			return false;
		else
			return true;
	}




}




