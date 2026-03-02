
    

import java.util.Scanner;

public class Parcial1 {

    public static void main(String[] args) {

        // Declaración de variables
        int CLAVE = 1234;
        int SALDOINICIAL = 80000;
        int claveUsuario;
        int retiro;
        int nuevoSaldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su clave:");
        claveUsuario = scanner.nextInt();

        if (CLAVE == claveUsuario) {

            System.out.println("Bienvenido al cajero de la Uniajc");
            System.out.println("Ingrese la cantidad a retirar:");
            retiro = scanner.nextInt();

            if (retiro > 20000) {
                retiro = retiro + 2000; // Se cobra comisión
            }

            if (retiro <= SALDOINICIAL) {
                nuevoSaldo = SALDOINICIAL - retiro;
                System.out.println("Su saldo actual es: " + nuevoSaldo);
                System.out.println("Muchas Gracias!!!");
            } else {
                System.out.println("El valor solicitado es mayor al saldo disponible");
            }

        } else {
            System.out.println("Su clave no es correcta... Intente nuevamente.");
        }

        scanner.close();
    }
}