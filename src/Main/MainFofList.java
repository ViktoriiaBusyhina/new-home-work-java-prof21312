package Main;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainFofList {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Элем1");
        list.add("Элем2");
        list.add("Элем3");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Элем4");
        list2.add("Элем5");
        list2.add("Элем6");

        list.set(1,"Элем1");
        list.remove("Элем3");

        list2.addAll(list);
    }
    }

