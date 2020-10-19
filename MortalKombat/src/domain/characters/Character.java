package domain.characters;

import domain.attacks.AttackName;
import domain.attacks.Jump;
import domain.attacks.Kick;
import domain.attacks.Punch;

import java.util.ArrayList;
import java.util.List;

/**
 * Character selected by Player
 */
public abstract class Character {

   Jump jump;

   Kick kick;

   Punch punch;

   String name;

   Integer powerFactor;

   public Character() {
      jump = new Jump();
      kick = new Kick();
      punch = new Punch();
      this.setName();
      this.setPowerFactor();
   }

   public String getName() {
      return name;
   }

   public Integer getPowerFactor() {
      return powerFactor;
   }

   /**
    * Sets the name of the character - to be implemented
    */
   public abstract void setName();

   /**
    * Sets the victory move for this character - to be implemented
    *
    * @return
    */
   public abstract String makeVictoryMove();

   /**
    * Sets the power factor for this character - to be implemented
    */
   public abstract void setPowerFactor();

   /**
    * Gets the list of available attacks which are possible with the
    * specified energy
    *
    * @param energy
    * @return
    */
   public List<AttackName> getAvailableAttacks(Integer energy) {
      List<AttackName> availableAttackTypes = new ArrayList<>();
      if (jump.getEnergyCost() * getPowerFactor() <= energy) {
         availableAttackTypes.add(AttackName.JUMP);
      }
      if (kick.getEnergyCost() * getPowerFactor() <= energy) {
         availableAttackTypes.add(AttackName.KICK);
      }
      if (punch.getEnergyCost() * getPowerFactor() <= energy) {
         availableAttackTypes.add(AttackName.PUNCH);
      }
      return availableAttackTypes;
   }
}
