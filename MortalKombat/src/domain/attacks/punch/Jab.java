package domain.attacks.punch;

public class Jab extends Punch {
    public Jab() {
    }

    /**
     * Energy lost by opponent when you use jab
     *
     * @return Energy lost by opponent when you use jab
     */
    @Override
    public Integer getDamage() {
        return 1;
    }

    @Override
    public String attack() {
        return "Jab";
    }
}
