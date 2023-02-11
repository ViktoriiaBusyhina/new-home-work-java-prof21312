package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();

        map.put("Berlin", 3645);
        map.put("Praga", 2999);
        map.put("Leipzig", 5900);

        Set<String> set = map.keySet();

        for (String s : set) {

            
        }
            
            
            
        


        Integer mark = map.get(city);
        System.out.println(mark);


    }
}
