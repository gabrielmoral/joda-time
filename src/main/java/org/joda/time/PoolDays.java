package org.joda.time;

import java.util.HashMap;

public class PoolDays extends GenericPool<Days> {

    private static PoolDays myInstance;

    public PoolDays() {
        this.elements = new HashMap<Integer, Days>();
    }

    public static PoolDays getInstance() {
        if (myInstance == null) {
            myInstance = new PoolDays();
        }

        return myInstance;
    }

    @Override
    protected Days createElement(int numeral){
        return new Days(numeral);
    }

}
