package com.parouimpar;

import java.util.Scanner;

/**
 * 20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR
 * ou ÍMPAR.
 *
 * @author https://github.com/heitoraugs
 */
public class ParOuImpar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = leitor.nextInt();

        if (numero % 2 == 0) {

            System.out.println("O número " + numero + " é par.");

        }
          if (numero % 2 == 1) {

            System.out.println("O número " + numero + " é impar.");

        }
    }
}
