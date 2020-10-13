package domain.attacks.kick;

public class FlyingKick extends Kick {

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
}
