package domain.characters;

public class LiuKang extends Character {

    public LiuKang() {
        super();
    }

    @Override
    public void setName() {
        this.name = "Liu Kang";
    }

    @Override
    public String makeVictoryMove() {
        return "Punchhhhh";
    }

    @Override
    public void setPowerFactor() {
        this.powerFactor = 3;
    }
}
