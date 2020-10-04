package domain.actions.jump;

public class TripleJump implements JumpType {

    @Override
    public String jump() {
        return "Triple Jump";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 3;
    }
}
