/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_3a;

import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class CuentaPrestamo extends Cuenta {

    public CuentaPrestamo(int numeroCuenta, String cliente, String tipoCuenta, Double balance, Double tasaInteres) {
        super(numeroCuenta, cliente, tipoCuenta, balance, tasaInteres);
    }

    public void depositar(double monto) {
        this.setBalance(this.getBalance() + monto);
    }

    @Override
    public double calcularInteres(int meses) {
        if (getBalance() < 0 || getBalance() > 1000) {
            this.setTasaInteres(this.getTasaInteres() * meses);

        } else {
            JOptionPane.showMessageDialog(null, "Debido alas politicas de la intuyucion No se puede aplicar interes", "Calcular interes", JOptionPane.ERROR_MESSAGE);
        }
        return getTasaInteres();
    }

    public String toString() {
        return "Número_Cuenta: " + getNuemroCuenta() + ", Cliente: " + getCliente() + ", Tipo_Cuenta " + getTipoCuenta() + "Saldo" + getBalance() + ", Interes " + getTasaInteres();

    }
}
