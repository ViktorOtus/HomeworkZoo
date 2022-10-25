package pets;

import animals.Animal;

public class Cat extends Animal {
    public Cat(String name, String age, String weight, String color) {
        super(name, Integer.parseInt(age), Integer.parseInt(String.valueOf(weight)), color);
    }
    public void say() {
        System.out.println("Мяу");
    }



}
