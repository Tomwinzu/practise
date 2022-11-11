package javabean;

public class testdemo {
    public static void main(String[] args) {
        user u1 = new user();
        u1.setName("Tom");
        u1.setHeight(183.0);
        u1.setAge(45);
        u1.setSex('M');
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getAge());
        System.out.println(u1.getSex());
    }
}
