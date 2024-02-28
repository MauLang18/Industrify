/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDate;

/**
 *
 * @author MauriceLang18
 */
public class CuentaPorCobrar {
    private int numCuenta;
    private int monto;
    private LocalDate fecha;
    private boolean pagada;
    private String cliente;
    
    public CuentaPorCobrar(int numCuenta, int monto, LocalDate fecha, boolean pagada, String cliente) {
        this.numCuenta = numCuenta;
        this.monto = monto;
        this.fecha = fecha;
        this.pagada = pagada;
        this.cliente = cliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        return "CuentaPorCobrar{" +
                "numCuenta=" + numCuenta +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", pagada=" + pagada +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
