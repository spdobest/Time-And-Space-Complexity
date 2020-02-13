package com.spm.androidtesting.di;

public class sample1 {

    public static void main(String[] args) {
        int n = 2;
        int p = 1;

        int a = 2+3;                        // O(1) complexity

        for (int i=0; i<n; i++) {           // O(n) complexity

            for (int j=0; j<n; j++)  {      //O(n) complexity

                for (int k=0; k<n; k++) {   //O(n) complexity
                    System.out.println(p++);
                }
            }
        }
    }
}