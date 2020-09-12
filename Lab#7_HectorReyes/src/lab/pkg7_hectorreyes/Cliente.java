/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_hectorreyes;

import java.util.ArrayList;

/**
 *
 * @author Onasis Reyes
 */
public class Cliente extends Persona {

    private ArrayList<Carro> carros = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public void añadirCarro(Carro carro) {
        carros.add(carro);
    }

    @Override
    public String toString() {
        return "Cliente{" + "carros=" + carros + '}';
    }

}
