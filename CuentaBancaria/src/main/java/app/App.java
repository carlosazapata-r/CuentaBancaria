package app;


import model.CuentaAhorros;
import model.CuentaCorriente;

public class App {
    public static void main(String[] args) {
        // Crear cuenta de ahorros
        CuentaAhorros cuentaAhorros = new CuentaAhorros(12000, 12);

        cuentaAhorros.imprimir();
        cuentaAhorros.consignar(3000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(500);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(500);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        System.out.println("\n");


        CuentaCorriente cuentaCorriente = new CuentaCorriente(5000, 12);
        cuentaCorriente.retirar(7000);
        cuentaCorriente.consignar(1000);
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();
    }
}

