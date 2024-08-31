/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.meuprojeto;

import java.util.Scanner;

/**
 *
 * @author 1091392323055
 */
public class MeuProjeto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        int number1, number2, soma;
        
        System.out.print("Digite o primeiro número: ");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        number2 = input.nextInt();
        
        soma = number1 + number2;
        
        //System.out.print("Soma: "+ soma);
        
        if (number1 == number2)
            System.out.printf("%d == %d \n",number1,number2);
        
        if (number1 > number2)
            System.out.printf("%d > %d \n",number1,number2);
        
        if (number1 != number2)
            System.out.printf("%d != %d \n",number1,number2);
        
        if (number1 < number2)
            System.out.printf("%d < %d \n",number1,number2);
        
        if (number1 <= number2)
            System.out.printf("%d <= %d \n",number1,number2);
        
        if (number1 >= number2)
            System.out.printf("%d >= %d \n",number1,number2);
            
        
        
        
    }
}
