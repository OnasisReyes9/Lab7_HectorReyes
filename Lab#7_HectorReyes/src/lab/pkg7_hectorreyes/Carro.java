/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_hectorreyes;

import java.io.Serializable;

/**
 *
 * @author Onasis Reyes
 */
public class Carro implements Serializable {

    private static final long SerialVersionUID = 777L;

    private String placa, tamaño;
    private int numPuertas, nvlSucio;

    public Carro() {
    }

    public Carro(String placa, String tamaño, int numPuertas, int nvlSucio) {
        this.placa = placa;
        this.tamaño = tamaño;
        this.numPuertas = numPuertas;
        this.nvlSucio = nvlSucio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNvlSucio() {
        return nvlSucio;
    }

    public void setNvlSucio(int nvlSucio) {
        this.nvlSucio = nvlSucio;
    }

    @Override
    public String toString() {
        return "placa=" + placa + ", tama\u00f1o=" + tamaño + ", numPuertas=" + numPuertas + ", nvlSucio=" + nvlSucio;
    }

}
