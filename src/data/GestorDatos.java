package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    private ArrayList<Tour> tours;

    public GestorDatos() {
        this.tours = new ArrayList<>();
    }

    public ArrayList<Tour> cargarDatos(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split(";");

                String nombre = datos[0].trim();
                String tipo = datos[1].trim();
                double precio = Double.parseDouble(datos[2].trim());
                int cupos = Integer.parseInt(datos[3].trim());

                Tour tour = new Tour(nombre, tipo, precio, cupos);
                tours.add(tour);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de los datos numéricos: " + e.getMessage());
        }

        return tours;
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }
} 