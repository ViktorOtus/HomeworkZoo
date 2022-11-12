package birds;

import animals.Animal;
import animals.Fly;

public class Duck extends Animal implements Fly {

    public Duck(String name, String age, String weight, String color) {
        super(name, Integer.parseInt(age), Integer.parseInt(weight), color);
    }
    public static void run() {
        System.out.println("Кря");
    }
    public static void fly(String[] args) {
        System.out.println("Я лечу");
    }
    @Override
    public void fly() {
    }
}
