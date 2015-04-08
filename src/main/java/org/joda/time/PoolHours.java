package org.joda.time;

import java.util.HashMap;

public class PoolHours extends GenericPool<Hours> {

    private static PoolHours myInstance;

    public PoolHours() {
        this.elements = new HashMap<Integer, Hours>();
    }

    public static PoolHours getInstance() {
        if (myInstance == null) {
            myInstance = new PoolHours();
        }

        return myInstance;
    }

    @Override
    protected Hours createElement(int numeral){
        return new Hours(numeral);
    }

}
