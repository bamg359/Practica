public class Empleado {

    private int id;
    private String nombre;
    private String tipoContrato;
    private int salario;

    public Empleado(String nombre, String tipoContrato, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
