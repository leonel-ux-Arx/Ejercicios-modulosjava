package Proyecto_Unidad5.Sistemas_de_reservas_aereas;

public class Entidad {
    private String codigo;
    private int capacidadMaxima;
    private int asientosReservados;

    public Entidad (String codigo, int capacidadMaxima, int asientosReservados) {
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public int getCapacidadMaxima() { return capacidadMaxima; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }

    public int getAsientosReservados() { return asientosReservados; }
    public void setAsientosReservados(int asientosReservados) { this.asientosReservados = asientosReservados; }

    public boolean reservarAsiento() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
            return true;
        }
        return false;
    }

    public double porcentajeOcupacion() {
        return (asientosReservados * 100.0) / capacidadMaxima;
    }
}
