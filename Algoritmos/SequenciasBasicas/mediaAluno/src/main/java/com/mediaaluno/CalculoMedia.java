package com.mediaaluno;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
 */
public class CalculoMedia {
    
    public static void main(String[] args) {
         
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Informe a primeira nota: ");
        var nota1 = leitor.nextLine();
        
        System.out.println("Informe a segunda nota: ");
        var nota2 = leitor.nextLine();
        
        Float nota1Real = Float.parseFloat(nota1);
        Float nota2Real = Float.parseFloat(nota2);
        
        Float calculoMedia = (nota1Real + nota2Real) / 2;
        
        System.out.println("A média entre as duas notas é: " + calculoMedia);
        
    }
    
}
