package arraylist;

import org.w3c.dom.ls.LSOutput;

public class cartest {
    public static void main(String[] args) {
        car c =  new car("bw");

              System.out.println(c.getName());
        System.out.println(c.getPrice());
        System.out.println(c.getName()+c.getPrice());
        c.gowith("Bent");
    }
}
