package org.alvarowau.cuentas;

/**
 * La clase Main es la clase principal del proyecto que contiene el método main para iniciar la aplicación.
 *
 * @author Álvaro Bajo
 * @version 2
 */
public class Main {

    /**
     * El método main es el punto de entrada de la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        operativaCuenta(); // Llamamos al método operativaCuenta para realizar operaciones en la cuenta
    }

    /**
     * El método operativaCuenta engloba las sentencias que operan con el objeto cuenta1.
     */
    private static void operativaCuenta() {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}