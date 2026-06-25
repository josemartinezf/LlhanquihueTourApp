package service;

import model.Tour;

import java.util.ArrayList;

public class TourService {

    private ArrayList<Tour> tours;

    public TourService(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public void mostrarTodos() {
        System.out.println("===== LISTADO COMPLETO DE TOURS =====");
        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    public void buscarPorTipo(String tipo) {
        System.out.println("\n===== TOURS DE TIPO: " + tipo.toUpperCase() + " =====");
        boolean encontrado = false;
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(tour);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron tours de tipo: " + tipo);
        }
    }

    public void buscarPorNombre(String nombre) {
        System.out.println("\n===== BÚSQUEDA POR NOMBRE: " + nombre + " =====");
        boolean encontrado = false;
        for (Tour tour : tours) {
            if (tour.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(tour);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron tours con el nombre: " + nombre);
        }
    }
}