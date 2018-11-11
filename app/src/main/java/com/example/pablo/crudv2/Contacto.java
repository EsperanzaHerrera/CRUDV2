package com.example.pablo.crudv2;


public class Contacto {
    int id;
   String Nombre;
   String Telefono;
   String Email;
   int Edad;

    public Contacto(String nombre, String telefono, String email, int edad) {
        Nombre = nombre;
        Telefono = telefono;
        Email = email;
        Edad = edad;
    }

    public Contacto(){

   }

    public Contacto(int id, String nombre, String telefono, String email, int edad) {
        this.id = id;
        Nombre = nombre;
        Telefono = telefono;
        Email = email;
        Edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
