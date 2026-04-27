package ni.edu.uam;

import javax.swing.JOptionPane;
import ni.edu.uam.modelos.Empleado;
import ni.edu.uam.modelos.Empresa;

public class Main {
    public static void main(String[] args) {

        int cantidad = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("¿Cuántos empleados desea ingresar?");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Programa cancelado.");
                return;
            }

            try {
                cantidad = Integer.parseInt(input);

                if (cantidad > 0) break;
                else JOptionPane.showMessageDialog(null, "Ingrese un número mayor que 0.");

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
            }
        }

        Empleado[] empleados = new Empleado[cantidad];

        for (int i = 0; i < cantidad; i++) {

            String nombre;
            while (true) {
                nombre = JOptionPane.showInputDialog("Ingrese nombre del empleado " + (i+1));

                if (nombre == null) {
                    JOptionPane.showMessageDialog(null, "Programa cancelado.");
                    return;
                }

                nombre = nombre.trim();

                if (!nombre.isEmpty()) break;
                else JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.");
            }

            double salario;
            while (true) {
                String inputSalario = JOptionPane.showInputDialog("Ingrese salario de " + nombre);

                if (inputSalario == null) {
                    JOptionPane.showMessageDialog(null, "Programa cancelado.");
                    return;
                }

                try {
                    salario = Double.parseDouble(inputSalario);

                    if (salario > 0) break;
                    else JOptionPane.showMessageDialog(null, "El salario debe ser mayor que 0.");

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: solo números válidos.");
                }
            }

            empleados[i] = new Empleado(nombre, salario);

            JOptionPane.showMessageDialog(null, empleados[i].obtenerResumen());
        }

         Empresa empresa = new Empresa();
        double total = empresa.calcularTotalSalarios(empleados);

        JOptionPane.showMessageDialog(null,
                "Total de salarios de la empresa: " + total);
    }
}