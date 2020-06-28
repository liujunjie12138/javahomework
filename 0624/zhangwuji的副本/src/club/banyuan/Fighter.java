package club.banyuan;

public class Fighter {
    public String name;
    public  int blood=1000;
    public  int hurt;
    public Apply apply[]=new Apply[2];
    public  AttackName attackName;
    public int dizzinessNum=0;

    public Apply apply1=new Doublehurt();
    public Apply apply2=new Dizziness();

    public  Fighter(){
        apply[0]=apply1;
        apply[1]=apply2;
    }

    public Fighter(String name, Apply[] apply, AttackName attackName) {
        this.name = name;
        this.apply = apply;
        this.attackName = attackName;
    }

    public void attack(Fighter fighter){
        int random;
        random=(int)Math.random()*(1-0+1)+1;
        if(random==1) {
            apply[0];
        }
        else {
            apply[1].apply(fighter1, fighter);
            dizzinessNum++;
        }
    }

    public void hurt(int hurt){
        System.out.println("受到伤害："+hurt);
        blood-=hurt;
    }

    public void vertigo(int dizzinessNum){
        if (dizzinessNum!=0){

        }

    }

    public void recover(){
        if (dizzinessNum!=0)
            dizzinessNum--;
    }


}
