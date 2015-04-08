package org.joda.time;

import java.util.HashMap;

public class PoolYears extends GenericPool<Years> {

    private static PoolYears myInstance;

    public PoolYears() {
        this.elements = new HashMap<Integer, Years>();
    }

    public static PoolYears getInstance() {
        if (myInstance == null) {
            myInstance = new PoolYears();
        }

        return myInstance;
    }

    @Override
    protected Years createElement(int numeral){
        return new Years(numeral);
    }

}
