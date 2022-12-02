import javax.swing.*;
import java.util.Objects;

public class ZadanieDodatkowe {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Witam w kantorze!");

        int answer=JOptionPane.showConfirmDialog(null, "Kontynuowac?");
        System.out.println(answer);

        if (answer==0){
            String waluta= JOptionPane.showInputDialog(null, "Wybiez walute: " +
                    "1- PLN" + ", " + "2- JPY");
            if (Objects.equals(waluta, "1")){
               JOptionPane.showMessageDialog(null, "Wymiana PLN na JPY.");
               String pln1= JOptionPane.showInputDialog(null, "Podaj ilosc: ");
               double pln11= Double.parseDouble(pln1);
               double jpy1= pln11*30.83;
               JOptionPane.showMessageDialog(null, pln11 + " PLN " + "= " + jpy1 + " JPY");
            }else if (Objects.equals(waluta, "2")){
                JOptionPane.showMessageDialog(null,"Wymiana JPY na PLN.");
                String jpy2= JOptionPane.showInputDialog(null, "Podaj ilosc: ");
                double jpy22= Double.parseDouble(jpy2);
                double pln2= jpy22/30.83;
                JOptionPane.showMessageDialog(null, jpy22 + " JPY " + "= " + pln2 + " PLN");
            }else{
                JOptionPane.showMessageDialog(null, "Zamykam kantor.");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Zamykam kantor.");
        }

    }
}



