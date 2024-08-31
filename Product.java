/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meuprojeto;

import java.util.Scanner;

/**
 *
 * @author 1091392323055
 */
public class Product {
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        
        int n1, n2, n3, prod;
        
        System.out.print("informe o numero 1: ");
        n1 = input.nextInt();
        System.out.print("informe o numero 2: ");
        n2 = input.nextInt();
        System.out.print("informe o numero 3: ");
        n3 = input.nextInt();
        
        prod = n1* n2 * n3;
        
        System.out.printf("produto de %d x %d x %d = %d",n1,n2,n3,prod);
        
        
    }
}
