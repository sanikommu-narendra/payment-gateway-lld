package org.example.states;

import org.example.enums.StateEnum;

public class OnHoldTransition extends State{
    public OnHoldTransition() {
        super(StateEnum.ON_HOLD);
    }

    @Override
    public void notifyStakeHolders() {

    }

    @Override
    public boolean isFeasible(State state) {
        return true;
    }
}
