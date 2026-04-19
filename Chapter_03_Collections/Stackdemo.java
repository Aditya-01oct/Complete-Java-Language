
import java.util.Stack;
public class Stackdemo{
    public static void main(String[] args){
        Stack<Integer> sc = new Stack<>();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        System.out.println(sc);
        sc.pop();
        sc.pop();
        System.out.println(sc);
        System.out.println("The top element is: "+sc.peek());
        System.out.println(sc.capacity());
        System.out.println(sc.empty());
    }
}
