package domain.actions.kick;

public class FlyingKick implements KickType {

    @Override
    public String kick() {
        return "Flying Kick";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 3;
    }
}
