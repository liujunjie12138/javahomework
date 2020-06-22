package club.banyuan;

public class Student {
    private String name;

    public Student(){
        this.name="";
    }

    public Student(String name){
        this.name=name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public void Study (){
        System.out.println("一周学习五天，周末休息");
    }
}
