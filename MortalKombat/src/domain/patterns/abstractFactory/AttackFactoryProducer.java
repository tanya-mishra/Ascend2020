package domain.patterns.abstractFactory;

public class AttackFactoryProducer {

    public static AbstractAttackFactory getAttackTypeFactory(String attackType) {
        switch (attackType) {
            case "Jump":
                return new JumpFactory();
            case "Kick":
                return new KickFactory();
            case "Punch":
                return new PunchFactory();
        }

        return null;
    }

}
