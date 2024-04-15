package org.example.states;

import org.example.enums.StateEnum;

public class FailureTransition extends State {
    public FailureTransition() {
        super(StateEnum.FAILURE);
    }

    @Override
    public void notifyStakeHolders() {

    }

    @Override
    public boolean isFeasible(State state) {
        return true;
    }
}
