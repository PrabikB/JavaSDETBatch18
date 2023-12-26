package org.example.class19;

public class E2Poly {
    public static void main(String[] args) {


        Dog d1 = new Dog("Jacky", "Brown", 10, 25);
        Dog d2 = new Dog("Macky", "Black", 10, 25);
        Cat c1 = new Cat("Meo", "White", 2, 13);
        Cat c2 = new Cat("Neo", "Grey", 1, 12);
        Animal a1 = new Animal("Animal", "Black", 10, 25);


        Animal[] arr = {d1, d2, c1, c2, a1};

        Animal animal = arr[1];
        animal.printInfo();

        Cat c = (Cat) arr[2];
        c.printInfo();

    }
}
