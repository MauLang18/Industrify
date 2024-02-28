/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entities.CuentaPorCobrar;
import java.time.LocalDate;

/**
 *
 * @author MauriceLang18
 */
public interface ICuentaPorCobrarServices {
    void agregarCuentaPorCobrar(CuentaPorCobrar cuenta);
    void registrarPago(int numCuenta, LocalDate fechaPago, int monto);
    void mostrarCuentasPorCobrar();
    void actualizarCuentaPorCobrar(int numCuenta, boolean pagada);
    void eliminarCuentaPorCobrar(int numCuenta);
}
