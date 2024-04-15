package org.example.states;

import org.example.enums.StateEnum;

abstract public class State {
    protected StateEnum stateEnum;

    public StateEnum getStateEnum() {
        return stateEnum;
    }

    public State(StateEnum stateEnum) {
        this.stateEnum = stateEnum;
    }

    abstract public void notifyStakeHolders();
    abstract public boolean isFeasible(State state);
}
