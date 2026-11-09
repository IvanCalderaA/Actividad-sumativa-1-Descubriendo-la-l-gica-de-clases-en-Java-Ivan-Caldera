package model;

/**
 * Clase que representa a un cliente de Llanquihue Tour.
 * Extiende (hereda) de la clase base Persona.
 */
public class Cliente extends Persona {

    private String nacionalidad;
    private String tipoCliente; // "Nacional" o "Internacional"
    private int totalReservas;

    // Constructor
    public Cliente(String rut, String nombre, String apellido,
                   String telefono, String email, Direccion direccion,
                   String nacionalidad, String tipoCliente) {
        super(rut, nombre, apellido, telefono, email, direccion);
        this.nacionalidad = nacionalidad;
        this.tipoCliente = tipoCliente;
        this.totalReservas = 0;
    }

    // Getters y Setters
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getTotalReservas() {
        return totalReservas;
    }

    public void registrarReserva() {
        this.totalReservas++;
    }

    @Override
    public String toString() {
        return "=== Cliente ===" +
               "\n  RUT           : " + getRut() +
               "\n  Nombre        : " + getNombre() + " " + getApellido() +
               "\n  Teléfono      : " + getTelefono() +
               "\n  Email         : " + getEmail() +
               "\n  Dirección     : " + getDireccion() +
               "\n  Nacionalidad  : " + nacionalidad +
               "\n  Tipo cliente  : " + tipoCliente +
               "\n  Total reservas: " + totalReservas;
    }
}
