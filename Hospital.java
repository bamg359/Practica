import java.util.ArrayList;

public class Hospital {

    private String nombre;
    ArrayList<Empleado> empleado = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public static double liquidarNominaEmpleado(Empleado empleado) {

        double salario = 0;
        double pension;
        double eps;
        double nominaEmpleado;

        salario = empleado.getSalario();
        eps = salario * 0.04;
        pension = salario * 0.04;
        nominaEmpleado = salario - eps - pension;

        return nominaEmpleado;

    }

    public static double liquidarSaludEmpleado(Empleado empleado) {

        double salario = 0;
        double eps;
        double arl;
        double pension;
        double saludTotal;

        salario = empleado.getSalario();
        eps = salario * 0.085;
        pension = salario * 0.12;
        arl = salario * 0.00522;
        saludTotal = eps + pension + arl;

        return saludTotal;

    }


    public static double liquidarPrestacionesEmpleado (Empleado empleado){
        
        double salario= 0;
        double prima;
        double cesantias;
        double vacaciones;
        double iCesantias;
        double prestacionesTotal;
        
        salario= empleado.getSalario();
        prima = salario * 0.0833;
        cesantias = salario*0.0833;
        vacaciones = salario * 0.0416;
        iCesantias= cesantias * 0.12;
        prestacionesTotal = prima + cesantias + vacaciones + iCesantias;

        return prestacionesTotal;
    
    }


    public static double liquidarParafiscalesEmpleado (Empleado empleado){
        
        double salario= 0;
        double icbf;
        double sena;
        double cajaCompensacion;
        double  parafiscalesTotal;
        
        salario= empleado.getSalario();
        icbf= salario*0.03;
        sena= salario*0.02;
        cajaCompensacion= salario*0.04;
        parafiscalesTotal = icbf + sena+ cajaCompensacion;
 
        return parafiscalesTotal;
    
    }

}

