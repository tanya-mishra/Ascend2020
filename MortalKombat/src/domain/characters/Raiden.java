package domain.characters;

public class Raiden extends Character {

    @Override
    public void setName() {
        this.setName("Raiden");
    }

    @Override
    public String makeVictoryMove() {
        return "Jump Punch";
    }

    @Override
    public void setPowerFactor() {
        this.setPowerFactor(7);
    }
}
