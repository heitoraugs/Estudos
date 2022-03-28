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
        var valorA = leitor.nextInt();

        System.out.println("Informe o valor de B: ");
        var valorB = leitor.nextInt();

        System.out.println("Informe o valor de C: ");
        var valorC = leitor.nextInt();

        var calculoDelta = (Math.pow(valorB, 2) - (4 * valorA) * valorC);              
        var calculoXNegativo = (-(valorB) - Math.sqrt(calculoDelta)) / (2 * valorA);
        var calculoXPositivo = (-(valorB) + Math.sqrt(calculoDelta)) / (2 * valorA);
        
        System.out.println("Os resultados possiveis para essa equação: Positivo " + calculoXPositivo + "\tNegativo: " + calculoXNegativo);
        System.out.println(calculoDelta);
    }
}
