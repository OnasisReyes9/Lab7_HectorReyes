/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_hectorreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Onasis Reyes
 */
public class AdministrarCarro {

    private ArrayList<Carro> carros = new ArrayList();
    private File archivo = null;

    public AdministrarCarro() {
    }

    public AdministrarCarro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void añadirCarro(Carro carro) {
        carros.add(carro);
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarCarro{" + "carros=" + carros + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            carros = new ArrayList();
            Carro carro;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((carro = (Carro) objeto.readObject()) != null) {
                        carros.add(carro);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carro c : carros) {
                bw.writeObject(c);
            }
            bw.flush();
        } catch (IOException ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
    }

}
