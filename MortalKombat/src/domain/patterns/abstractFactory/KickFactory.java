package domain.patterns.abstractFactory;

public class KickFactory extends AbstractAttackFactory {
    @Override
    AttackType getAttackType(String attackType) {
        switch (attackType) {
            case "LowIntensity":
                return new FlyingKick();
            case "HighIntensity":
                return new RoundHouseKick();
        }
        return new FrontKick();
    }
}
