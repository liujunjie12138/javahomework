package club.banyuan;

public class Doublehurt implements Apply{
    @Override
    public void apply(Fighter from, Fighter to) {
        to.hurt=from.attackName.attack()*2;
    }
}
