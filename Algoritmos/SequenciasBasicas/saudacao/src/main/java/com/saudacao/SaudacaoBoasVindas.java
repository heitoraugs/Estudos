/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saudacao;

import java.util.Scanner;

/**
 *
 * @author Augs_
 */
public class SaudacaoBoasVindas {
    
    public static void main(String[] args) {
        Scanner entradaNome = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome? ");
        String nome = entradaNome.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
    
}
