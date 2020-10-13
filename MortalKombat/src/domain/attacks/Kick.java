package domain.attacks;

public class Kick implements Attack {

    @Override
    public Integer getDamage() {
        return 7;
    }

    @Override
    public String attack() {
        return "Kick";
    }

    /**
     * Energy needed to Kick
     *
     * @return Energy needed to Kick
     */
    @Override
    public Integer getEnergyCost() {
        return 15;
    }
}
