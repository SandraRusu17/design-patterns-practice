package patterns.behavioral.strategy;

public class PaladinAttackBehaviorStrategy implements AttackBehaviorStrategy {
    @Override
    public void invokeAttack(Character character) {
        if (character.getCharacterClass() == CharacterClass.PALADIN) {
            System.out.println("Paladin attacks with sword");
        }
    }

    @Override
    public boolean accepts(CharacterClass characterClass) {
        return characterClass == CharacterClass.PALADIN;
    }
}
