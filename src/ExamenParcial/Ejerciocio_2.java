/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenParcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 51930
 */
public class Ejerciocio_2 {
    private ArrayList<Alumnos> listaAlumnos;

    public static void main(String[] args) {
        Ejerciocio_2 proyectoAlumnos = new Ejerciocio_2();
        proyectoAlumnos.ingresarDatos();
        proyectoAlumnos.ordenarPorNombre();
        proyectoAlumnos.ordenarPorNota();
    }

    public void ingresarDatos() {
        String nombre, respuesta;
        double nota;
        Scanner entrada = new Scanner(System.in);
        listaAlumnos = new ArrayList();
        int i = 0;
        do {
            System.out.println("\nAlumno " + ++i);
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Nota: ");
            nota = Double.parseDouble(entrada.nextLine());
            Alumnos alumno = new Alumnos(nombre, nota);
            listaAlumnos.add(alumno);
            System.out.print("Desea ingresar nuevo alumno (S/N): ");
            respuesta = entrada.nextLine();
        } while (respuesta.equals("S"));
    }

    public void imprimirDatos() {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).getNombre() + ", "
                    + listaAlumnos.get(i).getNota());
        }
    }

    private void ordenarPorNombre() {
        System.out.println("\nDatos en orden alfabético:");
        Collections.sort(listaAlumnos, (Alumnos alumno1, Alumnos alumno2)
                -> alumno1.getNombre().compareTo(alumno2.getNombre()));
        imprimirDatos();
    }

    private void ordenarPorNota() {
        System.out.println("\nDatos en orden de mérito:");
        Collections.sort(listaAlumnos, (Alumnos alumno1, Alumnos alumno2)
                -> new Double(alumno2.getNota()).compareTo(alumno1.getNota()));
        imprimirDatos();
    }
}
