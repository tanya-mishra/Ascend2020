package domain.characters;

public class LiuKang extends Character {

    @Override
    public void setName() {
        this.setName("Liu Kang");
    }

    @Override
    public String makeVictoryMove() {
        return "Punchhhhh";
    }

    @Override
    public void setPowerFactor() {
        this.setPowerFactor(3);
    }
}
