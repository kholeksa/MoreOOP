package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight between " + c1 + " and " + c2);
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("Both hobbits are just crying, the fight ended without casualties");
            return;
        } else if (c1 instanceof Elf && c2 instanceof Elf) {
            System.out.println("Elves are just decreasing each other's power, the fight ended without casualties");
            return;
        }
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
        }
        if (c1.isAlive()) {
            System.out.println(c1 + " won the fight!");
        } else {
            System.out.println(c2 + " won the fight!");
        }
    }
}