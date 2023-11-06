/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author jaime
 */

public class CajaValidacion {
    
    private JLabel lblError;
    private JTextField txtCaja;

    public CajaValidacion(JLabel lblError, JTextField txtCaja) {
        this.lblError = lblError;
        this.txtCaja = txtCaja;
    }
    
    public float getNumero() {
        lblError.setText("");
        String elemento2 = txtCaja.getText().trim();
        
        if (elemento2.isEmpty()) {
            lblError.setText("Campo vacío");
            return 0;
        }
        
        try {
            return Float.parseFloat(elemento2);
        } catch (NumberFormatException ex) {
            lblError.setText("Número inválido");
            return 0;
        }
    }

    public JLabel getLblError() {
        return lblError;
    }

    public void setLblError(JLabel lblError) {
        this.lblError = lblError;
    }

    public JTextField getTxtcaja() {
        return txtCaja;
    }

    public void setTxtcaja(JTextField txtcaja) {
        this.txtCaja = txtcaja;
    }
}

