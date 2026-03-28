import java.util.LinkedList;
public class LL{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.addFirst(0);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");
    }
}