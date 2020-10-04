package domain.actions.kick;

public class RoundHouseKick implements KickType {

    @Override
    public String kick() {
        return "Round House Kick";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 5;
    }
}
