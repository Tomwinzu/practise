package arraylist;

import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList <Integer>  list = new ArrayList<>();
        list.add(89);
        list.add(60);
        list.add(80);
        list.add(69);
        list.add(50);
        list.add(100);
        System.out.println(list);

        //for (int i = list.size()-1 ; i >=0 ; i--) {
           // int list1 =list.get(i);
  //if (list1 < 80) {
     // list.remove(i);
                        //    }
       // }

       // System.out.println(list);


        for (int i = 0; i < list.size(); i++) {

            int list1 = list.get(i);

            if (list1 < 80) {
                list.remove(i);
                i--;

        }

        }
        System.out.println(list);
    }
}
