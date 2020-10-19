package domain.characters;

public class JohnnyCage extends Character {

    public JohnnyCage() {
        super();
    }

    @Override
    public void setName() {
        this.name = "Johnny Cage";
    }

    @Override
    public String makeVictoryMove() {
        return "Kickkkk";
    }

    @Override
    public void setPowerFactor() {
        this.powerFactor = 10;
    }
}
