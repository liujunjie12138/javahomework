package club.banyuan;

public class Yitian implements AttackName{
    private String armName="倚天剑";
    private int hurt=15;

    @Override
    public String getName() {
        return armName;
    }

    @Override
    public int attack() {
        return hurt;
    }
}
