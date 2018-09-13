package com.osm.objectPatterns.state;

public class StateContext {
    private Statelike myState;

    StateContext(){
        setState(new StateLowerCase());
    }

    public Statelike getMyState() {
        return myState;
    }

    void setState(final Statelike myState) {
        this.myState = myState;
    }

    public void writeName(final String name){
        myState.writeName(this, name);
    }
}
