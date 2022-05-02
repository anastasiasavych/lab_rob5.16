package com.company;

public class Task2 {
    public static void main(String[] args) {
        int a = 3, b = 4;
        int c = (int)Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        int p = a+b+c;
        int s = (a*b)/2;
        System.out.println("Периметр: " + p);
        System.out.print("Площа: " + s);
    }
}
