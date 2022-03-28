package com.elegivelparavotar;

import java.util.Scanner;

/**
 * 18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a
 * idade dela e depois mostre se ela pode ou não votar.
 *
 * @author https://github.com/heitoraugs
 */
public class ElegivelParaVotar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int anoNasc;
        int anoAtual = 2022;
        int calculoIdade;

        System.out.println("-----VOCÊ PODE VOTAR?-----");
        System.out.println("Em que ano você nasceu? ");
        anoNasc = leitor.nextInt();

        calculoIdade = anoAtual - anoNasc;

        if (calculoIdade < 18) {

            System.out.println("Você tem " + calculoIdade + " anos de idade. Você ainda não pode votar.");
        }

        if (calculoIdade >= 18) {
            System.out.println("Você tem " + calculoIdade + " anos de idade. Você já pode votar!");
        }
    }
}
