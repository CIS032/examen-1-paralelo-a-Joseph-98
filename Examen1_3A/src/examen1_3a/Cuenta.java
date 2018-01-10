/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_3a;

/**
 *
 * @author DAVID
 */
public abstract class Cuenta {
    private int numeroCuenta;
    private String cliente;
    private String tipoCuenta;
    private Double balance;
    private Double tasaInteres;

    public Cuenta(int numeroCuenta, String cliente, String tipoCuenta, Double balance, Double tasaInteres) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.tipoCuenta = tipoCuenta;
        this.balance = balance;
        this.tasaInteres = tasaInteres;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCliente) {
        this.tipoCuenta = tipoCliente;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getNuemroCuenta() {
        return numeroCuenta;
    }

    public void setNuemroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public abstract double calcularInteres(int meses);
}


    

