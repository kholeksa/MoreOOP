package lotr;
import java.util.Random;

public class King extends Character {
    public King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
    }

    @Override
    public void kick(Character c) {
        int damage = new Random().nextInt(this.getPower()) + 1;
        performKick(c, damage);
    }

    @Override
    public String toString() {
        return "King{hp=" + hp + ", power=" + power + "}";
    }
}