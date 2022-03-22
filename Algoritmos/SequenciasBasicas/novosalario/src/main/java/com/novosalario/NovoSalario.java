package com.novosalario;import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * 13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre
 * o seu novo salário, com 15% de aumento.
 */
public class NovoSalario {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-----CALCULO DE AUMENTO DE 15%-----");
        System.out.println("Informe o salário do funcionário: R$ ");
        var salario = leitor.nextLine();
        
        Float salarioConvertFloat = Float.parseFloat(salario);
        
        var calculoAumento = salarioConvertFloat + (salarioConvertFloat * 15 /100);
        
        System.out.println("O salário com aumento de 15%, será de R$: " + calculoAumento);
    }

}
