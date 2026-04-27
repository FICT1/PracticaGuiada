package ni.edu.uam.modelos;

public class Empresa {

    public double calcularTotalSalarios(Empleado[] empleados){
        double total = 0;

        for (Empleado emp : empleados) {
            total += emp.calcularSalarioTotal();
        }

        return total;
    }
}