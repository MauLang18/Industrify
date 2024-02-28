package industrify;

import entities.Producto;
import services.ProductoServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Industrify {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        ProductoServices productoServices = new ProductoServices(productos);
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar catálogo de productos");
            System.out.println("2. Agregar nuevo producto");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    productoServices.mostrarCatalogo();
                    break;
                case 2:
                    agregarProducto(scanner, productoServices);
                    break;
                case 3:
                    actualizarProducto(scanner, productoServices);
                    break;
                case 4:
                    eliminarProducto(scanner, productoServices);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void agregarProducto(Scanner scanner, ProductoServices productoServices) {
        System.out.println("Ingrese las características del nuevo producto:");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Cantidad en el inventario: ");
        int cantidad = scanner.nextInt();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        Producto nuevoProducto = new Producto(codigo, descripcion, cantidad, precio);
        productoServices.agregarProducto(nuevoProducto);

        System.out.println("Producto correctamente agregado.");
    }

    private static void actualizarProducto(Scanner scanner, ProductoServices productoServices) {
        System.out.println("Ingrese el código del producto que desea actualizar:");
        String codigoActualizar = scanner.next();
        System.out.println("Ingrese los nuevos detalles del producto:");
        System.out.print("Nueva descripción: ");
        scanner.nextLine(); // Limpiar el buffer
        String nuevaDescripcion = scanner.nextLine();
        System.out.print("Nueva cantidad en inventario: ");
        int nuevaCantidad = scanner.nextInt();
        System.out.print("Nuevo precio: ");
        double nuevoPrecio = scanner.nextDouble();

        Producto productoActualizado = new Producto(codigoActualizar, nuevaDescripcion, nuevaCantidad, nuevoPrecio);
        productoServices.actualizarProducto(codigoActualizar, productoActualizado);

        System.out.println("Producto correctamente actualizado.");
    }

    private static void eliminarProducto(Scanner scanner, ProductoServices productoServices) {
        System.out.println("Ingrese el código del producto que desea eliminar:");
        String codigoEliminar = scanner.next();
        productoServices.eliminarProducto(codigoEliminar);

        System.out.println("Producto eliminado correctamente.");
    }
}