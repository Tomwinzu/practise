package tomObject;

import java.util.Scanner;

public class goodstest {
    public static void main(String[] args) {

        goods[] shopCar = new goods[100];
        System.out.println(" please select following  command");
        System.out.println(" add ");
        System.out.println( "query");
        System.out.println(" update");
        System.out.println( " pay");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input your command");
        String command = sc.next();
        switch (command) {
            case "add":
                addGoods(shopCar);
                break;
            case "query":
                queryGoods(shopCar);
                break;
            case "update":
                updatetom(shopCar);
                break;
            case "pay":
                payGoods(shopCar);
                break;

        }
    }

   public  static void payGoods(goods[] shopCar) {
    }

    public static void updatetom(goods[] shopCar) {
    }

    public static void queryGoods(goods[] shopCar) {
    }

    public static void addGoods(goods[] shopCar) {

    }


}
