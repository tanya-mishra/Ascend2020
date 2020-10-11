package domain.patterns.abstractFactory;

public interface AttackType {

    /**
     * Health loss when your opponent makes this move
     *
     * @return Health loss when your opponent makes this move
     */
    Integer getOpponentHealthLoss();

    /**
     * Type of attack
     *
     * @return Details of attack
     */
    String attack();

    /**
     * Energy needed for you to make this move
     *
     * @return Energy needed for you to make this move
     */
    Integer getEnergyCost();

}
