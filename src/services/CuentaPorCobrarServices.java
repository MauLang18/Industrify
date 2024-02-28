/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.CuentaPorCobrar;
import interfaces.ICuentaPorCobrarServices;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author MauriceLang18
 */
public class CuentaPorCobrarServices implements ICuentaPorCobrarServices{
    private List<CuentaPorCobrar> cuentasPorCobrar;
    
    public CuentaPorCobrarServices(List<CuentaPorCobrar> cuentasPorCobrar) {
        this.cuentasPorCobrar = cuentasPorCobrar;
    }
    
    @Override
    public void agregarCuentaPorCobrar(CuentaPorCobrar cuenta) {
        cuentasPorCobrar.add(cuenta);
    }

    @Override
    public void registrarPago(int numCuenta, LocalDate fechaPago, int monto) {
        for (CuentaPorCobrar cuenta : cuentasPorCobrar) {
            if (cuenta.getNumCuenta() == numCuenta && !cuenta.isPagada()) {
                cuenta.setPagada(true);
                // Puedes agregar la lógica necesaria para manejar el monto y la fecha de pago si es necesario
                return;
            }
        }
        System.out.println("La cuenta por cobrar con el número " + numCuenta + " no fue encontrada o ya está pagada.");
    }

    @Override
    public void mostrarCuentasPorCobrar() {
        for (CuentaPorCobrar cuenta : cuentasPorCobrar) {
            System.out.println(cuenta.toString());
        }
    }

    @Override
    public void actualizarCuentaPorCobrar(int numCuenta, boolean pagada) {
        for (CuentaPorCobrar cuenta : cuentasPorCobrar) {
            if (cuenta.getNumCuenta() == numCuenta) {
                cuenta.setPagada(pagada);
                return;
            }
        }
        System.out.println("La cuenta por cobrar con el número " + numCuenta + " no fue encontrada.");
    }

    @Override
    public void eliminarCuentaPorCobrar(int numCuenta) {
        cuentasPorCobrar.removeIf(cuenta -> cuenta.getNumCuenta() == numCuenta);
    }
}
