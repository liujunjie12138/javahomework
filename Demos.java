class Elephant{
	int heightInCM;
}

class Fridge{
	int heightInCM;
	Elephant elephant;
	Tiger tiger;
}

class Tiger{
	int heightInCM;
}


class Main{
	public static Fridge createFridge(int heightInCM){
		System.out.println("创建一个冰箱，高度为："+heightInCM);
		Fridge fridge = new Fridge();
		fridge.heightInCM=heightInCM;
		return fridge;
	}

	public static Elephant createElephant(int heightInCM){
		System.out.println("创建一个大象，高度为："+heightInCM);
		Elephant elephant = new Elephant();
		elephant.heightInCM=heightInCM;
		return elephant;
	}

	public static Tiger createTiger(int heightInCM){
		System.out.println("创建一个老虎，高度为："+heightInCM);
		Tiger tiger=new Tiger ();
		tiger.heightInCM=heightInCM;
		return tiger;
	}

	public static void putinElephant(Elephant elephant, Fridge fridge){
		System.out.printf("把%dcm高的大象，放到%dcm高的冰箱中\n",elephant.heightInCM,fridge.heightInCM);
		if(fridge.heightInCM>elephant.heightInCM){
			fridge.elephant=elephant;
		}
		else{
			System.out.println("大象太大了！");
		}

	}

	public static void putinTiger(Tiger tiger,Fridge fridge){
		System.out.printf("把%dcm高的老虎，放到%dcm高的冰箱中\n",tiger.heightInCM,fridge.heightInCM);
		if(fridge.heightInCM>tiger.heightInCM){
			fridge.tiger=tiger;
		}
		else{
			System.out.println("老虎太大了！");
		}
	}

	public static void main(String [] args){
		Elephant elephant=createElephant(600);
		Fridge fridge = createFridge(500);
		Tiger tiger=createTiger(300);
		putinElephant(elephant,fridge);
		putinTiger(tiger,fridge);
	}
}