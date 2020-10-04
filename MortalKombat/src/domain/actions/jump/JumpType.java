package domain.actions.jump;

import domain.actions.MoveType;

public interface JumpType extends MoveType {

    default String move(){
        return this.jump();
    }

    String jump();

}
