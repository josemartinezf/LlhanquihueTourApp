package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        ArrayList<ServicioTuristico> servicios = gestor.crearServicios();

        System.out.println("===== SERVICIOS TURÍSTICOS =====");
        for (ServicioTuristico s : servicios) {
            System.out.println(s);
        }
    }
}