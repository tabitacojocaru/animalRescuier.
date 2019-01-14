package org.fattrackit;

public class Humans {
    private String name;
    private String sex;
    private int age;

    Humans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public double getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
