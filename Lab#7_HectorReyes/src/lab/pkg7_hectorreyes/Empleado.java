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
public class Empleado extends Persona {

    ArrayList<Carro> carrosLavar = new ArrayList();

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public ArrayList<Carro> getCarrosLavar() {
        return carrosLavar;
    }

    public void setCarrosLavar(ArrayList<Carro> carrosLavar) {
        this.carrosLavar = carrosLavar;
    }
    
   public void añadirCarroLavar(Carro carro){
       carrosLavar.add(carro);
   }
    
    @Override
    public String toString() {
        return "Empleado{" + "carrosLavar=" + carrosLavar + '}';
    }

}
