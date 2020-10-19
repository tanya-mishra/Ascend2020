package domain.characters;

public class Kano extends Character {

    public Kano() {
        super();
    }

    @Override
    public void setName() {
        this.name = "Kano";
    }

    @Override
    public String makeVictoryMove() {
        return "Jump Kick";
    }

    @Override
    public void setPowerFactor() {
        this.powerFactor = 20;
    }
}
