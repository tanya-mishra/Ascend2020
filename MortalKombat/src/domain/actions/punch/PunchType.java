package domain.actions.punch;

import domain.actions.MoveType;

public interface PunchType extends MoveType {

    default String move(){
        return this.punch();
    }

    String punch();

}
