import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        int n = 0;
        while(num!=0){
            int rem = num%10;
            num/=10;
            n = n*10+rem;
        }
        System.out.println("The Reversed number is: "+n);
    }
}
