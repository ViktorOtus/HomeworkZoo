package birds;

import animals.Animal;
import animals.Fly;

public class Duck extends Animal implements Fly {

    public Duck(String name, String age, String weight, String color) {
        super(name, Integer.parseInt(String.valueOf(age)), Integer.parseInt(String.valueOf(weight)), color);
    }

    public void say() {
        System.out.println("Кря");
    }
    public void fly() {
        System.out.println("Я лечу");
    }
}
