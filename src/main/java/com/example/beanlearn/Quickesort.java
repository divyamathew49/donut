package com.example.beanlearn;

import org.springframework.stereotype.Component;
@Component
public class Quickesort implements SortingAlgo{
    public int[] sort(int[] a) {
        System.out.println("quick");
        return(new int[]{1,2,3});
    }
}
