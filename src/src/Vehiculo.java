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
public class Vehiculo {

    private String color;
    private String numSerie;

    public Vehiculo(String color, String numSerie) {
        this.color = color;
        this.numSerie = numSerie;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.getNumSerie() + " " + this.getColor();
    }

    public void pintar(String color) {
        this.color = color;
        System.out.println("Vehiculo pintado");
    }

    
}
