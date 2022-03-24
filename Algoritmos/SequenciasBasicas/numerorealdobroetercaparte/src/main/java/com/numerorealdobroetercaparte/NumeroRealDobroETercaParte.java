/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numerorealdobroetercaparte;

import java.util.Scanner;

/**
7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
 */
public class NumeroRealDobroETercaParte {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        var numeroReal = leitor.nextLine();
        
        float numeroRealConvertido = Float.parseFloat(numeroReal);
        
        var dobroNumeroReal = numeroRealConvertido * 2;
        var tercaparteNumeroReal = numeroRealConvertido / 3;
        
        System.out.println("O dobro de " + numeroReal + " é " + dobroNumeroReal +
        "\nA terça parte de " + numeroReal + " é " + tercaparteNumeroReal);
    }
    
}
