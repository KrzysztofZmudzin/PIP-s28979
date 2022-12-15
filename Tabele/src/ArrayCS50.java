import java.util.Scanner;

public class ArrayCS50 {
    public static void main(String[] args) {

        System.out.println("How many scores?");
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[] scores= new int[n];

        for (int i= 0; i < n; i++) {
            System.out.println("What's the score?");
            scores[i] = scanner.nextInt();
        }
        for (int j= 0; j < n; j++){
            System.out.println("Score " + (j + 1) + "= " + scores[j]);
        }
        System.out.println("Average score: " + (scores[0] + scores[1] + scores[2]) / n);
    }
}
