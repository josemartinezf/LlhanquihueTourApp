package ui;

import model.Tour;
import service.TourService;
import util.LectorArchivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LectorArchivo lector = new LectorArchivo();
        ArrayList<Tour> tours = lector.cargarTours("resources/tours.txt");

        TourService service = new TourService(tours);

        // 1. Mostrar todos
        service.mostrarTodos();

        // 2. Buscar por tipo
        service.buscarPorTipo("gastronómico");

        // 3. Buscar por nombre
        service.buscarPorNombre("kayak");
    }
}