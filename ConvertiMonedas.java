package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
    public void ConvertirPesosMexicanoDolares(double valor){
        double monedaDolar = valor / 20;
        monedaDolar = (double)Math.round(monedaDolar * 100d) / 100 ;
        JOptionPane.showMessageDialog(null, "Tines $ " + monedaDolar + "Dolares");
    }
}