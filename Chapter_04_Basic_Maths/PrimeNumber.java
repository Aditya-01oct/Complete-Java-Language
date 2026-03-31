import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        boolean ans = false;
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                ans = true;
                break;
            }
        }
        if(ans == true){
            System.out.println(num+" is not a Prime Number");
        }
        else{
            System.out.println(num+" is a Prime Number");
        }
    }
}
