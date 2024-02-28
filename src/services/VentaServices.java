/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Venta;
import interfaces.IVentaServices;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MauriceLang18
 */
public class VentaServices implements IVentaServices {

    private List<Venta> ventas;

    public VentaServices(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public VentaServices() {
    }

    @Override
    public void mostrarCatalogo() {
        for (int i = 0; i < ventas.size(); i++) {
            JOptionPane.showMessageDialog(null, ventas.get(i).toString());
        }
    }

    @Override
    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    @Override
    public void actualizarVenta(int codigo, Venta ventaActualizar) {
        for (int i = 0; i < ventas.size(); i++) {
            Venta venta = ventas.get(i);
            if (venta.getNumventa() == (codigo)) {
                ventas.set(i, ventaActualizar);
                return;
            }
        }
        System.out.println("La venta con el número " + codigo + " no fue encontrada en la lista de ventas.");

    }

    @Override
    public void eliminarVenta(int codigo) {
        ventas.removeIf(elemento -> (elemento instanceof Venta) && ((Venta) elemento).getNumventa()==(codigo));
    }

}
