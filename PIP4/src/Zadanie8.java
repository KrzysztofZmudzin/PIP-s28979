import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Wybierz walute: ");
        System.out.println("      1-PLN");
        System.out.println("      2-JPY");
        String waluta= scanner.next();
        switch (waluta){
            case "1":
                System.out.println("Wprowadz kwotę: ");
                double pln= scanner.nextDouble();
                //1pln= 30.83
                double jpy= pln*30.83;
                System.out.println(pln+"zł"+" => "+jpy+"¥");
                break;
            case "2":
                System.out.println("Wprowadz kwote: ");
                double jpy1= scanner.nextDouble();
                double pln1= jpy1/30.83;
                System.out.println(jpy1+"¥"+" => "+pln1+"zl");
                break;
        }
    }
}
