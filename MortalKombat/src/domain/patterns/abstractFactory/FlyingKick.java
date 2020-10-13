package domain.patterns.abstractFactory;

public class FlyingKick implements AttackType {

    public FlyingKick() {
    }

    /**
     * Energy lost by opponent when you use flying kick
     *
     * @return Energy lost by opponent when you use flying kick
     */
    @Override
    public Integer getDamage() {
        return 3;
    }

    @Override
    public String attack() {
        return "Flying Kick";
    }

    @Override
    public Integer getEnergyCost() {
        return 10;
    }
}
