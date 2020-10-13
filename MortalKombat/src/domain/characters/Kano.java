package domain.characters;

public class Kano extends Character {

    @Override
    public String getName() {
        return "Kano";
    }

    @Override
    public String getVictoryMove() {
        return "Jump Kick";
    }

    @Override
    public Integer getPowerFactor() {
        return 20;
    }
}
