package club.banyuan;

public class Tulong implements AttackName{
    private String armName="屠龙刀";
    private int hurt;

    @Override
    public String getName() {
        return armName;
    }

    @Override
    public int attack() {
        return hurt=(int)Math.random()*(30-20+1)+1;
    }
}
