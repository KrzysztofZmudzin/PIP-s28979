import java.util.Scanner;

public class TreningPiramida {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe calkowita [1, 100]");
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        piramida(n);
        piramida(n);
    }
    public static void piramida(int n){

        for (int i = 0; i < n; i++) {
            for (int j= 1 + i; j < n; j++){
                System.out.print(" ");
            }
            for (int k= n - i; k <= n; k++){
                System.out.print("*");
            }
            for (int l= n + i; l > n; l--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i= 1; i < n; i++){
            for (int j= n - i; j < n; j++){
                System.out.print(" ");
            }
            for (int k= 1 + i; k < n; k++){
                System.out.print("*");
            }
            for (int l= i; l < n; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
