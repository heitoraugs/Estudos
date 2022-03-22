/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.precopromocional;

import java.util.Scanner;

/**
12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.
 */
public class CalculoPrecoPromocional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("-----5% DE DESCONTO EM TODOS OS PRODUTOS!-----");
        System.out.println("Informe o preço do produto: ");
        String precoProdt = leitor.nextLine();
        
        float precoProdtConvertido = Float.parseFloat(precoProdt);
        float porcentagem = 5;
        
        float calculoDesconto = precoProdtConvertido + (precoProdtConvertido * porcentagem /100);
        
        System.out.println("O novo preço do produto é: R$" + calculoDesconto);
        
        
    }
}
