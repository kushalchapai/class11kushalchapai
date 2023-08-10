import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args) {
        int number;
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
    
        if (number <= 1) {
            System.out.println("It cannot defined ");
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
               System.out.println("The number is not prime  ");
            }
            else{
                System.out.println("The number is prime ");
            }
        }
    }
}

