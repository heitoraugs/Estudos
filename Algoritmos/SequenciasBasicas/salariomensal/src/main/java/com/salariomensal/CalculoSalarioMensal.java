/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salariomensal;

import java.util.Scanner;

/**
15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.
 */
public class CalculoSalarioMensal {
    
    public static void main(String[] args) {
        
        int diasTrabalhados;
        int horasTrabalhadas = 8;
        double valorDaHora = 25.0;
        double calculoSalario;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-----CALCULO DE SALÁRIO-----");
        System.out.println("Informe os dias trabalhados nesse mês: ");    
        diasTrabalhados = leitor.nextInt();
        
        calculoSalario = diasTrabalhados * (horasTrabalhadas * valorDaHora);
        
        System.out.println("O salário desse mês será de: R$" + calculoSalario);
    }
    
}
