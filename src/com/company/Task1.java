package com.company;

public class Task1 {

    public static void main(String[] args) {
	int n = (int)Math.round((Math.random()*41)-20);
    if(n>0){
        System.out.print("Результат: " + n);
    }else{
        System.out.print("Дане число не є натуральним!");
    }
    }
}
