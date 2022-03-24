package com.multaporvelocidade;

import java.util.Scanner;

/**

 17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

 * @author https://github.com/heitoraugs
 */
public class CalculoVelocidade {
    public static void main(String[] args) {

        int velocidade;
        int calculoMulta;
        int limiteVelocidade = 80;

        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("-----ATENÇÃO! - VELOCIDADE MÁXIMA 80KM-----");
        System.out.println("Informe a sua velocidade em km: ");
        velocidade = leitor.nextInt();
        
        if (velocidade > limiteVelocidade) {           
            calculoMulta = (velocidade - limiteVelocidade) * 5;
            System.out.println("Devido o seu excesso de velocidade, você foi multado em R$" + calculoMulta);
        }
    }
      
}
