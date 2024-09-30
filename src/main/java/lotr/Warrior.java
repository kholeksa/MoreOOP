package lotr;
import java.util.Random;

public abstract class Warrior extends Character {
    public Warrior(int minPower, int maxPower, int minHp, int maxHp) {
        super(new Random().nextInt(maxPower - minPower + 1) + minPower,
              new Random().nextInt(maxHp - minHp + 1) + minHp);
    }

    @Override
    public void kick(Character c) {
        int damage = new Random().nextInt(this.power) + 1;
        c.setHp(c.getHp() - damage);
        System.out.println(this.getClass().getSimpleName() + " kicked and caused " + damage + " damage!");
    }
}