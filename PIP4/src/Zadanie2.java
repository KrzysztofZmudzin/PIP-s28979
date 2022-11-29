import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        Random random= new Random();

        System.out.println("Podaj liczbę w przedziale 1-6: ");
        int liczba1= scanner.nextInt();
        int liczba2= random.nextInt(6)+1;

        System.out.println("Liczba 1: "+liczba1);
        System.out.println("Liczba 2: "+liczba2);

        if(liczba1<1 || liczba1>6){
            System.out.println("Podano niepoprawna liczbe.");
        }else if(liczba1==liczba2){
            System.out.println("You DIED!!!");
        }else{
            System.out.println("Lucky you.");
        }
    }
}
