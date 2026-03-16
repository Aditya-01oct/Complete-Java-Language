import java.util.ArrayList;
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);
        // 2. get()
        System.out.println("Element at index 1: " + list.get(1));
        // 3. set()
        list.set(1, 100);
        System.out.println("After set: " + list);
        // 4. remove()
        list.remove(0);
        System.out.println("After remove: " + list);
        // 5. size()
        System.out.println("Size of list: " + list.size());
        // 6. contains()
        System.out.println("Contains 30: " + list.contains(30));
        // 7. isEmpty()
        System.out.println("Is list empty: " + list.isEmpty());
        // 8. indexOf()
        System.out.println("Index of 30: " + list.indexOf(30));
        // 9. addAll()
        list2.add(50);
        list2.add(60);
        list.addAll(list2);
        System.out.println("After addAll: " + list);
        System.out.println(list.lastIndexOf(30));

    }
}
