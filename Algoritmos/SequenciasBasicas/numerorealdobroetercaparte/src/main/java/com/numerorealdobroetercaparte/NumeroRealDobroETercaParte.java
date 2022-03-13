/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numerorealdobroetercaparte;

import java.util.Scanner;

/**
 *
 * @author Augs_
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
