package domain.patterns.abstractFactory;

public class AbstractFactoryPatternDemo {

    public void abstractFactoryPatternDemo() {
        AbstractAttackFactory jumpAttack = AttackFactoryProducer.getAttackTypeFactory("Jump");
        System.out.println(jumpAttack.getAttackType("LowIntensity").attack());

        AbstractAttackFactory kickAttack = AttackFactoryProducer.getAttackTypeFactory("Kick");
        System.out.println(kickAttack.getAttackType("LowIntensity").attack());

        AbstractAttackFactory punchAttack = AttackFactoryProducer.getAttackTypeFactory("Punch");
        System.out.println(punchAttack.getAttackType("LowIntensity").attack());
    }

    public static void main(String[] args) {
        AbstractFactoryPatternDemo afpd = new AbstractFactoryPatternDemo();
        afpd.abstractFactoryPatternDemo();
    }

}
