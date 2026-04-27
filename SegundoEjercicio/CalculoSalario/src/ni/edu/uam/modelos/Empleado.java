package ni.edu.uam.modelos;

public class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularBono(){
        return salarioBase * 0.1;
    }

    public double calcularSalarioTotal(){
        return salarioBase + calcularBono();
    }

    public boolean aplicaDescuento(){
        return salarioBase > 400;
    }

    public String obtenerResumen(){
        String mensaje = "Empleado: " + nombre +
                "\nSalario base: " + salarioBase +
                "\nBono: " + calcularBono() +
                "\nSalario total: " + calcularSalarioTotal();

        if(aplicaDescuento()){
            mensaje += "\nAplica descuento";
        } else {
            mensaje += "\nNo aplica descuento";
        }

        return mensaje;
    }
}