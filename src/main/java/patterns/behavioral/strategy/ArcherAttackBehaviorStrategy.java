package patterns.behavioral.strategy;

public class ArcherAttackBehaviorStrategy implements AttackBehaviorStrategy {
    @Override
    public void invokeAttack(Character character) {
        if (character.getCharacterClass() == CharacterClass.ARCHER) {
            System.out.println("Archer attacks with bow and arrows");
        }
    }

    @Override
    public boolean accepts(CharacterClass characterClass) {
        return characterClass == CharacterClass.ARCHER;
    }
}
