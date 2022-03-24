/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saudacao;

import java.util.Scanner;

/**
2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
 */
public class SaudacaoBoasVindas {
    
    public static void main(String[] args) {
        Scanner entradaNome = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome? ");
        String nome = entradaNome.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
    
}
