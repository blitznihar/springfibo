package com.blitznihar.fibo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FibonaciCalculatorUsingForeach implements IFibonaciCalculator {
public FibonaciCalculatorUsingForeach() {
    System.out.println("FibonaciCalculatorUsingForeach");
}
    @Autowired
    private IFibonaciNextInSeriesCalculator fibonaciNextInSeriesCalculator;

    @Override
    public ArrayList<Integer> calculateFibo(int intUntil, ArrayList<Integer> listFibonaci, int i, int j, int k) {
        System.out.println("calculateFibo from FibonaciCalculatorUsingForeach");
        for(k=0;k<intUntil;)
        {
            listFibonaci.add(k);
            k= fibonaciNextInSeriesCalculator.getNextFibonaci(i,j);
            i=j;
            j=k;
        }
        return listFibonaci;
    }
    
}