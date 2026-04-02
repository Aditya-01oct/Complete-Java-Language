import java.util.*;
public class VectorDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        System.out.println("Please enter the number of elements.");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Please enter "+i+" element");
            v.add(sc.nextInt());
        }
        System.out.println("The elements in Vector are: "+v);
    }
}