package Proyecto_Unidad5.Geometria_Rectangulo;

public class Main{
    public static void main(String[] args) {

        Entidad r = new Entidad (10, 4, "Rect1");

        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
    }
}
