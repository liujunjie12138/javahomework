class Elephant {

  int heightInCM;
}

class Lion{
  int heightInCM;
}

class Fridge {

  int heightInCM;
  Elephant storage;
  Lion storages;

  void store(Elephant elephant) {
    storage = elephant;
  }

  void store(Lion lion){
    storages = lion;
  }
}

public class ObjectDemo {
  static Elephant createElephant(int heightInCM) {
    System.out.printf("创建一个大象，高度%d厘米\n", heightInCM);
    // 使用定义的类作为数据类型
    // 使用new 创建一个对象（实例）
    Elephant elephant = new Elephant();
    // 使用. 访问对象的属性，可以对属性赋值或使用
    elephant.heightInCM = heightInCM;
    return elephant;
  }

  static Lion createLion(int heightInCM) {
    System.out.printf("创建一个狮子，高度%d厘米\n", heightInCM);
    // 使用定义的类作为数据类型
    // 使用new 创建一个对象（实例）
    Lion lion = new Lion();
    // 使用. 访问对象的属性，可以对属性赋值或使用
    lion.heightInCM = heightInCM;
    return lion;
  }

  static Fridge createFridge(int heightInCM) {
    System.out.printf("创建一个冰箱，高度%d厘米\n", heightInCM);
    Fridge fridge = new Fridge();
    fridge.heightInCM = heightInCM;
    return fridge;
  }

  // static void putInElephant(Elephant elephant, Fridge fridge) {
  //   System.out.printf("把%d厘米高的大象装进%d厘米高的冰箱\n", elephant.heightInCM, fridge.heightInCM);
  //   if(elephant.heightInCM < fridge.heightInCM) {

  //     // 使用对象方法
  //     fridge.store(elephant);
  //     System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge.storage.heightInCM);
  //   } else {
  //     System.out.printf("冰箱装不下!\n");
  //   }
    
  // }

  static void putInAnimal(Elephant elephant, Fridge fridge,Lion lion) {
    System.out.printf("把%d厘米高的动物装进%d厘米高的冰箱\n", elephant.heightInCM, fridge.heightInCM);
    if(elephant.heightInCM>lion.heightInCM&&elephant.heightInCM < fridge.heightInCM) {
      // 使用对象方法
      fridge.store(elephant);
      System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge.storage.heightInCM);
    } 
    else if (elephant.heightInCM<lion.heightInCM&&lion.heightInCM < fridge.heightInCM) {
      fridge.store(lion);
      System.out.printf("冰箱里面的老虎高度是%d厘米\n", fridge.storages.heightInCM);
    } 
      System.out.printf("冰箱已经满了!\n");
    
  }


  // static void removeElephant(Fridge fridge,Elephant elephant){
  //   System.out.println("将大象从冰箱里取出");
  //   Elephant newElephant = new Elephant();
  //   newElephant=fridge.storage;
  //   elephant=null;
  //   //return newElephant;
  //   System.out.printf("大象高度是%d厘米\n",newElephant.heightInCM);

  // }
    static Elephant removeElephant(Fridge fridge){
    System.out.println("将大象从冰箱里取出");
    Elephant newElephant = new Elephant();
    newElephant=fridge.storage;
    fridge.storage=null;

    return newElephant;
    //System.out.printf("大象高度是%d厘米\n",newElephant.heightInCM);

  }

  // static void fullFridge(Fridge fridge,Elephant elephant,Lion lion){
  //   if(fridge.storage==elephant.heightInCM){
  //     System.out.printf("冰箱已经满了!\n");

  //   }
  //   else if (fridge.storage.heightInCM==lion.heightInCM) {
  //     System.out.printf("冰箱已经满了!\n");
      
  //   }
  // }

  public static void main(String[] args) {
    Elephant elephant = createElephant(300);
    Fridge fridge = createFridge(500);
    Lion lion = createLion(200);
    Elephant newElephant;
    //putInElephant(elephant, fridge);
    putInAnimal(elephant,fridge,lion);
    newElephant= removeElephant(fridge);
    System.out.printf("大象高度是%d厘米\n",newElephant.heightInCM);
    //fridge.storage=null;
    //elephant=null;
    //System.out.printf("大象高度是%2d 厘米\n",fridge.storage.heightInCM);
    //System.out.printf("大象高度是%2d 厘米\n",elephant.heightInCM);

  }
}


