package domain.characters;

public class Raiden extends Character {

    public Raiden() {
        super();
    }

    @Override
    public void setName() {
        this.name = "Raiden";
    }

    @Override
    public String makeVictoryMove() {
        return "Jump Punch";
    }

    @Override
    public void setPowerFactor() {
        this.powerFactor = 7;
    }
}
