import java.util.Scanner;
public class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number");
        int num2 = sc.nextInt();
        int gcd = 1;
        for(int i=2;i<=Math.min(num1,num2);i++){
            if((num1%i==0)&&(num2%i==0)){
                gcd = i;
            }
        }
        System.out.println("The Greates Common Divisor of "+num1 + " and "+num2 +" is "+ gcd);
    }
}
