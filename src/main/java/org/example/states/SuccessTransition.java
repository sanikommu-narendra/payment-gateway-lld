package org.example.states;

import org.example.enums.StateEnum;

public class SuccessTransition extends State {
    public SuccessTransition() {
        super(StateEnum.SUCCESS);
    }

    @Override
    public void notifyStakeHolders() {

    }

    @Override
    public boolean isFeasible(State state) {
        return true;
    }
}
