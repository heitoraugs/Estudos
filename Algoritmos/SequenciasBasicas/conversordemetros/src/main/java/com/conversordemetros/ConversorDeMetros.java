/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversordemetros;

import java.util.Scanner;

/**
 *
 * @author Augs_
 */
public class ConversorDeMetros {
    
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
        
       System.out.println("Digite uma distância em metros: ");
       String metros = leitor.nextLine();
        
       float metrosConvertido = Float.parseFloat(metros);
        
//     CALCULOS DE CONVERSÃO
       float calculoKm = metrosConvertido / 1000;
       float calculoHm = metrosConvertido / 100; //Hectômetro
       float calculoDam = metrosConvertido / 10; //Decâmetro
       float calculoDm = metrosConvertido * 10; //Decímetro 
       float calculoCm = metrosConvertido * 100; //Centímetro  
       float calculoMm = metrosConvertido * 1000; //Milímetro  
       
       
        System.out.println("A distância de " + metrosConvertido + "m corresponde a: ");
        System.out.println(
        calculoKm + "Km\n" +
        calculoHm + "Hm\n" +
        calculoDam + "Dam\n" +
        calculoDm + "dm\n" +
        calculoCm + "cm\n" +
        calculoMm + "mm\n");
    }
    
}
