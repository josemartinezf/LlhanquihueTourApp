package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;

public class GestorServicios {

    public ArrayList<ServicioTuristico> crearServicios() {
        ArrayList<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica("Ruta Frutillar", 3, 5));
        servicios.add(new RutaGastronomica("Ruta Puerto Varas", 4, 7));

        servicios.add(new PaseoLacustre("Paseo Lago Llanquihue", 2, "Lancha"));
        servicios.add(new PaseoLacustre("Paseo Lago Todos los Santos", 3, "Catamarán"));

        servicios.add(new ExcursionCultural("Excursión Dalcahue", 5, "Iglesia de Dalcahue"));
        servicios.add(new ExcursionCultural("Excursión Castro", 4, "Palafitos de Castro"));

        return servicios;
    }
}