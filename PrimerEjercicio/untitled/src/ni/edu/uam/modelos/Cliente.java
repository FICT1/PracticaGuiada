package ni.edu.uam.modelos;
//calcular edad de cliente

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(String nombre) {
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public int CalcularEdad(){
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fechaNacimiento.getYear();

        if (hoy.getMonthValue() < fechaNacimiento.getMonthValue() ||
            (hoy.getMonthValue() == fechaNacimiento.getMonthValue() && hoy.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
            edad--;
        }

        return edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void realizarPedido(Tienda tienda, String producto, int cantidad) {
        tienda.procesarPedido(this, producto, cantidad);
    }



}