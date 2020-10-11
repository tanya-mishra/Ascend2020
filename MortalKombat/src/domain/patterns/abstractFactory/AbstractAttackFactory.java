package domain.patterns.abstractFactory;

public abstract class AbstractAttackFactory {
    abstract AttackType getAttackType(String attackType);
}
