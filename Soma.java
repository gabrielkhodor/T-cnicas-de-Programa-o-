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
public class Soma {
    public static void main(String[] args) {
        //cria um scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in); //Entrada de dados
        int number1, number2, sum;
        
        System.out.print("Digite o primeiro número: ");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        //System.out.print("Soma" + sum);
        System.out.printf("A soma é %d%n",sum);
        
        
    }
    
}
