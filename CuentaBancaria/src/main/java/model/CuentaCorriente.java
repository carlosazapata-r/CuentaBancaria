package model;


public class CuentaCorriente extends Cuenta {
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            sobregiro += (cantidad - saldo);
            saldo = 0;
        }
        numRetiros++;
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                saldo += cantidad;
            } else {
                sobregiro -= cantidad;
            }
        } else {
            super.consignar(cantidad);
        }
        numConsignaciones++;
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void imprimir() {
        System.out.println("=== Cuenta Corriente ===");
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comisión Mensual: $" + comisionMensual);
        System.out.println("Transacciones: " + (numConsignaciones + numRetiros));
        System.out.println("Sobregiro: $" + sobregiro);
    }
}

