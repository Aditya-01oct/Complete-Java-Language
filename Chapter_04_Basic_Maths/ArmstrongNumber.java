import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        int org = num;
        int rem = 0,ans = 0;
        while(num!=0){
            rem = num%10;
            num/=10;
            ans += (rem*rem*rem);
        }
        if(org==ans){
            System.out.println(org+" is an Armstrong Number");
        }
        else{
            System.out.println(org+" is not an Armstrong Number");
        }   
    }
}