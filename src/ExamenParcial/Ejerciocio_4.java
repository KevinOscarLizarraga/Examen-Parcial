/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenParcial;

import java.util.ArrayList;

/**
 *
 * @author 51930
 */
public class Ejerciocio_4 {

    private ArrayList<Cantante> cantantes = new ArrayList<>();

    public void ListaCantantes() {
    }

    public void anadirCantante(String nombre) {
        cantantes.add(new Cantante(nombre));
    }

    public ArrayList<Cantante> obtenerListadoFormateado() {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println("Cantante: " + cantantes.get(x).getNombre());
        }
        return cantantes;
    }

    public ArrayList<Cantante> listadoCantantes() {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println(cantantes.get(x).getNombre());
        }
        return cantantes;
    }

    public static void main(String[] args) {

        Ejerciocio_4 cantantes = new Ejerciocio_4();

        cantantes.anadirCantante("Freddie Mercury");
        cantantes.anadirCantante("Zaz");
        cantantes.anadirCantante("Stromae");
        cantantes.anadirCantante("Noa");
        cantantes.anadirCantante("Enrique Bunbury");
        cantantes.anadirCantante("Edith Piaf");
        cantantes.anadirCantante("Otis Redding");
        cantantes.anadirCantante("Antonio Machín");

        cantantes.listadoCantantes();

        cantantes.obtenerListadoFormateado();
    }
}
