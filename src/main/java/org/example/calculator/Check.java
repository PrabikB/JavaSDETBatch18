package org.example.calculator;

public class Check {
    private void overloadedMethod(int x) {
        System.out.println("Called overloadedMethod with int: " + x);
    }

    private void overloadedMethod(double y) {
        System.out.println("Called overloadedMethod with double: " + y);
    }

    private void overloadedMethod(String str) {
        System.out.println("Called overloadedMethod with String: " + str);
    }

    public void callOverloadedMethods() {
        // Call each overloaded method with specific arguments
        overloadedMethod(42);
        overloadedMethod(3.14);
        overloadedMethod("Hello, Overloading!");
    }

    public static void main(String[] args) {
        Check example = new Check();
        example.callOverloadedMethods();
    }
}
