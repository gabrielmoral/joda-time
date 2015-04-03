package org.joda.time;

public abstract class Pool {

    public static Days retrieveDays(int numeral) {
        Pool pool = CreatePool(1);
        return (Days)pool.getElement(numeral);
    }


    public static Minutes retrieveMinutes(int numeral) {
        Pool pool = CreatePool(2);
        return (Minutes)pool.getElement(numeral);
    }

    public abstract Object getElement(int numeral);

    private static Pool CreatePool(int type)
    {
        switch (type) {
            case 1:
                return PoolDays.getInstance();
            case 2:
                return PoolMinutes.getInstance();
            default:
                return null;
        }
    }
}

