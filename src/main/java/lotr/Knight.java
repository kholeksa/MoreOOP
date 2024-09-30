package lotr;
import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2);
    }

    @Override
    public void kick(Character c) {
        int damage = this.power;
        performKick(c, damage);
    }

    @Override
    public String toString() {
        return "Knight{hp=" + hp + ", power=" + power + "}";
    }
}