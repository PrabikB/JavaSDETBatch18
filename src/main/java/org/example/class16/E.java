package org.example.class16;
/*Write program to inherit class E that has method printF
which is static and call or reuse that method into class F
 */
public class E {
    public static void printF(){
        System.out.println("Hello Batch18");
    }

}
class F extends E{

    }
    class ETester{
        public static void main(String[] args) {
            F.printF();
        }
    }

