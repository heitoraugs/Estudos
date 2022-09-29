package com.anobissexto;

import java.util.Scanner;

/**
 *21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.
 * @author https://github.com/heitoraugs
 */
public class calculoAnoBissexto {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um ano e descubra se ele é Bissexto! ");
        String anoString = leia.nextLine();
        int ano = Integer.parseInt(anoString);
        
        if(((ano%4==0)&&(ano%100!= 0))||ano%400==0) {
            System.out.println("Esse ano é bissexto");
        } else {
          System.out.println("Esse ano não é bissexto");
        }
    }
}
