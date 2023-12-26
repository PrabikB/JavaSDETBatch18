package org.example.HW;

public abstract class Vehicle {
        private String make;
        private String model;
        private String fuelLevel;

        public Vehicle(String make, String model, String fuelLevel){
            this.make = make;
            this.model = model;
            this.fuelLevel = fuelLevel;
        }
        public abstract void startEngine();
        public abstract void stopEngine();
        public abstract void fuelLevel();
    }
    class Car extends Vehicle {
        public Car(String make, String model, String fuelLevel){
            super(make,model,fuelLevel);
        }

        public void startEngine(){
            System.out.println("Car has a remote start engine function");
        }

        @Override
        public void stopEngine() {
            System.out.println("Car has a push stop engine button");
        }

        @Override
        public void fuelLevel() {
            System.out.println("Car fuel level is full");
        }
    }
    class Truck extends Vehicle {
        public Truck(String make, String model, String fuelLevel){
            super(make, model, fuelLevel);
        }

        @Override
        public void startEngine() {
            System.out.println("This Truck doesn't have a remote start engine fumnction");
        }
        public void stopEngine(){
            System.out.println("This truch doesn't have a push stop engine button");
        }

        @Override
        public void fuelLevel() {
            System.out.println("Truck fuel level is low");
        }
    }
    class Motorcycle extends Vehicle {
        public Motorcycle(String make,String model,String fuelLevel){
            super(make, model, fuelLevel);
        }

        @Override
        public void startEngine() {
            System.out.println("Motorcycle stating the engine");
        }

        @Override
        public void stopEngine() {
            System.out.println("Motercycle stooped the engine");
        }

        @Override
        public void fuelLevel() {
            System.out.println("Motercycle has average fuelLevel");
        }
    }
