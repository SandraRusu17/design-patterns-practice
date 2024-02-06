package patterns.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class AttackService {

    public void invokeAttackFor(Character character) {
        AttackBehaviorStrategy attackBehaviorStrategy = new AttackBehaviorStrategyResolver().resolveFor(character.getCharacterClass());
        attackBehaviorStrategy.invokeAttack(character);
    }

    class AttackBehaviorStrategyResolver {
        private final List<AttackBehaviorStrategy> strategies;

        AttackBehaviorStrategyResolver() {
            this.strategies = Arrays.asList(
                    new MageAttackBehaviorStrategy(),
                    new WarriorAttackBehaviorStrategy(),
                    new ArcherAttackBehaviorStrategy(),
                    new PaladinAttackBehaviorStrategy());
        }

        public AttackBehaviorStrategy resolveFor(CharacterClass characterClass) {
            return strategies.stream()
                    .filter(s -> s.accepts(characterClass))
                    .findFirst()
                    .orElseGet(DefaultAttackBehaviorStrategy::new);
//                    .orElseThrow(() -> new RuntimeException("No strategy found for " + characterClass));
        }
    }
}
