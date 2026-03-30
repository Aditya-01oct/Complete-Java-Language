import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        int n = num;
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;
            rev = rev*10+rem;
        }
        if(num==rev){
            System.out.println(num+" is a Palindrome Number");
        }
        else{
            System.out.println(num+" is not a Palindrome Number");
        }
    }
}
