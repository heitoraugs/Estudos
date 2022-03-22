/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.antecessoresucessor;

import java.util.Scanner;

/**
6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
 */
public class AntecessorESucessor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número: ");
        String numero = leitor.next();

        var numConvertInt = Integer.parseInt(numero);
        
        int numeroAntecessor = numConvertInt - 1;
        int numeroSucessor = numConvertInt + 1;
       
        System.out.println("O antecessor de " + numero + " é " + numeroAntecessor +
                "\nO sucessor de " + numero + " é " + numeroSucessor);
    }

}
