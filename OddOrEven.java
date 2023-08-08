import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        if(num%2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }


    }
}
