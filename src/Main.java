import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Juan Martin Pineda Rubiano

        Scanner teclado = new Scanner(System.in);
        HashMap<Integer, Producto> PrecioProductos = new HashMap<>();
        Producto producto = new Producto();

        PrecioProductos.put(3456, new Producto("Balon de futbol", 80000, 10));
        PrecioProductos.put(5678, new Producto("Tarro pelota de tenis", 35000, 20));
        PrecioProductos.put(6790, new Producto("Raqueta de tenis", 900000, 5));
        PrecioProductos.put(5170, new Producto("Bicicleta", 1500000, 8));
        PrecioProductos.put(4976, new Producto("Casco de bicicleta", 120000, 12));

        int opc;

            do {
                System.out.println("\tTienda deportiva\n" +
                        "1) Consultar productos\n" +
                        "2) Añadir producto\n" +
                        "3) Eliminar producto\n" +
                        "4) Salir de la tienda\n" +
                        "Digite la opcion deseada: ");
                opc = teclado.nextInt();

                switch (opc) {
                    case 1:
                        for (Map.Entry entrada : PrecioProductos.entrySet()) {
                            System.out.println("Codigo del producto: " + entrada.getKey() + " | Informacion: " + entrada.getValue());
                        }
                        break;

                    case 2:
                        System.out.println("Ingrese el nombre del producto: ");
                        producto.setNombre(teclado.next());
                        System.out.println("Ingrese el precio del producto: ");
                        producto.setPrecio(teclado.nextDouble());
                        System.out.println("Ingrese la cantidad de productos existentes: ");
                        producto.setCantidadDisponible(teclado.nextInt());

                        System.out.println("Ingrese el codigo del producto: ");
                        int clave = teclado.nextInt();

                        PrecioProductos.put(clave, new Producto(producto.getNombre(), producto.getPrecio(), producto.getCantidadDisponible()));
                        break;

                    case 3:

                        break;

                    case 4:
                        System.out.println("***Ha salido de la tienda***");
                        break;

                    default:
                        System.out.println("***Opcion no valida***");
                        break;

                }
            } while (opc != 4);
    }
}