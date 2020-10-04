package domain.actions.kick;

public class FrontKick implements KickType {

    @Override
    public String kick() {
        return "Front Kick";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }
}
