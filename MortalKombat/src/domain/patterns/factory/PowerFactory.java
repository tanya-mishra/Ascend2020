package domain.patterns.factory;

import domain.powers.*;

//Demo for factory method
public class PowerFactory {

    public Power getPower(String powerName) {
        if (powerName == null)
            return null;
        /*
        This is based on power name for the sake of simplicity, but it could depend on a complicated combination
        of energy, level in game, achievements unlocked etc.
         */
        switch (powerName) {
            case "PowerLow": {
                return new PowerLow();
            }
            case "SuperJump": {
                return new SuperJump();
            }
            case "SuperKick": {
                return new SuperKick();
            }
            case "SuperPunch": {
                return new SuperPunch();
            }
            case "SuperTrio": {
                return new SuperTrio();
            }
            default:
                return null;
        }
    }
}
