/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locadoradecarros;

import java.util.Scanner;

/**
14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */
public class CalculoLocadoraDeCarros {
    public static void main(String[] args) {
        
        Scanner leitor =  new Scanner(System.in);
        
        double kmRodado;
        int diasAlugado;
        double calculoTotalAluguel;
        double valorBasekm = 0.2;
        double valorBaseAluguel = 90.0;
              
        System.out.println("------CALCULO DE ALUGUEL DE CARRO(Km POR DIA)----");
        System.out.println("Informe os Km percorridos: ");
        kmRodado = leitor.nextDouble();
        
        System.out.println("Informe os total de dias alugado: ");
        diasAlugado = leitor.nextInt();
        
        calculoTotalAluguel = (kmRodado * valorBasekm) + (diasAlugado * valorBaseAluguel);
        
        System.out.println("O valor a ser pago, por " + diasAlugado + " dias de aluguel e " + kmRodado + "Km percorridos: R$" + calculoTotalAluguel);
        
        
    }
}
