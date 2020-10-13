package domain.attacks;

public interface AttackType {

    /**
     * Health loss when your opponent makes this move
     *
     * @return Health loss when your opponent makes this move
     */
    Integer getDamage();

    /**
     * Type of attack
     *
     * @return details of attack
     */
    String attack();

    /**
     * Energy needed for you to make this move
     *
     * @return Energy needed for you to make this move
     */
    Integer getEnergyCost();

}
