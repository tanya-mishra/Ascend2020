package domain.attacks;

public class Jump implements Attack {

    @Override
    public Integer getDamage() {
        return 5;
    }

    @Override
    public String attack() {
        return "Jump";
    }

    /**
     * Energy needed to jump
     *
     * @return Energy needed to jump
     */
    @Override
    public Integer getEnergyCost() {
        return 10;
    }

}
