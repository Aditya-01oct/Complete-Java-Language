import java.util.Scanner;
public class InputOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi, "+name+" Nice meeting you.");
        System.out.println("Thank You");
        sc.close();
    }
}
