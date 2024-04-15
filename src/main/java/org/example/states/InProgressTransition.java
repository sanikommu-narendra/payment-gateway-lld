package org.example.states;

import org.example.enums.StateEnum;

public class InProgressTransition extends State{
    public InProgressTransition() {
        super(StateEnum.IN_PROGRESS);
    }

    @Override
    public void notifyStakeHolders() {

    }

    @Override
    public boolean isFeasible(State state) {
        return true;
    }
}
