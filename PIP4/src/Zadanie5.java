import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double a= scanner.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double b= scanner.nextDouble();
        int a1= (int) a;
        int b1= (int) b;

        System.out.println("Wybrane liczby to: "+a1+", "+b1);
        System.out.println("-------------------------");
        System.out.println("Co chesz z nimi zrobic?");
        System.out.println("");
        System.out.println("ADD- dodawanie");
        System.out.println("SUB- odejmowanie");
        System.out.println("DIV- dzielenie");
        System.out.println("MUL- mnozenie");

        String opcja= scanner.next();
        switch (opcja){
            case "ADD":
                int suma= ADD(a1, b1);
                System.out.println("Wynik dodawania: "+suma);
                int modul1= absoluteValue(suma);
                break;
            case "SUB":
                int roznica= SUB(a1, b1);
                System.out.println("Wynik odejmowania: "+roznica);
                int modul2= absoluteValue(roznica);
                break;
            case "DIV":
                int iloraz= DIV(a1, b1);
                System.out.println("Wynik dzielenia: "+iloraz);
                int modul3= absoluteValue(iloraz);
                break;
            case "MUL":
                int iloczyn= MUL(a1, b1);
                System.out.println("Wynik dzielenia: "+iloczyn);
                int modul4= absoluteValue(iloczyn);
                break;
        }
    }
    public static int ADD(int a, int b){
        int wynik= a+b;
        return wynik;
    }
    public static int SUB(int a, int b){
        int wynik= a-b;
        return wynik;
    }
    public static int DIV(int a, int b){
        int wynik= a/b;
        return wynik;
    }
    public static int MUL(int a, int b){
        int wynik= a*b;
        return wynik;
    }
    public static int absoluteValue(int wynik){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Czy chesz policzyc wartosc bezwzgledna? Y/N");
        String opcja= scanner.next();
        switch (opcja){
            case "Y":
                if(wynik<0){
                    wynik= wynik* -1;
                    System.out.println("Wartosc bezwzgledna: "+wynik);
                }else{
                    wynik= wynik;
                    System.out.println("Wartosc bezwzgledna: "+wynik);
                }
                break;
            case "N":
                System.out.println("Nie wykonuje kalkulacji.");
                break;
        }
        return wynik;
    }
}
