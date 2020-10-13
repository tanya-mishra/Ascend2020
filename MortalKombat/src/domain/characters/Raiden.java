package domain.characters;

public class Raiden extends Character {

    @Override
    public String getName() {
        return "Raiden";
    }

    @Override
    public String getVictoryMove() {
        return "Jump Punch";
    }

    @Override
    public Integer getPowerFactor() {
        return 7;
    }
}
