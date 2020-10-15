package domain.characters;

public class JohnnyCage extends Character {

    @Override
    public void setName() {
        this.setName("Johnny Cage");
    }

    @Override
    public String makeVictoryMove() {
        return "Kickkkk";
    }

    @Override
    public void setPowerFactor() {
        this.setPowerFactor(10);
    }
}
