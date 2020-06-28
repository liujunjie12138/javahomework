package club.banyuan;

public class Dizziness implements Apply{
    @Override
    public void apply(Fighter from, Fighter to) {
       to.hurt=from.attackName.attack();
    }
}
