import java.util.Scanner;

public class TablicaWyklad2 {
    public static void main(String[] args) {
        System.out.println("Jaki rozmiar tablicy?");
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();

        long[] tab= new long[n];
        for (int i= 0; i < n; i++){
            System.out.println("Podaj ocene " + (i + 1) + " : ");
            tab[i]= scanner.nextLong();
        }

        for (int j= 0; j < n; j++){
            System.out.println(tab[j]);
        }
    }
}
