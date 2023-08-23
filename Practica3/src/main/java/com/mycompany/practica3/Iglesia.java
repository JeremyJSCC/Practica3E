/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3;
import java.util.ArrayList;
/**
 *
 * @author jerjo
 */
public class Iglesia {
    private String nombre;
    private String pastor;
    private ArrayList<Felingres> feligreses;

    public Iglesia(String nombre, String pastor) {
        this.nombre = nombre;
        this.pastor = pastor;
        this.feligreses = new ArrayList<>();
    }

    public void agregarFeligres(String nombre, String cedula, double diezmo) {
        Felingres feligres = new Felingres(nombre, cedula, diezmo);
        feligreses.add(feligres);
    }

    public double calcularGanancias() {
        double totalGanancias = 0;
        for (Felingres feligres : feligreses) {
            totalGanancias += feligres.getDiezmo();
        }
        return totalGanancias;
    }

    public double calcularImpuestoMunicipalidad() {
        return calcularGanancias() * 0.09;
    }

    public double calcularImpuestoComedor() {
        return calcularGanancias() * 0.21;
    }

    public double calcularGananciaPastor() {
        return calcularGanancias() * 0.7;
    }

    public ArrayList<Felingres> obtenerFeligresConDiezmoCero() {
        ArrayList<Felingres> feligresesConDiezmoCero = new ArrayList<>();
        for (Felingres feligres : feligreses) {
            if (feligres.getDiezmo() == 0) {
                feligresesConDiezmoCero.add(feligres);
            }
        }
        return feligresesConDiezmoCero;
    }

    public ArrayList<Felingres> obtenerFeligresConDiezmoMayorA100000() {
        ArrayList<Felingres> feligresesConDiezmoMayorA100000 = new ArrayList<>();
        for (Felingres feligres : feligreses) {
            if (feligres.getDiezmo() > 100000) {
                feligresesConDiezmoMayorA100000.add(feligres);
            }
        }
        return feligresesConDiezmoMayorA100000;
    }

    public void generarInforme() {
        System.out.println("Información de la iglesia " + nombre + ":");
        System.out.println("Monto total de ganancias de la iglesia: " + calcularGanancias());
        System.out.println("Monto para la municipalidad (infraestructura): " + calcularImpuestoMunicipalidad());
        System.out.println("Monto para el comedor municipal: " + calcularImpuestoComedor());
        System.out.println("Monto de ganancia para el pastor: " + calcularGananciaPastor());

        ArrayList<Felingres> feligresesConDiezmoCero = obtenerFeligresConDiezmoCero();
        System.out.println("Feligreses con diezmo igual a 0:");
        for (Felingres feligres : feligresesConDiezmoCero) {
            System.out.println(feligres.getNombre() + " - Cédula: " + feligres.getCedula());
        }

        ArrayList<Felingres> feligresesConDiezmoMayorA100000 = obtenerFeligresConDiezmoMayorA100000();
        System.out.println("Feligreses con diezmo mayor a 100000:");
        for (Felingres feligres : feligresesConDiezmoMayorA100000) {
            System.out.println(feligres.getNombre() + " - Cédula: " + feligres.getCedula());
        }
    }
}
