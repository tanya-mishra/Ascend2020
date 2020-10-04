package domain.actions.punch;

public class Hook implements PunchType {
    @Override
    public String punch() {
        return("Hook");
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 1;
    }
}
