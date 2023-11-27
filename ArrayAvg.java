import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int a[] = new int[5];
        System.out.println("Enter the elements");

        for(int i = 0;i<5;i++){
            a[i]=sc.nextInt();
        }

        int sum =0;
        for(int i = 0; i<a.length;i++){
            sum = sum + a[i];
        }

        double avg = sum/5;

        System.out.println("The average is "+avg);

    }
}
