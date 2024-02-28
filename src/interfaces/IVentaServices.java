/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entities.Venta;

/**
 *
 * @author MauriceLang18
 */
public interface IVentaServices {
    void mostrarCatalogo();
    void agregarVenta(Venta venta);
    void actualizarVenta(int codigo, Venta ventaActualizar);
    void eliminarVenta(int codigo);
}
