package domain.actions.kick;

import domain.actions.MoveType;

public interface KickType extends MoveType {

    default String move(){
        return this.kick();
    }

    String kick();

}
