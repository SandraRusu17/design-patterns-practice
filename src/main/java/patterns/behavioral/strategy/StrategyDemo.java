package patterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        AttackService attackService = new AttackService();
        attackService.invokeAttackFor(new Character(CharacterClass.NECROMANT));

    }
}
