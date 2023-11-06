/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jaime
 */
public class Operaciones {

    private float elemento1;
    private float elemento2;

    private CajaValidacion caja1;
    private CajaValidacion caja2;
    private CajaValidacion resultado;

    public Operaciones(float valor1, float valor2) {
        this.elemento1 = valor1;
        this.elemento2 = valor2;
    }

    public Operaciones() {}

     public float sumar() {
        return this.elemento1 + elemento2;
    }

    public float resta() {
        return this.elemento1 - elemento2;
    }

    public float mul() {
        return this.elemento1 * elemento2;
    }

    public float divi() {
        return this.elemento1 / elemento2;
    }
    public Operaciones(CajaValidacion caja1, CajaValidacion caja2,
            CajaValidacion resultado) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.resultado = resultado;
    }

  public void mostrarResultadosuma() {
    JTextField caja = resultado.getTxtcaja();
    
    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 || elemento2 == 0) {
        String text = "No es posible hacer esta operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "",
                JOptionPane.ERROR_MESSAGE);
    } else {
        float sum = sumar();
        caja.setText(sum + "");
    }
}

public void mostrarResultadoresta() {
    JTextField caja = resultado.getTxtcaja();

    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 || elemento2 == 0) {
        String text = "No es posible hacer esta operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "", 
                JOptionPane.ERROR_MESSAGE);
    } else {
        float sum = resta();
        caja.setText(sum + "");
    }
}

public void mostrarResultadomulti() {
    JTextField caja = resultado.getTxtcaja();

    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 || elemento2 == 0) {
        String text = "No es posible hacer esta operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "", 
                JOptionPane.ERROR_MESSAGE);
    } else {
        float sum = mul();
        caja.setText(sum + "");
    }
}

public void mostrarResultadodiv() {
    JTextField caja = resultado.getTxtcaja();

    elemento1 = caja1.getNumero();
    elemento2 = caja2.getNumero();

    if (elemento1 == 0 || elemento2 == 0) {
        String text = "No es posible hacer esta operación";
        caja.setText(text);
        JOptionPane.showMessageDialog(null, text, "", 
                JOptionPane.ERROR_MESSAGE);
    } else {
        float resultado = divi();
        caja.setText(resultado + "");
    }
}


   
}
