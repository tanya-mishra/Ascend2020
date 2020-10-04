package domain.actions.punch;

public class Jab implements PunchType {
    @Override
    public String punch() {
        return "Jab";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 1;
    }
}
