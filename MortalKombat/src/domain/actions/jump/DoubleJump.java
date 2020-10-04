package domain.actions.jump;

public class DoubleJump implements JumpType {

    public DoubleJump() {
    }

    @Override
    public String jump() {
        return "Double Jump";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }
}
