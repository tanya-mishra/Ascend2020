package domain.attacks.punch;

public class UpperCut extends Punch {
    public UpperCut() {
    }

    /**
     * Energy lost by opponent when you use upper cut
     *
     * @return Energy lost by opponent when you use upper cut
     */
    @Override
    public Integer getDamage() {
        return 2;
    }

    @Override
    public String attack() {
        return "Upper Cut";
    }
}
