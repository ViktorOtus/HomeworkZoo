import animals.Animal;
import birds.Duck;
import data.Commands;
import pets.Cat;
import pets.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Animal> animals = new ArrayList<>();
            while (true) {
                System.out.println("Введите комманду");
                Commands userChose = Commands.valueOf(sc.next().toUpperCase());


                switch (userChose) {
                    case ADD:
                        System.out.println("Введите животное cat/dog/duck");
                        String animalType = sc.next();
                        if (animalType.equals("cat")) {
                            System.out.println("Введите имя");
                            String name = sc.next();
                            System.out.println("Введите возраст");
                            String age = sc.next();
                            System.out.println("Введите вес");
                            String weight = sc.next();
                            System.out.println("Введите цвет");
                            String color = sc.next();
                            Cat animal = new Cat(name, age, weight, color);
                            animal.run();
                            animals.add(animal);
                        } else if (animalType.equals("dog")) {
                            System.out.println("Введите имя");
                            String name = sc.next();
                            System.out.println("Введите возраст");
                            String age = sc.next();
                            System.out.println("Введите вес");
                            String weight = sc.next();
                            System.out.println("Введите цвет");
                            String color = sc.next();
                            Dog animal = new Dog(name, age, weight, color);
                            animal.run();
                            animals.add(animal);
                        } else if (animalType.equals("duck")) {
                            System.out.println("Введите имя");
                            String name = sc.next();
                            System.out.println("Введите возраст");
                            String age = sc.next();
                            System.out.println("Введите вес");
                            String weight = sc.next();
                            System.out.println("Введите цвет");
                            String color = sc.next();
                            Duck animal = new Duck(name, age, weight, color);
                            animal.run();
                            animals.add(animal);
                        }
                        break;
                    case LIST:
                        for (Animal animal: animals) {
                            System.out.println(animal);
                        }
                        break;
                    case EXIT:
                        System.out.println("Завершение");
                        System.exit(0);
                    default:
                        System.out.println("Комманда не найдена");

                }
            }
        }
    }
