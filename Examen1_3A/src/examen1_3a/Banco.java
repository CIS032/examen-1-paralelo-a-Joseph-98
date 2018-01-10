/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_3a;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class Banco extends Cuenta{

    static ArrayList<Cuenta> cuentas=new ArrayList<Cuenta>();

    
    
   
    public static void agregarCuenta(Cuenta cuenta){
      cuentas.add(cuenta);
    }
    public static void grabar(){
    PrintWriter pw=null;
    try{
        FileWriter fw=new FileWriter("Registro_Bancario.csv",true);
        pw=new PrintWriter(fw);
    }catch(IOException ex){
        System.out.println("ERROR, Nose puede encontrar el archivo el archivo"+ ex);    
    }
        for (Cuenta cuenta : cuentas) {
         if(cuenta instanceof CuentaAhorro){
                CuentaAhorro arr= (CuentaAhorro)cuenta;
                String linea = "Número_Cuenta: "+arr.getCliente() + ", Cliente: " + arr.getCliente()+ ", Tipo_Cuenta " +arr.getTipoCuenta()+"Saldo" +arr.getBalance()+", Interes " +arr.getTasaInteres();
                pw.println(linea);
            }
            if(cuenta instanceof CuentaPrestamo){
               CuentaPrestamo pres= (CuentaPrestamo)cuenta;
                String linea = "Número_Cuenta: "+pres.getCliente() + ", Cliente: " + pres.getCliente()+ ", Tipo_Cuenta " +pres.getTipoCuenta()+"Saldo" +pres.getBalance()+", Interes " +pres.getTasaInteres();
                pw.println(linea);
            }
            if( cuenta instanceof CuentaHipoteca){
             CuentaHipoteca hpc=(CuentaHipoteca)cuenta;
            String linea = "Número_Cuenta: "+hpc.getCliente() + ", Cliente: " + hpc.getCliente()+ ", Tipo_Cuenta " +hpc.getTipoCuenta()+"Saldo" +hpc.getBalance()+", Interes " +hpc.getTasaInteres();
                pw.println(linea);
        }
    
    }
        
    }

    public Banco(int numeroCuenta, String cliente, String tipoCuenta, Double balance, Double tasaInteres) {
        super(numeroCuenta, cliente, tipoCuenta, balance, tasaInteres);
    }

    @Override
    public double calcularInteres(int meses) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
   
