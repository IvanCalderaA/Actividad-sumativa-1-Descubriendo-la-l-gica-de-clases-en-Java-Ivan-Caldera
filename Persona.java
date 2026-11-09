package model;

/**
 * Clase base que representa a cualquier persona vinculada
 * a la agencia de turismo Llanquihue Tour.
 * Aplica composición con la clase Direccion.
 */
public class Persona {

    private String rut;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Direccion direccion; // Composición: Persona TIENE UNA Direccion

    // Constructor
    public Persona(String rut, String nombre, String apellido,
                   String telefono, String email, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "=== Persona ===" +
               "\n  RUT        : " + rut +
               "\n  Nombre     : " + nombre + " " + apellido +
               "\n  Teléfono   : " + telefono +
               "\n  Email      : " + email +
               "\n  Dirección  : " + direccion;
    }
}
