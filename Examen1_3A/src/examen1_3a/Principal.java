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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean continuar = true;
        do {
            String menu = "1 Agregra Cuenta\n"
                    + "2 Cuenta Ahorro\n"
                    + "3 Cuanta Prestamo\n"
                    + "4 Cuenta Hipotecaria\n"
                    + "5 Salir";
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Sistema Bancario", JOptionPane.INFORMATION_MESSAGE));
            switch (option) {
                case 1://agregar
                    int Ncuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta del cliente"));
                    String cliente = JOptionPane.showInputDialog(null, "Ingrese el tipo de cliente (Individuo o Empresa)");
                    String tipoCuenta = JOptionPane.showInputDialog(null, "Ingrese el tipo de cuenta del cliente (Ahorro, Prestamo o hipoteca)");
                    Double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto para apertura de cuenta"));
                    Banco lis = new Banco(Ncuenta, cliente, tipoCuenta, monto, monto);
                    Banco.agregarCuenta(lis);
                    Banco.grabar();
                    break;
                case 2://cuanta de ahorro
                    int NcuentaAH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta del cliente"));
                    String clienteAH = JOptionPane.showInputDialog(null, "Ingrese el tipo de cliente (Individuo o Empresa)");
                    String tipoCuentaAH = JOptionPane.showInputDialog(null, "Ingrese el tipo de cuenta del cliente (Ahorro, Prestamo o hipoteca)");
                    Double montoAH = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto para apertura de cuenta"));
                    Double tazaInterezAH = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese 0 para calcular el interes"));
                    CuentaAhorro cuentaAH = new CuentaAhorro(NcuentaAH, clienteAH, tipoCuentaAH, montoAH, tazaInterezAH);
                    int mesesAH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de meses para calcular el interes"));
                    cuentaAH.calcularInteres(mesesAH);
                    JOptionPane.showMessageDialog(null, cuentaAH.calcularInteres(mesesAH), "Interés", JOptionPane.INFORMATION_MESSAGE);
                    Banco.grabar();

                    break;
                case 3:
                    break;
                case 4:
                    int NcuentaH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta del cliente"));
                    String clienteH = JOptionPane.showInputDialog(null, "Ingrese el tipo de cliente (Individuo o Empresa)");
                    String tipoCuentaH = JOptionPane.showInputDialog(null, "Ingrese el tipo de cuenta del cliente (Ahorro, Prestamo o hipoteca)");
                    Double montoH = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto para apertura de cuenta"));
                    Double tazaInterez = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese 0 para calcular el interes"));
                    int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de meses para calcular el interes"));
                    CuentaHipoteca cuen = new CuentaHipoteca(NcuentaH, clienteH, tipoCuentaH, montoH, tazaInterez);
                    cuen.calcularInteres(meses);
                    JOptionPane.showMessageDialog(null, cuen.calcularInteres(meses), "Interés", JOptionPane.INFORMATION_MESSAGE);
                    Banco.grabar();
                    break;
                case 5://Slir
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Elija una opcion válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (continuar);
    }

}
