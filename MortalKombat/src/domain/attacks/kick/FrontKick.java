package domain.attacks.kick;

public class FrontKick extends Kick {

    public FrontKick() {
    }

    /**
     * Energy lost by opponent when you use front kick
     *
     * @return Energy lost by opponent when you use front kick
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }

    @Override
    public String attack() {
        return "Front Kick";
    }
}
