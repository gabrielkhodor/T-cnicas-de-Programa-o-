/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author 1091392323055
 */
public class Comparacao {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1, n2;
        
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o primeiro número: ");
        n2 = input.nextInt();
        
        if (n1 == n2) 
            System.out.printf("%d == %d%n",n1, n2);
        
        if (n1 != n2) 
            System.out.printf("%d != %d%n",n1, n2);
        
        if (n1 < n2) 
            System.out.printf("%d < %d%n",n1, n2);
        
        if (n1 > n2) 
            System.out.printf("%d > %d%n",n1, n2);
            
        if (n1 <= n2) 
            System.out.printf("%d <= %d%n",n1, n2);
        
        if (n1 >= n2) 
            System.out.printf("%d >= %d%n",n1, n2);
        }
        
    }
    
}
