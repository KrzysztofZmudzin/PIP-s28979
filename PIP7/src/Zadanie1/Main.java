package Zadanie1;

public class Main {
    public static void main(String[] args) {

        Student student= new Student();
        student.name= "Krzysztof Zmudzin";
        student.indexNumber= 28979;

        Student student1= new Student();

        System.out.println(student.name + " " + student.indexNumber + ", " + student1.name + " " + student1.indexNumber);
    }
}
