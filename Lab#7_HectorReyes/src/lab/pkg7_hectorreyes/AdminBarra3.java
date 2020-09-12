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
class AdminBarra3 {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public AdminBarra3(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public String toString() {
        return "AdminBarra3{" + "barra=" + barra + ", avanzar=" + avanzar + ", vive=" + vive + '}';
    }

}
