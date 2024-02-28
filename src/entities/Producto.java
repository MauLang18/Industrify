/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MauriceLang18
 */
public class Producto{
    private String codigoIdentificador;
    private String descripcion;
    private int cantidadInventario;
    private double precio;
    private List<MovimientoInventario> movimientos;

    public Producto(String codigoIdentificador, String descripcion, int cantidadInventario, double precio) {
        this.codigoIdentificador = codigoIdentificador;
        this.descripcion = descripcion;
        this.cantidadInventario = cantidadInventario;
        this.precio = precio;
        this.movimientos = new ArrayList<>();
    }

    public List<MovimientoInventario> getMovimientos() {
        return movimientos;
    }

    public void agregarMovimiento(MovimientoInventario movimiento) {
        movimientos.add(movimiento);
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarDetalles() {
        System.out.println("Código: " + codigoIdentificador);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad en inventario: " + cantidadInventario);
        System.out.println("Precio: " + precio);
    }
}
