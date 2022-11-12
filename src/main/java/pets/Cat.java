package pets;

import animals.Animal;

public class Cat extends Animal {
    public Cat(String name, String age, String weight, String color) {
        super(name, Integer.parseInt(age), Integer.parseInt(weight), color);
    }
    public static void run(){
        System.out.println("Мяу");
    }



}
