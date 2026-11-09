package model;

/**
 * Clase que representa a un empleado de Llanquihue Tour.
 * Extiende (hereda) de la clase base Persona.
 */
public class Empleado extends Persona {

    private String cargo;
    private double salario;
    private String fechaIngreso;

    // Constructor
    public Empleado(String rut, String nombre, String apellido,
                    String telefono, String email, Direccion direccion,
                    String cargo, double salario, String fechaIngreso) {
        super(rut, nombre, apellido, telefono, email, direccion);
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    // Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "=== Empleado ===" +
               "\n  RUT         : " + getRut() +
               "\n  Nombre      : " + getNombre() + " " + getApellido() +
               "\n  Teléfono    : " + getTelefono() +
               "\n  Email       : " + getEmail() +
               "\n  Dirección   : " + getDireccion() +
               "\n  Cargo       : " + cargo +
               "\n  Salario     : $" + salario +
               "\n  Fecha ingreso: " + fechaIngreso;
    }
}
