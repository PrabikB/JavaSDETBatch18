package org.example.class15;

public class Teacher {
    private String name;
    private String address;


    public Teacher(String name,String address){
        this.name = name;
        this.address = address;
    }
    public void displayInfo(){
        System.out.println(name + " " +address);

    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Ashgar","Pakistan");
        t.displayInfo();
    }
}
