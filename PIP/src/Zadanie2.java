import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita w przedziale 1-6: ");
        int liczba1= scanner1.nextInt();

        Random random1= new Random();
        int liczba2= random1.nextInt(6) + 1;
        System.out.println("Liczba 1: " + liczba1 + "     " + "Liczba 2: " + liczba2);


        if (liczba1>liczba2) {
            System.out.println("Liczba 1 jest wieksza od liczby 2.");
        }
            if (liczba1<liczba2) {
                System.out.println("Liczba 1 jest mniejsza od liczby 2.");
            }
            if (liczba1==liczba2) {
                System.out.println("Liczba 1 jest rowna liczbie 2.");
            }



    }
}
