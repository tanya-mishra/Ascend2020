package domain.powers;

/**
 * Enum for power level of an attack - it can be low, medium or high.
 * Low needs the lowest energy and causes minimum health loss, with both increasing from medium to high.
 */
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
