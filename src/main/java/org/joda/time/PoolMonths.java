package org.joda.time;

import java.util.HashMap;

public class PoolMonths extends GenericPool<Months> {

    private static PoolMonths myInstance;

    public PoolMonths() {
        this.elements = new HashMap<Integer, Months>();
    }

    public static PoolMonths getInstance() {
        if (myInstance == null) {
            myInstance = new PoolMonths();
        }

        return myInstance;
    }

    @Override
    protected Months createElement(int numeral){
        return new Months(numeral);
    }

}
