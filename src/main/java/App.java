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

                String userInput = sc.next().toUpperCase();

                boolean isExist = false;
                for (Commands command: Commands.values()) {
                    if (command.name().equals(userInput)) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    System.out.println("Комманда не найдена");
                    continue;
                }

                Commands userChose = Commands.valueOf(userInput);


                switch (userChose) {
                    case ADD:
                        System.out.println("Введите животное cat/dog/duck");
                        String animalType = sc.next();

                            System.out.println("Введите имя");
                            String name = sc.next();
                            String age = "";
                            String weight = "";
                            while (true) {
                                System.out.println("Введите возраст");
                                age = sc.next();
                                int ageInt = 0;
                                try {
                                    ageInt = Integer.parseInt(age);

                                } catch (NumberFormatException ignore) {
                                    System.out.println("Введите число");
                                    continue;
                                }
                                if (ageInt > 0) {
                                    break;
                                }
                                System.out.println("Введен неверный возраст");
                            }
                            while (true) {
                                System.out.println("Введите вес");
                                weight = sc.next();
                                int weightInt = 0;
                                try {
                                    weightInt = Integer.parseInt(weight);

                                } catch (NumberFormatException ignore) {
                                    System.out.println("Введите число");
                                    continue;
                                }
                                if (weightInt > 0) {
                                    break;
                                }
                                System.out.println("Введен неверный вес");
                            }
                            }
                            System.out.println("Введите цвет");
                            String color = sc.next();
                            Animal animal = null;

                        if (animalType.equals("cat")) {
                            animal = new Cat(name, age, weight, color);
                        } else if (animalType.equals("dog")) {
                            animal = new Dog(name, age, weight, color);
                        } else if (animalType.equals("duck")) {
                            animal = new Duck(name, age, weight, color);
                        }
                        animal.say();
                        animals.add(animal);
                        break;
                    case LIST:
                        for (Animal item: animals) {
                            System.out.println(item);
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
