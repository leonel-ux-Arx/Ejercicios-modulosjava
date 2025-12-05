package Proyecto_Unidad5.Datos_de_vehiculos;

public class Entidad {
    private String marca;
    private int añoFabricacion;
    private int velocidadMaxima;

    public Entidad (String marca, int añoFabricacion, int velocidadMaxima) {
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAñoFabricacion() { return añoFabricacion; }
    public void setAñoFabricacion(int añoFabricacion) { this.añoFabricacion = añoFabricacion; }

    public int getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    public String encender() {
        if (añoFabricacion >= 1995)
            return "Vehículo encendido.";
        else
            return "Vehículo demasiado antiguo.";
    }

    public int antiguedad(int añoActual) {
        return añoActual - añoFabricacion;
    }
}

