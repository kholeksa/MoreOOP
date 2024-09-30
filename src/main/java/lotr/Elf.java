package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            c.setHp(0);
            System.out.println("Elf killed " + c+ "!");
        } else {
            c.power -= 1;
            System.out.println("Elf decreased the power of " + c + " by 1!");
        }
    }

}