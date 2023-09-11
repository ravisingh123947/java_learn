package com.example.demo;

public class Watch {
    public static void main(String[] args) {
        int n = 9;
        for(int i =n;i>=1;i--) {
            for(int k=1;k<n-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=2;i<=n;i++) {
           for(int p=1;p<=n-i;p++) {
               System.out.print(" ");
           }
           for(int p=1;p<=2*i-1;p++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
