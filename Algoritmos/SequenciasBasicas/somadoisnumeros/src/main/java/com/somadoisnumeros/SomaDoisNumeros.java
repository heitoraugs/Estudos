/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.somadoisnumeros;

import java.util.Scanner;

/**
 *
 * @author Augs_
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
