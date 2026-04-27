package ni.edu.uam.modelos;

public class Pedido {
    private Cliente cliente;
    private String producto;
    private int cantidad;

    public Pedido(Cliente cliente, String producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public void mostrarDetalle() {
        System.out.println("===== DETALLE DEL PEDIDO =====");
        System.out.println("Cliente   : " + cliente.getNombre());
        System.out.println("Producto  : " + producto);
        System.out.println("Cantidad  : " + cantidad);
        System.out.println("------------------------------");
        System.out.println("Pedido procesado correctamente");
    }
}