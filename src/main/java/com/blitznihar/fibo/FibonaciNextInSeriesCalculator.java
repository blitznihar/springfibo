package com.blitznihar.fibo;

import org.springframework.stereotype.Component;

@Component
public class FibonaciNextInSeriesCalculator implements IFibonaciNextInSeriesCalculator {
public FibonaciNextInSeriesCalculator() {
    System.out.println("FibonaciNextInSeriesCalculator");
}
    @Override
    public Integer getNextFibonaci(Integer startValue, Integer endValue) {
        Integer nextValue = 0;
        if(startValue==0 && endValue==0)
        nextValue = 1;
        else
        nextValue =startValue+endValue;
        return nextValue;
    }

}