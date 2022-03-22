package com.calculopintura;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */
public class CalculoPintura {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("---------CALCULO DE RENDIMENTO DE TINTA---------");
        
        System.out.println("Qual a altura da parede? ");
        var altura = leitor.nextLine();
        
        System.out.println("Qual a largura da parede? ");
        var largura = leitor.nextLine();
        
        Float alturaConvertido = Float.parseFloat(altura);
        Float larguraConvertido = Float.parseFloat(largura);
        
        Float calculoArea = alturaConvertido * larguraConvertido;
        Float calculoRendimento = calculoArea / 2;
        
        System.out.println("A área a ser pintada é de " + calculoArea + "m²");
        System.out.println("O rendimento da tinta utilizada será de: " + calculoRendimento + "m², para cada litro." );
        
    }
}
