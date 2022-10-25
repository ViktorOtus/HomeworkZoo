package animals;


import java.util.*;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    private String getPrefix(int age) {
        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";

        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5)
            old = "лет";
        else if(ageLastNumber >= 2)
            old = "года";
        if (exclusion)
            old = "лет";
        return old;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void say() {
        System.out.print("Я говорю");
    }
    public void go() {
        System.out.print("Я иду");
    }
    public void drink() {
        System.out.print("Я пью");
    }
    public void eat() {
        System.out.print("Я ем");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, color);
    }

    @Override
    public String toString() {
        return  "Привет! Меня зовут " + name + ", " +
                "мне " + age +" " + getPrefix(age) + ", " +
                "я вешу " + weight + " кг" + ", " +
                "мой цвет " + color;
    }
}