import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Zadania {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int n= scanner.nextInt();
        System.out.println("Generated array: ");
        int[] array= makeArray(n);
        printArray(array);
        System.out.println("Sorted array: ");
        int[] sortedArray= sortArray(array);
        printArray(sortedArray);
        System.out.println("Reversed sorted array: ");
        int[] reversedArray= reverseArray(sortedArray, n);
        printArray(reversedArray);
        System.out.println("Is second array, the reversed first one? ");
        System.out.println(equalsReverse(sortedArray, reversedArray));


    }
    public static int[] makeArray(int n){
        Random random= new Random();
        int[] array= new int[n];
        for (int i= 0; i < array.length; i++){
            array[i]= random.nextInt(101);
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i= 0; i < array.length; i++){
            System.out.println(i + ". " + array[i]);
        }
    }
    public static int[] sortArray(int[] array){

        int max= 0;
        for (int i= 0; i < array.length; i++) {
            for (int j= i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    max= array[i];
                    array[i]= array[j];
                    array[j]= max;
                }
            }
        }
        return array;
    }
    public static int[] reverseArray(int[] array, int n){
        int temp;
        int[] array1= new int[n];
        for (int i= 0; i < array.length; i++){
            temp= array[i];
            for (int j= array1.length - i - 1; j <= array1.length - i - 1; j++){
                array1[j]= temp;
            }
        }
        return array1;
    }
    public static boolean equalsReverse(int[] sortedArray, int[] reversedArray){
        int n= sortedArray.length;
        int[] comparedArray= reverseArray(reversedArray, n);
        boolean eq= Arrays.equals(sortedArray, comparedArray);
        return eq;
    }
}
