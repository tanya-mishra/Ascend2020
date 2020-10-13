package domain.patterns.abstractFactory;

public class DoubleJump implements AttackType {

    public DoubleJump() {
    }

    /**
     * Energy lost by opponent when you use double jump
     *
     * @return Energy lost by opponent when you use double jump
     */
    @Override
    public Integer getDamage() {
        return 2;
    }

    @Override
    public String attack() {
        return "Double Jump";
    }

    @Override
    public Integer getEnergyCost() {
        return 15;
    }


}
