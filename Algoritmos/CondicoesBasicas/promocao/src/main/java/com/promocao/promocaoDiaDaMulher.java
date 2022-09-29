package com.promocao;

import java.util.Scanner;

/**
 *23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto
 * @author https://github.com/heitoraugs
 */
public class promocaoDiaDaMulher {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Promoção exclusiva para o Dia da Mulher!");
        System.out.println("Informe o seu nome: ");
        String nome = leia.nextLine();
        
        System.out.println("Informe o seu gênero: F ou M ");
        String gen = leia.nextLine();
        
        System.out.println("Informe o valor das compras: ");
        int compras = Integer.parseInt(leia.nextLine());
        
        if ("F".equals(gen)) {
            float comprasDesconto = compras * 0.13f;
            System.out.println(nome + " a sua compra terá um desconto 13%, totalizando o valor de R$  " + (compras - comprasDesconto));
        } else if ("M".equals(gen)) {
            float comprasDesconto = compras * 0.05f;
           System.out.println(nome + " a sua compra terá um desconto 5%, totalizando o valor de R$  " + (compras - comprasDesconto));
        } else
            System.out.println("Tente novamente!");
    }
}
