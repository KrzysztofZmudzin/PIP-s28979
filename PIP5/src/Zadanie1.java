import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.printf("Podaj liczbe calkowita: ");
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(wyswielt0doN(n));
    }

    public static int wyswielt0doN(int n){
        if (n>0){
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
        }else if (n<0){
            for (int i = 0; i > n; i--){
                System.out.println(i);
            }
        }else{
            System.out.println("0");
        }
        return n;
    }
}
