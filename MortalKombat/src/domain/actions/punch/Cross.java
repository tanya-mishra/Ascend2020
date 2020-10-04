package domain.actions.punch;

public class Cross implements PunchType {
    @Override
    public String punch() {
        return "Cross Punch";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 1;
    }

}
