package com.company;

public class Task3 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*102);
        System.out.println("Згенероване число: " + num);
        int l = Integer.toString(num).length();
        System.out.print("К-сть цифр: " + l );


    }
}
