package domain.patterns.abstractFactory;

public class PunchFactory extends AbstractAttackFactory {
    @Override
    AttackType getAttackType(String attackType) {
        switch (attackType) {
            case "LowIntensity":
                return new Hook();
            case "HighIntensity":
                return new Jab();
        }
        return new Cross();
    }
}
