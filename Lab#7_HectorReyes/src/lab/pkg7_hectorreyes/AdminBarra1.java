/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_hectorreyes;

import javax.swing.JProgressBar;

/**
 *
 * @author Onasis Reyes
 */
public class AdminBarra1 extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    
    public AdminBarra1() {
    }

    public AdminBarra1(JProgressBar barra) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public String toString() {
        return "AdminBarra1{" + "barra=" + barra + ", avanzar=" + avanzar + ", vive=" + vive + '}';
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100000000) {//100 000 000
                    vive = false;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                }
            }
        }
    }

}
