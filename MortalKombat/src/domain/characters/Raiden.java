package domain.characters;

/**
 * Character called Raiden
 */
public class Raiden extends Character {

    public Raiden() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName() {
        this.name = "Raiden";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String makeVictoryMove() {
        return "Round House Kick";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPowerFactor() {
        this.powerFactor = 7;
    }
}
