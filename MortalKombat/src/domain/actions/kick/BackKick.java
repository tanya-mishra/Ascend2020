package domain.actions.kick;

public class BackKick implements KickType {
    @Override
    public String kick() {
        return "Back Kick";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }
}
