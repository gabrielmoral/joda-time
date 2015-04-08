package org.joda.time;

import java.util.HashMap;

public abstract class GenericPool<T>
{
    protected HashMap<Integer, T> elements;

    protected abstract T createElement(int numeral);


    public T getElement(int numeral){
        T result = elements.get(new Integer(numeral));

        if (result == null) {
            result =  this.createElement(numeral);
            elements.put(numeral,  result);
        }

        return result;
    }
}
