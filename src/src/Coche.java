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
public class Coche extends Vehiculo {

    private int cilindraje;
    private String marca;
    private int modelo;

    public Coche(int cilindraje, String marca, int modelo, String color, String numSerie) {
        super(color, numSerie);
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    @Override
    public void pintar(String color) {
        super.pintar(color);
        System.out.println("Desde el hijo ejecute metodo pintar del padre");
    }

    
    public String ToString() {
        return this.getNumSerie()+ " "+ super.getColor()+ " ";
        
    }
    


}
