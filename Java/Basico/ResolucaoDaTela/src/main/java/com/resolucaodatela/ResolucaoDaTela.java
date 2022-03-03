/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.resolucaodatela;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Augs_
 */
public class ResolucaoDaTela {
    
    public static void main(String[] args) {
        Dimension dimensaoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("O tamanho da tela é: " + dimensaoDaTela.width + " pixels de largura e " + dimensaoDaTela.height + " pixels de altura.");
    }
    
}
