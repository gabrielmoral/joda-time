package org.joda.time;

public abstract class Pool {

    public static Years retrieveYears(int numeral) {
        return PoolYears.getInstance().getElement(numeral);
    }

    public static Months retrieveMonths(int numeral) {
        return PoolMonths.getInstance().getElement(numeral);
    }

    public static Weeks retrieveWeeks(int numeral) {
        return PoolWeeks.getInstance().getElement(numeral);
    }

    public static Days retrieveDays(int numeral) {
        return PoolDays.getInstance().getElement(numeral);
    }

    public static Hours retrieveHours(int numeral) {
        return PoolHours.getInstance().getElement(numeral);
    }

    public static Minutes retrieveMinutes(int numeral) {
        return PoolMinutes.getInstance().getElement(numeral);
    }

    public static Seconds retrieveSeconds(int numeral) {
        return PoolSeconds.getInstance().getElement(numeral);
    }
}

