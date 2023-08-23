/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3;
import java.util.Scanner;
/**
 *
 * @author jerjo
 */
public class ImputManager {
    
    private  Scanner scanner;

    public ImputManager() {
        scanner = new Scanner(System.in);
    }

    public String solicitarNombreIglesia() {
        System.out.print("nombre de la iglesia: ");
        return scanner.nextLine();
    }

    public String solicitarNombrePastor() {
        System.out.print(" nombre del pastor: ");
        return scanner.nextLine();
    }

    public int solicitarCantidadFeligreses() {
        System.out.print(" cantidad de feligreses que va a introducir: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String solicitarNombreFeligres(int numFeligres) {
        System.out.print("nombre del feligrés " + numFeligres + ": ");
        return scanner.nextLine();
    }

    public String solicitarCedulaFeligres(int numFeligres) {
        System.out.print(" cédula del feligrés " + numFeligres + ": ");
        return scanner.nextLine();
    }

    public double solicitarDiezmoFeligres(int numFeligres) {
        System.out.print(" diezmo del feligrés " + numFeligres + ": ");
        return Double.parseDouble(scanner.nextLine());
    }
}

