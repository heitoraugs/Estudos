/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.funcionario;

import java.util.Scanner;

/**
 *
 * @author Augs_
 */
public class FuncionarioNomeSalario {

    public static void main(String[] args) {
                
        System.out.println("Digite o nome do funcionário: ");;
        Scanner entradaNome = new Scanner(System.in);
        String nomeFuncionario = entradaNome.nextLine();
//        System.out.println(nomeFuncionario);;
        System.out.println("Digite o salario do funcionário: ");
        Scanner entradaSalario = new Scanner(System.in);
        String salarioFuncionario = entradaSalario.nextLine();
//        System.out.println(salarioFuncionario);
        System.out.println(
                "Nome do funcionário: " + nomeFuncionario + 
                "\nSalário: " + salarioFuncionario +
                "\nO funcionário " + nomeFuncionario + " tem um salário de R$" + salarioFuncionario + " em Junho.");
    }
}
