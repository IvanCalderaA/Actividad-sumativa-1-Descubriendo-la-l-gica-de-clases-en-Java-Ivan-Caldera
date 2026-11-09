package model;

/**
 * Clase que representa a un guía turístico de Llanquihue Tour.
 * Extiende (hereda) de la clase Empleado.
 */
public class GuiaTuristico extends Empleado {

    private String idiomas;
    private String especialidad;
    private int aniosExperiencia;

    // Constructor
    public GuiaTuristico(String rut, String nombre, String apellido,
                         String telefono, String email, Direccion direccion,
                         double salario, String fechaIngreso,
                         String idiomas, String especialidad, int aniosExperiencia) {
        super(rut, nombre, apellido, telefono, email, direccion,
              "Guía Turístico", salario, fechaIngreso);
        this.idiomas = idiomas;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getters y Setters
    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "=== Guía Turístico ===" +
               "\n  RUT             : " + getRut() +
               "\n  Nombre          : " + getNombre() + " " + getApellido() +
               "\n  Teléfono        : " + getTelefono() +
               "\n  Email           : " + getEmail() +
               "\n  Dirección       : " + getDireccion() +
               "\n  Cargo           : " + getCargo() +
               "\n  Salario         : $" + getSalario() +
               "\n  Fecha ingreso   : " + getFechaIngreso() +
               "\n  Idiomas         : " + idiomas +
               "\n  Especialidad    : " + especialidad +
               "\n  Años experiencia: " + aniosExperiencia;
    }
}
