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
public class AdministrarCliente {

    private ArrayList<Cliente> clientes = new ArrayList();
    private File archivo = null;

    public AdministrarCliente() {
    }

    public AdministrarCliente(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void añadirCliente(Cliente cliente){
        clientes.add(cliente);
    }
        
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarCliente{" + "clientes=" + clientes + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            clientes = new ArrayList();
            Cliente numRac;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((numRac = (Cliente) objeto.readObject()) != null) {
                        clientes.add(numRac);
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
            for (Cliente c : clientes) {
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
