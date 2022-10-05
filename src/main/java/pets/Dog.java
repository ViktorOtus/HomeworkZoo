package pets;

import animals.Animal;

public class Dog extends Animal {
    public Dog(String name, String age, String weight, String color) {
        super(name, Integer.parseInt(String.valueOf(age)), Integer.parseInt(String.valueOf(weight)), color);
    }
    public static void run(){
        System.out.println("Гав");

    }

}