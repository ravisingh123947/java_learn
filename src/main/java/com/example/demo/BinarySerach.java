package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySerach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,6,10,13,16));
        int foundAtIndex = binarySearch(list,20);
        if(foundAtIndex == -1) {
            System.out.println("element not found in list");
        }else {
            System.out.println("element found at index: " + foundAtIndex);
        }
    }

    public static int binarySearch(List<Integer> list,int elementToSearch) {
        int start = 0;
        int end = list.size() -1;
        int mid = (start + end)/2;
        while(start <= end) {
            if(elementToSearch == list.get(mid)) {
                return mid;
            }else if (elementToSearch < list.get(mid)) {
                end = mid -1;
            } else if (elementToSearch > list.get(mid)) {
                start = mid + 1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
}
