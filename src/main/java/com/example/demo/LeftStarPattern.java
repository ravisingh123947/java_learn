package com.example.demo;

public class LeftStarPattern {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1;i<=7;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
