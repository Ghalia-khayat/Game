import java.util.Random;
import java.util.Scanner;



public class Game {
    public static void main(String[] args) {

        Random rnd = new Random();
        int i = 100 ;
        int number = rnd.nextInt( i ) + 5;
        int UserNumber ;

        Scanner sc = new Scanner(System.in);

        boolean correct = false ;

        while (!correct) {
            System.out.println("Insert a number");
            UserNumber = sc.nextInt() ;


            if (UserNumber == number) {
                correct = true ;
                System.out.println("Congratulations");
            }
           else if (UserNumber > number) {
                System.out.println("Sorry! ");
                System.out.println("Try a lower number");

            }
           else if (UserNumber < number) {
                System.out.println("Sorry!");
                System.out.println("Try a higher number");

            }


        }


    }
}

