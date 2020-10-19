package domain.characters;

import domain.attacks.AttackName;
import domain.attacks.Jump;
import domain.attacks.Kick;
import domain.attacks.Punch;

import java.util.ArrayList;
import java.util.List;

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

   public abstract void setName();

   public abstract String makeVictoryMove();

   public abstract void setPowerFactor();

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
