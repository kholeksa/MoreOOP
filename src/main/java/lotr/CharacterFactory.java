package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        Random random = new Random();
        int choice = random.nextInt(4);
        switch (choice) {
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new King();
            case 3: return new Knight();
            default: return null;
        }
    }
}