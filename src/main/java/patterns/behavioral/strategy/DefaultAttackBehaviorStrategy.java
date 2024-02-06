package patterns.behavioral.strategy;

public class DefaultAttackBehaviorStrategy implements AttackBehaviorStrategy {
    @Override
    public void invokeAttack(Character character) {
        System.out.println(character.getCharacterClass() + " attacks fists and kicks with legs");
    }

    @Override
    public boolean accepts(CharacterClass characterClass) {
        return false;
    }
}
