package domain.patterns.abstractFactory;

public class TripleJump implements AttackType {


    @Override
    public String attack() {
        return "Triple Jump";
    }

    public TripleJump() {
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
    public Integer getEnergyCost() {
        return 15;
    }


}
