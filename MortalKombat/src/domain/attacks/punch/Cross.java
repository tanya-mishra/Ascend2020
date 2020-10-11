package domain.attacks.punch;

public class Cross extends Punch {

    public Cross() {
    }

    /**
     * Energy lost by opponent when you use cross
     *
     * @return Energy lost by opponent when you use cross
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 1;
    }

    @Override
    public String attack() {
        return "Cross";
    }

}
