package domain.attacks.jump;

public class TripleJump extends Jump {

    public TripleJump() {
    }

    /**
     * Energy lost by opponent when you use triple jump
     *
     * @return Energy lost by opponent when you use triple jump
     */
    @Override
    public Integer getDamage() {
        return 3;
    }

    @Override
    public String attack() {
        return "Triple Jump";
    }
}
