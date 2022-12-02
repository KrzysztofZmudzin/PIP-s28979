import javax.swing.*;
import java.util.Objects;

public class KantorUproszczony {
    public static void main(String[] args) {
        String waluta = JOptionPane.showInputDialog(null, "Wybiez walute: " +
                "1- PLN" + ", " + "2- JPY");
        if (Objects.equals(waluta, "1")) {
            String pln1= JOptionPane.showInputDialog(null, "Podaj ilosc w PLN: ");
            double pln11= Double.parseDouble(pln1);
            double jpy1= pln11 * 30.83;
            JOptionPane.showMessageDialog(null, pln11 + "PLN" + " = " + jpy1 + " JPY");
        }else if (Objects.equals(waluta, "2")){
            String jpy2= JOptionPane.showInputDialog(null, "Podaj ilosc: ");
            double jpy22= Double.parseDouble(jpy2);
            double pln2= jpy22/30.83;
            JOptionPane.showMessageDialog(null, jpy22 + "JPY" + " = " + pln2 + " PLN");
        }else{
            JOptionPane.showMessageDialog(null, "Zamykam kantor.");
        }
    }
}
