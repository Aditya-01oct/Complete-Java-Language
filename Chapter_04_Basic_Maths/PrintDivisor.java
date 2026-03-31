import java.util.Scanner;
public class PrintDivisors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num =sc.nextInt();
        System.out.println("The Divisors upto number "+num);
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
