package model;

public class Tour {
    private String nombre;
    private String tipo;
    private double precio;
    private int cuposDisponibles;

    public Tour(String nombre, String tipo, double precio, int cuposDisponibles) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cuposDisponibles = cuposDisponibles;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCuposDisponibles() { return cuposDisponibles; }
    public void setCuposDisponibles(int cuposDisponibles) { this.cuposDisponibles = cuposDisponibles; }

    @Override
    public String toString() {
        return "Tour{nombre='" + nombre + "', tipo='" + tipo + "', precio=" + precio + ", cuposDisponibles=" + cuposDisponibles + "}";
    }
}