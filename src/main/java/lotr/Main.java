package lotr;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();
        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);
    }
}