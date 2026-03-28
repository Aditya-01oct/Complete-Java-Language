import java.util.*;
public class Hashmapdemo{
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Aditya");
        map.put(4,"Ashu");
        map.put(3,"Muskan");
        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Ashu"));
        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }
    }
}