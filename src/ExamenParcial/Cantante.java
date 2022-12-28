/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenParcial;

/**
 *
 * @author 51930
 */
public class Cantante {

    private String nombre;

    public Cantante() {
    }

    public Cantante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String devolverCantante() {
        return "Nombre: " + nombre;
    }
}
