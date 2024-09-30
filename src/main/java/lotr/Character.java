package lotr;

public abstract class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract void kick(Character c);

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    protected void performKick(Character c, int damage) {
        c.setHp(c.getHp() - damage);
        System.out.println(this + " decreased the hp of " + c + " by " + damage + "!");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}