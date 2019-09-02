package com.blitznihar.fibo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FibonaciCalculatorRecursive implements IFibonaciCalculator {
    public FibonaciCalculatorRecursive() {
        System.out.println("FibonaciCalculatorRecursive");
    }

    @Autowired
    private IFibonaciNextInSeriesCalculator fibonaciNextInSeriesCalculator;

    @Override
    public ArrayList<Integer> calculateFibo(int intUntil, ArrayList<Integer> listFibonaci, int i, int j, int k) {
        System.out.println("calculateFibo from FibonaciCalculatorRecursive");
        if(k<intUntil)
        {
            listFibonaci.add(k);
            k= fibonaciNextInSeriesCalculator.getNextFibonaci(i,j);
            i=j;
            j=k;   
            calculateFibo(intUntil, listFibonaci, i, j, k);
        }
        return listFibonaci;
    }
    
}