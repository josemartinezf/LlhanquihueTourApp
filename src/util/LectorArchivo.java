package util;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivo {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    String[] datos = linea.split(";");
                    String nombre = datos[0].trim();
                    String tipo = datos[1].trim();
                    double precio = Double.parseDouble(datos[2].trim());
                    int cupos = Integer.parseInt(datos[3].trim());

                    tours.add(new Tour(nombre, tipo, precio, cupos));

                } catch (NumberFormatException e) {
                    System.out.println("Error en formato numérico, línea omitida: " + linea);
                } catch (IllegalArgumentException e) {
                    System.out.println("Dato inválido, línea omitida: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}