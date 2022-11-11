package arraylist;

import java.util.ArrayList;

public class arraylistdemo {

    public static void main(String[] args) {


    ArrayList<String> list = new ArrayList<>();

    list.add("Tom");
    list.add("tom");
    list.add("java");
    list.add("hook");
    list.add("hero");
    list.add("java");
    //list.add(12);
        list.add(1,"is");
        System.out.println(list);
 String r= list.remove(2);
        System.out.println(r);
        System.out.println(list);
        System.out.println(list.size());
        String e= list.get(3);
        System.out.println(e);
        System.out.println(list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));}
        System.out.println(list);
            System.out.println(list.remove("java"));
        System.out.println(list);

        String e1= list.set(0,"william");
        System.out.println(e1);
        System.out.println(list);

    }


}
