# Duoc UC

# 🧠 Desarrollo Orientado a Objetos I – Semana 3

## 👤 Autor del proyecto

- Nombre: IVAN ANDREE CALDERA ALARCON 
- Sección: 002A - 204
- Carrera: Analista Programador Computacional
- Sede: DOUC UC ONLINE
---

# 📘 Descripción general del sistema

Este proyecto corresponde a la actividad evaluada de la asignatura Desarrollo Orientado a Objetos I.

El sistema desarrollado representa una agencia de turismo llamada **Llanquihue Tour**, permitiendo modelar las personas vinculadas a la organización mediante Programación Orientada a Objetos en Java.

La solución fue desarrollada aplicando conceptos fundamentales de la programación orientada a objetos, tales como:

- Encapsulamiento.
- Herencia.
- Composición.
- Constructores.
- Métodos Get y Set.
- Sobreescritura del método `toString()`.

El objetivo principal es representar de manera estructurada la información de clientes y guías turísticos, estableciendo una base para futuras ampliaciones del sistema de gestión de la agencia.

---

# 🧱 Estructura general del proyecto

```text
src/
├── app/
│   └── Main.java
│
└── model/
    ├── Direccion.java
    ├── Persona.java
    └── GuiaTuristico.java
```

---

# 📋 Descripción de las clases

## Direccion

Clase utilizada para representar la dirección de una persona.

### Atributos

- calle
- ciudad
- region

---

## Persona

Clase base del sistema que almacena la información general de una persona.

### Atributos

- rut
- nombre
- direccion

### Características

- Encapsulamiento mediante atributos privados.
- Métodos Get y Set.
- Constructor.
- Método `toString()`.

---

## GuiaTuristico

Clase derivada de Persona mediante herencia.

### Atributos

- especialidad

### Características

- Hereda los atributos y métodos de Persona.
- Agrega la especialidad del guía turístico.
- Sobrescribe el método `toString()`.

---

## Main

Clase principal encargada de ejecutar el programa.

### Funciones

- Crear objetos de tipo Persona y GuiaTuristico.
- Mostrar la información mediante `System.out.println()`.
- Verificar el correcto funcionamiento de las clases implementadas.

---

# ⚙️ Instrucciones para clonar y ejecutar el proyecto

## Clonar el repositorio

```bash
git clone https://github.com/IvanCalderaA/Actividad-sumativa-1-Descubriendo-la-l-gica-de-clases-en-Java.git
```

## Abrir el proyecto

1. Abrir IntelliJ IDEA.
2. Seleccionar **Open**.
3. Buscar la carpeta del proyecto.
4. Esperar que IntelliJ cargue todas las dependencias.

## Ejecutar el programa

1. Abrir la clase `Main.java` ubicada en el paquete `app`.
2. Ejecutar el método `main`.
3. Revisar los resultados mostrados en la consola.

---

# 💻 Ejemplo de salida

```text
=== CLIENTE ===
Rut: 11.111.111-1
Nombre: Carla Fuentes
Direccion: Av. Costanera 100, Llanquihue, Los Lagos

=== GUIA 1 ===
Rut: 22.222.222-2
Nombre: Andres Rojas
Direccion: Calle Puerto 200, Puerto Varas, Los Lagos
Especialidad: Turismo Cultural

=== GUIA 2 ===
Rut: 33.333.333-3
Nombre: Valentina Muñoz
Direccion: Av. Costanera 100, Llanquihue, Los Lagos
Especialidad: Rutas Lacustres
```

---

# 🛠 Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

---

# 🔗 Repositorio GitHub

https://github.com/IvanCalderaA/Actividad-sumativa-1-Descubriendo-la-l-gica-de-clases-en-Java.git

---

# 📅 Fecha de entrega

09/11/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
