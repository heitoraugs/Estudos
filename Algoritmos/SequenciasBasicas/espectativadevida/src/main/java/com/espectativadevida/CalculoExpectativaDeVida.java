/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espectativadevida;

import java.util.Scanner;

/**
16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
 */
public class CalculoExpectativaDeVida {
    public static void main(String[] args) {
        
        int cigarrosPorDia;
        int anosFumando;
        int calculoExpVida;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Quantos cigarros você fuma por dia? ");
        cigarrosPorDia = leitor.nextInt();
        
        System.out.println("Há quanto tempo você fuma? ");
        anosFumando = leitor.nextInt();
        
        calculoExpVida = ((cigarrosPorDia * 10) * anosFumando) / 60;
        
        System.out.println("Com essa rotina, você já perdeu " + calculoExpVida + " dias de vida.");
                
    }
}
