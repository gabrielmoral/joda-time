package org.joda.time;

import java.util.HashMap;

public class PoolMinutes extends GenericPool<Minutes> {

    private static PoolMinutes myInstance;

    public PoolMinutes() {
        this.elements = new HashMap<Integer, Minutes>();
    }

    public static PoolMinutes getInstance() {
        if (myInstance == null) {
            myInstance = new PoolMinutes();
        }

        return myInstance;
    }

    @Override
    protected Minutes createElement(int numeral){
        return new Minutes(numeral);
    }

}
