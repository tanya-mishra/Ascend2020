package domain.attacks.jump;

public class DoubleJump extends Jump {

    public DoubleJump() {
    }

    /**
     * Energy lost by opponent when you use double jump
     *
     * @return Energy lost by opponent when you use double jump
     */
    @Override
    public Integer getDamage() {
        return 2;
    }

    @Override
    public String attack() {
        return "Double Jump";
    }


}
