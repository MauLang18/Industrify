/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entities.Producto;
import entities.TipoMovimiento;

/**
 *
 * @author MauriceLang18
 */
public interface IProductoServices {
    void mostrarCatalogo();
    void agregarProducto(Producto producto);
    void actualizarProducto(String codigo, Producto productoActualizar);
    void eliminarProducto(String codigo);
    void registrarEntradaSalida(String codigoProducto, int cantidad, TipoMovimiento tipoMovimiento);
}
