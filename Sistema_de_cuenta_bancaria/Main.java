package Proyecto_Unidad5.Sistema_de_cuenta_bancaria;

public class Main{
    public static void main(String[] args) {

        Entidad cuenta = new Entidad("001", "Tilín", 500);

        cuenta.depositar(200);
        System.out.println("Saldo: " + cuenta.getSaldo());

        cuenta.retirar(100);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
