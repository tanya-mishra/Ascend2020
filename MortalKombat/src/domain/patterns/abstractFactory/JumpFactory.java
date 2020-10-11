package domain.patterns.abstractFactory;

public class JumpFactory extends AbstractAttackFactory {
    @Override
    AttackType getAttackType(String attackType) {
        switch (attackType) {
            case "LowIntensity":
                return new DoubleJump();
            case "HighIntensity":
                return new HighJump();
        }
        return new TripleJump();
    }
}
