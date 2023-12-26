package org.example.class20;

// abstract means something is incomplete
// we cannot create an object of the Abstract class
// every abstract class must participate in the Inheritance
public abstract class Computer {

    /* OPTIONAL      OPTIONAL   MUST      MUST
   access modifier non access modifier dataType name;
     */
    public static String type;
    public String name;
    protected int memory;
    String color;
    public Computer(String name, int memory, String color) {
        this.name = name;
        this.memory = memory;
        this.color = color;
    }

        /*   OPTIONAL         OPTIONAL          MUST     MUST
           access modifier non access modifier returnType name() {}
         */



       abstract void executeCode();
        public abstract void readEmails();
}

class Apple extends Computer{

    public Apple(String name, int memory, String color){
        super(name, memory, color);

    }

    /*when we provide implementation to the abstract classes we MUST follow reules of Overriding !!!
       same method name and parameter MUST be same - method signature MUST be the same
       return type must be same
    */
    void executeCode(){
        System.out.println("Execution code on "+type+" "+name);
    }
   public void readEmails(){
       System.out.println(name+" can read my emails");
    }
}
