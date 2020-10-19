package domain.characters;
/*
Character called Kano
 */
public class Kano extends Character {

    public Kano() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName() {
        this.name = "Kano";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String makeVictoryMove() {
        return "Jump Kick";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPowerFactor() {
        this.powerFactor = 20;
    }
}
