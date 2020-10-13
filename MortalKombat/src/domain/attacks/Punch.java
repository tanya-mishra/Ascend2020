package domain.attacks;

public class Punch implements Attack {

    public Punch() {
    }

    @Override
    public Integer getDamage() {
        return 3;
    }

    @Override
    public String attack() {
        return "Punch";
    }

    /**
     * Energy needed to Punch
     *
     * @return Energy needed to Punch
     */
    @Override
    public Integer getEnergyCost() {
        return 5;
    }

}
