package com.example.beanlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    SortingAlgo sortingAlgo;

    public BinarySearchImpl(SortingAlgo sortingAlgo) {
        this.sortingAlgo = sortingAlgo;
    }

    int binarySearch(int[] a, int x)
    {
        //sort could be any
        sortingAlgo.sort(a);
        //search
        return 2;
    }
}
