package org.joda.time;

import java.util.HashMap;

public class PoolSeconds extends GenericPool<Seconds> {

    private static PoolSeconds myInstance;

    public PoolSeconds() {
        this.elements = new HashMap<Integer, Seconds>();
    }

    public static PoolSeconds getInstance() {
        if (myInstance == null) {
            myInstance = new PoolSeconds();
        }

        return myInstance;
    }

    @Override
    protected Seconds createElement(int numeral){
        return new Seconds(numeral);
    }

}
