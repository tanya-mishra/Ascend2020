package domain.characters;

/**
 * Character called Johnny Cage
 */
public class JohnnyCage extends Character {

    public JohnnyCage() {
        super();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void setName() {
        this.name = "Johnny Cage";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String makeVictoryMove() {
        return "Super Kick";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPowerFactor() {
        this.powerFactor = 2;
    }
}
