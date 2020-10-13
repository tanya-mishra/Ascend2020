package domain.characters;

public abstract class Character {

   String name;

   public Character() {
      this.setName();
   }

   public abstract void setName();

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public abstract String getVictoryMove();
}
