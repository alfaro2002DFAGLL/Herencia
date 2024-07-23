/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Daniel Alfaro
 */
public class Principal {

    public static void main(String[] args) {

        Coche c = new Coche(2000, "Chevrolet", 2023, "Negro", "123456");

        System.out.println("Parametros Vehiculo: " + c.toString());
        c.pintar("Azul");
        System.out.println("Parametros Vehiculo despues de pintar: " + c.toString());
        
        
    }

}
