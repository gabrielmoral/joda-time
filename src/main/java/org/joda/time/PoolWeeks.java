package org.joda.time;

import java.util.HashMap;

public class PoolWeeks extends GenericPool<Weeks> {

    private static PoolWeeks myInstance;

    public PoolWeeks() {
        this.elements = new HashMap<Integer, Weeks>();
    }

    public static PoolWeeks getInstance() {
        if (myInstance == null) {
            myInstance = new PoolWeeks();
        }

        return myInstance;
    }

    @Override
    protected Weeks createElement(int numeral){
        return new Weeks(numeral);
    }

}
