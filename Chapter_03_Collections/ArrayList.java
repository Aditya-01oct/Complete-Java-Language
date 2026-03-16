import java.util.*;
public class Array_List{
    public static void main(String[] args) {
        // Creating ArrayLists
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // ---------------- ADD METHODS ----------------
        list.add(10);                 // add(E element)
        list.add(20);
        list.add(30);
        list.add(1, 15);              // add(index, element)
        list2.add(100);
        list2.add(200);
        list.addAll(list2);           // addAll(Collection)
        list.addAll(2, list2);        // addAll(index, Collection)
        // ---------------- ACCESS METHODS ----------------
        int value = list.get(0);      // get(index)
        System.out.println("Value at index 0: " + value);
        // ---------------- UPDATE METHODS ----------------
        list.set(1, 50);              // set(index, element)
        // ---------------- REMOVE METHODS ----------------
        list.remove(0);               // remove(index)
        list.remove(Integer.valueOf(100)); // remove(Object)
        list.removeAll(list2);        // removeAll(Collection)
        list.addAll(list2);
        list.retainAll(list2);        // retainAll(Collection)
        // ---------------- SEARCH METHODS ----------------
        System.out.println("Contains 200: " + list.contains(200)); // contains()
        System.out.println("Index of 200: " + list.indexOf(200));   // indexOf()
        list.add(200);
        System.out.println("Last Index of 200: " + list.lastIndexOf(200)); // lastIndexOf()
        // ---------------- SIZE & STATUS ----------------
        System.out.println("Size: " + list.size());   // size()
        System.out.println("Is Empty: " + list.isEmpty()); // isEmpty()
        // ---------------- ARRAY CONVERSION ----------------
        Object[] arr = list.toArray();                 // toArray()
        Integer[] arr2 = list.toArray(new Integer[0]); // toArray(T[])
        // ---------------- CLONE ----------------
        ArrayList<Integer> copy = (ArrayList<Integer>) list.clone(); // clone()
        // ---------------- CAPACITY METHODS ----------------
        list.ensureCapacity(20);   // ensureCapacity()
        list.trimToSize();         // trimToSize()
        // ---------------- SUBLIST ----------------
        List<Integer> sub = list.subList(0, list.size()); // subList()
        // ---------------- MODIFY ELEMENTS ----------------
        list.replaceAll(n -> n * 2);   // replaceAll()
        // ---------------- SORT ----------------
        Collections.sort(list);       // sort()
        // ---------------- TRAVERSAL ----------------
        System.out.println("Using forEach:");
        list.forEach(n -> System.out.println(n)); // forEach()
        System.out.println("Using Iterator:");
        Iterator<Integer> it = list.iterator();   // iterator()
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // ---------------- CLEAR ----------------
        list.clear();                 // clear()
        System.out.println("After clear size: " + list.size());
    }
}
