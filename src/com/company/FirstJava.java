package com.company;

import java.util.Scanner;

public class FirstJava {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n>=1){
            System.out.println(n+"\n");
            n--;
        }
    }



}
