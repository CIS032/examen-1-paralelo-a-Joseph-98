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
public class CuentaAhorro extends Cuenta {
    public void depositar(double monto) {
        this.setBalance(this.getBalance() + monto);
    }

    public void retirar(double monto) {
        double controlador = getBalance();
        if (controlador > 0) {
            this.setBalance(this.getBalance() - monto);
        } else {
            JOptionPane.showMessageDialog(null, getBalance(), "Usted no cuenta con saldo sufieciente para realizar el retiro", JOptionPane.ERROR_MESSAGE);
        }
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

    public CuentaAhorro(int numeroCuenta, String cliente, String tipoCuenta, Double balance, Double tasaInteres) {
        super(numeroCuenta, cliente, tipoCuenta, balance, tasaInteres);

    }
}

    

