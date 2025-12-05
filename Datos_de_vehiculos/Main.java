package Proyecto_Unidad5.Datos_de_vehiculos;

public class Main{
    public static void main(String[] args) {

        Entidad v = new Entidad ("Nissan", 2005, 180);

        System.out.println(v.encender());
        System.out.println("Antigüedad: " + v.antiguedad(2025));
    }
}
