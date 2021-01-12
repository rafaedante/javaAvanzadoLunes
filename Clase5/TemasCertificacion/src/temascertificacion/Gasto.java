/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temascertificacion;

/**
 *
 * @author rafaeli
 */
public class Gasto {
    
    private String tipoGasto;
    private int importe;

    public Gasto(String tipoGasto, int importe) {
        this.tipoGasto = tipoGasto;
        this.importe = importe;
    }

    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    
    
    
}
