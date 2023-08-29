public class Palindrome {
    public static void main(String[] args) {
        int n = 56765;
        int r;
        int sum = 0;
        int temp;
        temp = n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(temp==sum)
        System.out.println("Palindrome number");
        else
        System.out.println("not palindrome");
    }
}
