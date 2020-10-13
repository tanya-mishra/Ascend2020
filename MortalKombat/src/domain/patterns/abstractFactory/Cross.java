package domain.patterns.abstractFactory;

public class Cross implements AttackType {

    public Cross() {
    }

    /**
     * Energy lost by opponent when you use hook
     *
     * @return Energy lost by opponent when you use hook
     */
    @Override
    public Integer getDamage() {
        return 2;
    }

    @Override
    public String attack() {
        return "Cross";
    }

    @Override
    public Integer getEnergyCost() {
        return 5;
    }
}
