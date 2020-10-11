package domain.characters;

public class CharacterFactory {

    public Character getCharacter(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case ("JC"): {
                return new JohnnyCage();
            }
            case ("K"): {
                return new Kano();
            }
            case ("LK"): {
                return new LiuKang();
            }
            case ("R"): {
                return new Raiden();
            }
            default: {
                return new JohnnyCage();
            }
        }
    }
}
