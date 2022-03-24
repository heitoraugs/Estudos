
package com.somadoisnumeros;

import java.util.Scanner;

/**
4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
 */
public class SomaDoisNumeros {
    
    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("VAMOS SOMAR!"
                + "\nDigite um valor: ");
        String numero1 = leitor.nextLine();
//        System.out.println(numero1);
        System.out.println("Digite outro valor: ");
        String numero2 = leitor.nextLine();
//        System.out.println(numero2);     

        int numero1Convertido = Integer.parseInt(numero1);
        int numero2Convertido = Integer.parseInt(numero2);
   
        int soma = numero1Convertido + numero2Convertido;
//      int soma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
        
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " é igual a " + soma);
              
        
    }
    
}
