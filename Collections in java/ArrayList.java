import java.util.Scanner;
import java.util.ArrayList;
public class Array_List{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arrlist = new ArrayList <Integer>();
        //1.Adding elements in an arrayList
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);
        arrlist.add(3,45);
        arrlist.set(3,30);
        //2. removing an element from the arraylist
        arrlist.remove(2);
        //3.Traversing arrayList
        for(int x: arrlist){
            System.out.print(x+" "); //using element method
        }
        System.out.println();
        for(int i = 0;i<arrlist.size();i++){
            System.out.print(arrlist.get(i)+" ");//using pointer method or using get() function
        }
        System.out.println();
        System.out.println(arrlist);
        //4.Checking existance
        System.out.println(arrlist.contains(50));
        System.out.println(arrlist.contains(100));
    }
}
