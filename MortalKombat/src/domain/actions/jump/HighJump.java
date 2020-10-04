package domain.actions.jump;

public class HighJump implements JumpType {


    @Override
    public String jump() {
        return "High Jump";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }
}
