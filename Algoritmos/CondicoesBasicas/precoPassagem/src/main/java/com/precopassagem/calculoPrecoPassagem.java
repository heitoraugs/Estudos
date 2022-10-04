package com.precopassagem;

import java.util.Scanner;

/**
 *24) Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.

 * @author https://github.com/heitoraugs
 */
public class calculoPrecoPassagem {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        float kmViagem;
        float valorPassagem;
        
        System.out.println("Informe a distância da viagem em Km:");
        kmViagem = leia.nextFloat();
                
        if (kmViagem <= 200) {
            valorPassagem = (float) (kmViagem * 0.50);
            System.out.println("O valor total da passagem será de R$" + valorPassagem);
        } else {
            valorPassagem = (float) (kmViagem * 0.45);
            System.out.println("O valor total da passagem será de R$" + valorPassagem);
        }
    }
}
