package com.example.beanlearn;

import org.springframework.stereotype.Component;

@Component
public class Bubblesort implements SortingAlgo {
    public int[] sort(int[] a) {
        System.out.println("bubble");
        return(new int[]{1,2,3});
    }
}
