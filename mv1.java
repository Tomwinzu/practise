package arraylist;

public class mv1 {
    private String name;

    private int age;
    private char sex;




    public mv1 () {
        System.out.println("this not re");


   }
 public mv1 (String name,int age,char sex) {
     this.name=name;this.age=age;this.sex=sex;

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}


