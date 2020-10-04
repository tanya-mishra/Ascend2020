package domain.powers;

public enum PowerLevel {

    LOW (1), MEDIUM(2) , HIGH (5) ;

    int energyFactor;

    public int getEnergyFactor() {
        return energyFactor;
    }

    PowerLevel(int energyFactor) {
        this.energyFactor = energyFactor;
    }


}
