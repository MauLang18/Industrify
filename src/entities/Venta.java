/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author MauriceLang18
 */
public class Venta {
    private int fecha;
    private int monto;
    private int numventa;
    private String metpago;

    public Venta(int fecha, int monto, int numventa, String metpago) {
        this.fecha = fecha;
        this.monto = monto;
        this.numventa = numventa;
        this.metpago = metpago;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumventa() {
        return numventa;
    }

    public void setNumventa(int numventa) {
        this.numventa = numventa;
    }

    public String getMetpago() {
        return metpago;
    }

    public void setMetpago(String metpago) {
        this.metpago = metpago;
    }
    
    @Override
    public String toString() {
        return "Venta"
                + "Fecha de la compra=" + fecha 
                + ", monto pagado=" + monto 
                + ", numero de venta=" + numventa 
                + ", metodo de pago=" + metpago;
    }
}
