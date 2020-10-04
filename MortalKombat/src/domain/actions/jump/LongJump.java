package domain.actions.jump;

public class LongJump implements JumpType {

    @Override
    public String jump() {
        return "Long Jump";
    }

    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }

}
