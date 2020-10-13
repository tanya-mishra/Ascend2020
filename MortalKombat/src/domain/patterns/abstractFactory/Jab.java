package domain.patterns.abstractFactory;

class Jab implements AttackType {
    public Jab() {
    }

    /**
     * Energy lost by opponent when you use jab
     *
     * @return nergy lost by opponent when you use jab
     */
    @Override
    public Integer getDamage() {
        return 1;
    }

    @Override
    public String attack() {
        return null;
    }

    @Override
    public Integer getEnergyCost() {
        return null;
    }
}