/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

/**
 *
 * @author jerjo
 */
public class Practica3 {

    public static void main(String[] args) {
    ImputManager inputManager = new ImputManager();

        String nombreIglesia = inputManager.solicitarNombreIglesia();
        String nombrePastor = inputManager.solicitarNombrePastor();
        Iglesia iglesia = new Iglesia(nombreIglesia, nombrePastor);

        int cantidadFeligreses = inputManager.solicitarCantidadFeligreses();
        for (int i = 0; i < cantidadFeligreses; i++) {
            String nombreFeligres = inputManager.solicitarNombreFeligres(i + 1);
            String cedulaFeligres = inputManager.solicitarCedulaFeligres(i + 1);
            double diezmoFeligres = inputManager.solicitarDiezmoFeligres(i + 1);

            iglesia.agregarFeligres(nombreFeligres, cedulaFeligres, diezmoFeligres);
        }

        iglesia.generarInforme();
    }
}
