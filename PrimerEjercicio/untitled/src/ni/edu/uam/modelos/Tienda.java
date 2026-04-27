package ni.edu.uam.modelos;

public class Tienda {

    public void procesarPedido(Cliente cliente, String producto, int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor que 0.");
            return;
        }

        Pedido pedido = new Pedido(cliente, producto, cantidad);
        pedido.mostrarDetalle();
    }
}