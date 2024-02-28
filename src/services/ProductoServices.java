/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.MovimientoInventario;
import entities.Producto;
import entities.TipoMovimiento;
import interfaces.IProductoServices;
import java.util.List;

/**
 *
 * @author MauriceLang18
 */
public class ProductoServices implements IProductoServices{
    private List<Producto> productos;

    public ProductoServices(List<Producto> productos) {
        this.productos = productos;
    }
    
    public ProductoServices() {
    }

    @Override
    public void mostrarCatalogo() {
        if (productos.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de productos:");
            for (Producto producto : productos) {
                producto.mostrarDetalles();
                System.out.println("-----------------------------");
            }
        }
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void actualizarProducto(String codigo, Producto productoActualizar) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto instanceof Producto && ((Producto) producto).getCodigoIdentificador().equals(codigo)) {
                productos.set(i, productoActualizar);
                return;
            }
        }
        System.out.println("El producto con el código " + codigo + " no fue encontrado en el catálogo.");
    }

    @Override
    public void eliminarProducto(String codigo) {
        productos.removeIf(elemento -> (elemento instanceof Producto) && ((Producto) elemento).getCodigoIdentificador().equals(codigo));
    }
    
    @Override
    public void registrarEntradaSalida(String codigoProducto, int cantidad, TipoMovimiento tipoMovimiento) {
        for (Producto producto : productos) {
            if (producto.getCodigoIdentificador().equals(codigoProducto)) {
                MovimientoInventario movimiento = new MovimientoInventario(codigoProducto, cantidad, tipoMovimiento);
                producto.agregarMovimiento(movimiento);
                return;
            }
        }
        System.out.println("El producto con el código " + codigoProducto + " no fue encontrado.");
    }
}