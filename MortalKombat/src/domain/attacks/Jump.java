package domain.attacks;

/*
Jump attack
 */
public class Jump implements Attack {

    /*
    Health lost on defending Jump
     */
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
        return 7;
    }

}
