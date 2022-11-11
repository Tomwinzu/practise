package javabean;

public class user {
    private String name;
    private Double height;
    private int age;
    private char sex;

    public user(String name, Double height, int age, char sex) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.sex = sex;
    }

    public user() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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