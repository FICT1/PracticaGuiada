package ni.edu.uam;

import java.util.Scanner;
import ni.edu.uam.modelos.Cliente;
import ni.edu.uam.modelos.Tienda;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DE PEDIDOS =====");

        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
            return;
        }

        System.out.print("Ingrese producto: ");
        String producto = sc.nextLine().trim();

        if (producto.isEmpty()) {
            System.out.println("Error: el producto no puede estar vacío.");
            return;
        }

        System.out.print("Ingrese cantidad: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: debe ingresar un número válido.");
            return;
        }

        int cantidad = sc.nextInt();

        Cliente cliente = new Cliente(nombre);
        Tienda tienda = new Tienda();

        cliente.realizarPedido(tienda, producto, cantidad);

        sc.close();
    }
}