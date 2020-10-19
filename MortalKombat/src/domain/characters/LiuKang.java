package domain.characters;

/**
 * Character called Liu Kang
 */
public class LiuKang extends Character {

    public LiuKang() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName() {
        this.name = "Liu Kang";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String makeVictoryMove() {
        return "Double Punch";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPowerFactor() {
        this.powerFactor = 3;
    }
}
