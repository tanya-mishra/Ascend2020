package domain.characters;

public class Kano extends Character {

    @Override
    public void setName() {
        this.setName("Kano");
    }

    @Override
    public String makeVictoryMove() {
        return "Jump Kick";
    }

    @Override
    public void setPowerFactor() {
        this.setPowerFactor(20);
    }
}
