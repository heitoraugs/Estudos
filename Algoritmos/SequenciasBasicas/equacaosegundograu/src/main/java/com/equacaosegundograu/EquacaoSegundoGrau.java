package com.equacaosegundograu;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * 11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
 * segundo grau e mostre o valor de Delta.
 */
public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("-----CALCULO EQUAÇÃO DE SEGUNDO GRAU-----");

        System.out.println("Informe o valor de A: ");
        var valorA = leitor.nextLine();

        System.out.println("Informe o valor de B: ");
        var valorB = leitor.nextLine();

        System.out.println("Informe o valor de C: ");
        var valorC = leitor.nextLine();

        int valorAInt = Integer.parseInt(valorA);
        int valorBInt = Integer.parseInt(valorB);
        int valorCInt = Integer.parseInt(valorC);

        var calculoDelta = (Math.pow(valorBInt, 2) - (4 * valorAInt) * valorCInt);              
        var calculoXNegativo = (-(valorBInt) - Math.sqrt(calculoDelta)) / (2 * valorAInt);
        var calculoXPositivo = (-(valorBInt) + Math.sqrt(calculoDelta)) / (2 * valorAInt);
        
        System.out.println("Os resultados possiveis para essa equação: Positivo " + calculoXPositivo + "\tNegativo: " + calculoXNegativo);
    }
}
