package pl.sdacademy.java.basic.exercises.day1;

public class Task6 {
    public static void main(String[] args) {
       // for (int i = 1; i <=4 ; i++) {
          //  int result = 5 * 1;
          //  System.out.println("5 x " + i + " = "  + result);

            printMultiplicationTable(7, 3, 8);

       // }
    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (int i=minMultiplicand; i<=maxMultiplicand; i++){
            System.out.println(multiplier + " x " + i + " = " + (multiplier * i) );
       }



    }
}
