import java.util.Scanner;
public class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("User, Please enter a number.");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The number is a Positive number");
        }
        else if(num<0){
            System.out.println("The number is a Negative number");
        }
        else{
            System.out.println("0 is neither positive nor negative");
        }
    }
}