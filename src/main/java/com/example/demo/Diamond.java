package com.example.demo;

public class Diamond {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int m = 6;
        for(int i=m;i>=1;i--) {
            for(int k=n-i;k>=1;k--) {
                System.out.print(" ");
            }
            for(int y=2*i-1;y>=1;y--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
