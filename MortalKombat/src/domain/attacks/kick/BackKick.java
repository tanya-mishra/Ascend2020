package domain.attacks.kick;

public class BackKick extends Kick {

    public BackKick() {
    }

    /**
     * Energy lost by opponent when you use back kick
     *
     * @return Energy lost by opponent when you use back kick
     */
    @Override
    public Integer getDamage() {
        return 2;
    }

    @Override
    public String attack() {
        return "Back Kick";
    }
}
