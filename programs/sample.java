package com.spm.androidtesting.di;

public class sample {
    static int n = 4;
    public static void main(String[] args) {
        if (n <= 3) {
            System.out.println(n);
        } else {
            System.out.println((n - 1) + (n - 2));
        }
    }
}

