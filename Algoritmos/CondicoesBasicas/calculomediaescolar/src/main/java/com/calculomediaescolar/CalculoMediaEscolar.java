package com.calculomediaescolar;

import java.net.Socket;
import java.util.Scanner;

/**
 *19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).

 * @author https://github.com/heitoraugs
 */
public class CalculoMediaEscolar {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float nota1;
        float nota2;
        float calculoMedia;
        String nomeAluno;
        
        System.out.println("Informe o nome do aluno: ");
        nomeAluno = leitor.nextLine();
        System.out.println("Informe a primeira nota: ");
        nota1 = leitor.nextFloat();
        System.out.println("Informe a segunda nota: ");
        nota2 = leitor.nextFloat();
        
        calculoMedia = (nota1 + nota2) / 2;
        
        if (calculoMedia > 7) {
            System.out.println("A média do aluno, " + nomeAluno + " foi de " + calculoMedia + ", seu aproveitamento foi acima da média!");
            
        }
    }
    
    
}
