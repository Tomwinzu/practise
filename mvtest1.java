package arraylist;

public class mvtest1 {
    public static void main(String[] args) {

        mv1 s= new mv1();
        s.setName("win");
        s.setSex('e');
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSex());
        mv1 s2=new mv1("Tom",24,'F');
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());
    }
}

