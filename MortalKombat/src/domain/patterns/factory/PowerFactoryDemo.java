package domain.patterns.factory;

import java.util.stream.Stream;

public class PowerFactoryDemo {

    public static void main(String[] args) {
        PowerFactory pf = new PowerFactory();

        Stream<String> powerTypes = Stream.of("SuperJump", "SuperKick", "SuperTrio", "SuperPunch", "PowerLow");

        powerTypes.forEach(pt -> System.out.println(pt + " " + pf.getPower(pt).toString()));

    }

}
