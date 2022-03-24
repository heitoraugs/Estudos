/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculodolar;

import java.util.Scanner;

/**
9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */
public class CalculoDolarEmCarteira {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Vamos calcular quantos dolares você pode comprar!\nInforme quantos reais você tem: ");
        String reais = leitor.nextLine();
        
        float reaisConvertido = Float.parseFloat(reais);
        double cotacaoDolar = 3.45;
        
        float conversao = (float) (reaisConvertido / cotacaoDolar);
       
        System.out.println("Com " + reaisConvertido + "R$, você poderá comprar " + conversao + " dólares.");
       
    }
    
}
