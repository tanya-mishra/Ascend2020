package domain.attacks.punch;

public class Hook extends Punch {

    public Hook() {
    }

    /**
     * Energy lost by opponent when you use hook
     *
     * @return Energy lost by opponent when you use hook
     */
    @Override
    public Integer getDamage() {
        return 1;
    }

    @Override
    public String attack() {
        return "Hook";
    }
}
