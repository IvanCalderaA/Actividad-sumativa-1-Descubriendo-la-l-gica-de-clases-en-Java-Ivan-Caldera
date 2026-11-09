package app;

import model.Direccion;
import model.Persona;
import model.Empleado;
import model.Cliente;
import model.GuiaTuristico;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Crea instancias de las clases del modelo y muestra sus datos por consola.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("   SISTEMA LLANQUIHUE TOUR - Prototipo v1  ");
        System.out.println("============================================\n");

        // --- Instancia 1: Persona genérica ---
        Direccion dir1 = new Direccion("Av. Frutillar", "123", "Llanquihue", "Los Lagos");
        Persona persona1 = new Persona(
            "12.345.678-9",
            "Ana",
            "Muñoz",
            "+56912345678",
            "ana.munoz@email.com",
            dir1
        );
        System.out.println(persona1);
        System.out.println();

        // --- Instancia 2: Empleado ---
        Direccion dir2 = new Direccion("Calle Puerto Montt", "456", "Puerto Montt", "Los Lagos");
        Empleado empleado1 = new Empleado(
            "15.678.901-2",
            "Carlos",
            "Soto",
            "+56987654321",
            "carlos.soto@llanquihuetour.cl",
            dir2,
            "Coordinador de Operaciones",
            850000,
            "2018-03-15"
        );
        System.out.println(empleado1);
        System.out.println();

        // --- Instancia 3: Cliente ---
        Direccion dir3 = new Direccion("Los Colonos", "789", "Puerto Varas", "Los Lagos");
        Cliente cliente1 = new Cliente(
            "18.901.234-5",
            "María",
            "González",
            "+56911223344",
            "maria.gonzalez@gmail.com",
            dir3,
            "Chilena",
            "Nacional"
        );
        cliente1.registrarReserva();
        cliente1.registrarReserva();
        System.out.println(cliente1);
        System.out.println();

        // --- Instancia 4: Guía Turístico ---
        Direccion dir4 = new Direccion("Calle Los Volcanes", "22", "Llanquihue", "Los Lagos");
        GuiaTuristico guia1 = new GuiaTuristico(
            "14.567.890-1",
            "Pedro",
            "Vera",
            "+56966778899",
            "pedro.vera@llanquihuetour.cl",
            dir4,
            920000,
            "2015-07-01",
            "Español, Inglés, Alemán",
            "Turismo lacustre y gastronómico",
            9
        );
        System.out.println(guia1);
        System.out.println();

        // --- Instancia 5: Cliente internacional ---
        Direccion dir5 = new Direccion("Hauptstraße", "10", "Berlín", "Alemania");
        Cliente cliente2 = new Cliente(
            "PASSP-DE-4521",
            "Hans",
            "Müller",
            "+4930123456",
            "hans.muller@email.de",
            dir5,
            "Alemana",
            "Internacional"
        );
        cliente2.registrarReserva();
        System.out.println(cliente2);
        System.out.println();

        System.out.println("============================================");
        System.out.println("   Sistema inicializado correctamente.     ");
        System.out.println("============================================");
    }
}
