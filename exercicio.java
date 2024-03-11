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
public class exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1,n2,n3,result ;
        
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();
        
        result = n1 * n2 * n3;
        
        System.out.printf("A multiplicação de %d x %d x %d = %d%n",n1,n2,n3,result);
        
    }
    
}
