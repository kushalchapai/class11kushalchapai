import java.util.Scanner;

public class ArrayOddEven {
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        int countodd=0;
        int counteven=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i= 0; i<arr.length;i++){
            if(arr[i] % 2 == 0){
                counteven++;
            }else{
                countodd++;
            }
        }

        System.out.println("The number of even number is "+counteven);
        System.out.println("The number of odd number is "+countodd);
        }}
