package domain.attacks.jump;

public class HighJump extends Jump {

    public HighJump() {
    }

    /**
     * Energy lost by opponent when you use high jump
     *
     * @return Energy lost by opponent when you use high jump
     */
    @Override
    public Integer getOpponentHealthLoss() {
        return 2;
    }

    @Override
    public String attack() {
        return "High Jump";
    }
}
