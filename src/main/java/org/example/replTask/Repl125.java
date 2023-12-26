package org.example.replTask;

public class Repl125 {
    /*  Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
**Expected Output:**
3
     */
    static int instanceCount = 0;
    public Repl125(){
        instanceCount++;
    }

    public static void main(String[] args) {
        Repl125 obj1 = new Repl125();
        Repl125 obj2 = new Repl125();
        Repl125 obj3 = new Repl125();

        System.out.println(instanceCount);
    }
}
