package patterns.behavioral.strategy;

public class Character {
    private final CharacterClass characterClass;

    Character(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }
}
