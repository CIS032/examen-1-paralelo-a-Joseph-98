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
public class CuentaHipoteca extends Cuenta {

    public CuentaHipoteca(int numeroCuenta, String cliente, String tipoCuenta, Double balance, Double tasaInteres) {
        super(numeroCuenta, cliente, tipoCuenta, balance, tasaInteres);
    }

    public void depositar(double monto) {
        this.setBalance(this.getBalance() + monto);
    }

    @Override
    public double calcularInteres(int meses) {

        if (getCliente().equalsIgnoreCase("individuo")) {
            if (meses > 6) {
                this.setTasaInteres(this.getTasaInteres() * meses);

            } else {
                JOptionPane.showMessageDialog(null, "El cliente no sobrepas el tiempo de exoneracion de interes el cual es de 6 meses", "Claculo de interes", JOptionPane.ERROR_MESSAGE);
            }
        } else if (getCliente().equalsIgnoreCase("empresa")) {
            if (meses <= 12) {
                this.setTasaInteres((this.getTasaInteres() * meses) / 2);
            } else {
                this.setTasaInteres(this.getTasaInteres() * meses);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El tipo de cliente no exixte en nuestra base de datos", "Calcular interes", JOptionPane.ERROR_MESSAGE);
        }
        return getTasaInteres();
    }

    public String toString() {
        return "Número_Cuenta: " + getNuemroCuenta() + ", Cliente: " + getCliente() + ", Tipo_Cuenta " + getTipoCuenta() + "Saldo" + getBalance() + ", Interes " + getTasaInteres();

    }

}
