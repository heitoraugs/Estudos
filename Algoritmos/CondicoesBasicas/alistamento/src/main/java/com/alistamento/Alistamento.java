package com.alistamento;

import java.util.Scanner;

/**
 *22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
 * @author https://github.com/heitoraugs
 */
public class Alistamento {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int anoAtual = 2022;
        int anosAlist;
        int anoNasc;
        int calculoIdade;
        
        System.out.println("Informe o ano em que nasceu e descobriremos se está apto para se alistar no exército: ");
        anoNasc = leitor.nextInt();
        
        calculoIdade = anoAtual - anoNasc;
        anosAlist = Math.abs(calculoIdade - 18);

        if (calculoIdade <= 18) {
            System.out.println("Você tem " + calculoIdade + " anos de idade e ainda não pode se alistar no exército. Em " + anosAlist + " ano(s), você poderá se alistar!" );  
        }
        
        if (calculoIdade > 18) {
            System.out.println("Você tem " + calculoIdade + " anos de idade e já está apto para se alistar. Já se passaram " + anosAlist + " ano(s) do seu alistamento.");
        }
        
    }
}
