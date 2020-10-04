package domain.actions.punch;

public class UpperCut implements PunchType {
    @Override
    public String punch() {
        return "Upper Cut";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }
}
