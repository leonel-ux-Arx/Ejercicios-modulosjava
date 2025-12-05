package Proyecto_Unidad5.Sistemas_de_reservas_aereas;

public class Main{
    public static void main(String[] args) {

        Entidad vuelo = new Entidad ("IBZ-402", 5, 4);

        System.out.println("Reserva: " + vuelo.reservarAsiento());
        System.out.println("Ocupación: " + vuelo.porcentajeOcupacion() + "%");
    }
}
