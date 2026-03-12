import java.util.Scanner;
public class Function{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        System.out.println("\nFactorial of "+num+" is "+Factorial(num));
    }
    public static int Factorial(int num){
    int res = 1;
    for(int i = num;i>1;i--){
        res = i*res;
        System.out.print(res+" ");
    }
    return res;
}
}