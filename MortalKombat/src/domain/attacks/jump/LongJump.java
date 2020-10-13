package domain.attacks.jump;

public class LongJump extends Jump {

    public LongJump() {
    }

    /**
     * Energy lost by opponent when you use long jump
     *
     * @return Energy lost by opponent when you use long jump
     */
    @Override
    public Integer getDamage() {
        return 2;
    }

    @Override
    public String attack() {
        return "Long Jump";
    }

}
