package com.blitznihar.fibo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fibonaci implements IFibonaci {
public Fibonaci() {
    System.out.println("Fibonaci");
}
    @Autowired
    private IFibonaciCalculator fibonaciCalculatorRecursive;

    @Override
    public List<Integer> getFiboUntil(int intUntil) {
        ArrayList<Integer> listFibonaci = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int k = 0; 
        
        
        return fibonaciCalculatorRecursive.calculateFibo(intUntil, listFibonaci, i, j, k);
    }

    public static void print(List<Integer> fibo){
        for (Integer x : fibo) {
            System.out.println(x);    
        }
    }
}