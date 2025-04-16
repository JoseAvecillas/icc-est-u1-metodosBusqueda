package controllers;

import java.util.Scanner;
import models.Person;

public class MetodosBusquedaBinaria {
    private Person[] personas;

    public MetodosBusquedaBinaria(Person[] personas) {
        this.personas = personas;
    }

    public void showPersonByName() {
        ordenarPorNombre(personas); // Ordenar por nombre (burbuja)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre que deseas buscar: ");
        String nombreBuscado = scanner.nextLine();

        int resultado = busquedaBinariaPorNombre(personas, nombreBuscado);

        if (resultado != -1) {
            System.out.println("Persona encontrada: " + personas[resultado]);
        } else {
            System.out.println("Persona no encontrada.");
        }

        scanner.close();
    }

    private void ordenarPorNombre(Person[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i].getName().compareToIgnoreCase(arreglo[j].getName()) > 0) {
                    Person aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    private int busquedaBinariaPorNombre(Person[] arreglo, String nombreBuscado) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            int comparacion = arreglo[medio].getName().compareToIgnoreCase(nombreBuscado);

            if (comparacion == 0) {
                return medio;
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}