import java.util.Scanner;
public class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //For loop
        System.out.println("Please enter a number to print the table");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        //while loop
        System.out.println("Please enter a number to print the table");
        int num2 = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num2+" * "+i+" = "+num2*i);
            i++;
        }
        //do-while loop
        System.out.println("Please enter a number to print the table");
        int num3 = sc.nextInt();
        int j = 1;
        do{
            System.out.println(num3+" * "+j+" = "+num3*j);
            j++;
        }while(j<=10);
    }
}