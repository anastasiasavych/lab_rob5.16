package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int randomN1 = (int)(Math.random()*3+1);
        int randomN2 = (int)(Math.random()*3+1);
        int randomN3 = (int)(Math.random()*3+1);

        int i = 0;
        int j = 3;
        while(i!=3){
            i++;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введіть 1-ше ціле число в проміжку[1;3]: ");
            int n1 = scan.nextInt();
            System.out.print("Введіть 2-ге ціле число в проміжку[1;3]: ");
            int n2 = scan.nextInt();
            System.out.print("Введіть 3-тє ціле число в проміжку[1;3]: ");
            int n3 = scan.nextInt();
            if(randomN1%1==0 && randomN2%1==0 && randomN3%1==0){
                    if(randomN1 == n1 && randomN2 == n2 && randomN3 == n3){
                        System.out.println("Ви відгадали послідовність!");
                        break;
                    }
                    else if(randomN1 != n1 | randomN2 != n2 | randomN3 != n3){
                        j--;
                        System.out.println("Ви помилились! К-сть спроб: " + j);
                    }
            }else{
                    System.out.println("Введене число(-а) розміщенні поза проміжком! К-сть спроб: " + j);
            }
        }
    }
}
