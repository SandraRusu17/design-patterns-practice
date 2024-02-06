package patterns.behavioral.strategy;

public interface AttackBehaviorStrategy {
    void invokeAttack(Character character);

    boolean accepts(CharacterClass characterClass);
}
