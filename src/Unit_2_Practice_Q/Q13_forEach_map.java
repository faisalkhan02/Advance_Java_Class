package Unit_2_Practice_Q;
import java.util.HashMap;
import java.util.Map;

// Use forEach() on a Map<Integer,String>to:
// print key and values
// print only keys greater than 100




public class Q13_forEach_map {
    public static void main(String[] args) {
        Map<Integer,String> map1 =new HashMap <>();
        map1.put(112,"Faisal Khan");
        map1.put(41,"Gaurav");
        map1.put(55,"Hemant");
        map1.put(50,"Deepak");
        map1.put(150,"Devansh");
        map1.put(250,"Talib");
        map1.put(530,"AAtir");
        map1.put(350,"Aman");
        map1.put(30,"None");

        map1.forEach((key,value) -> System.out.println("key: "+key+"  value: "+value));

        System.out.println("\n=== key greater than 100 ===");
        map1.forEach((key,value)->{
            if(key>100) System.out.println(key);
        });
    }
}
