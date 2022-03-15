package com.company;
import java.util.Scanner;

class Animal{
    private String animalName;
    public String getAnimalName(){
        return animalName;
    }

    private String food;
    public String getFood(){
        return food;
    }

    private String location;
    public String getLocation(){
        return location;
    }
    private String age;
    public String getAge(){
        return age;
    }

    public Animal(String food, String location, String animalName, String age){
        this.food = food;
        this.location = location;
        this.animalName = animalName;
        this.age = age;
    }

    public void makeNoise(){
        System.out.println("издаёт звук.");
    }
    public void eat(){
        System.out.println("ест.");
    }
    public void sleep(){
        System.out.println("спит.");
    }
}
class Wolf extends Animal{

    String sound = "А-у-у"; // есть кто живой ?
    public Wolf(String food,String location, String animalName, String age){
        super(food, location, animalName, age);
    }

    public void makeNoise(){
        System.out.printf("Волк %s издаёт звук %s \n", getAnimalName(), sound);
    }
    public void eat(){
        System.out.printf("Волк %s хочет есть %s \n", getAnimalName(), getFood());
    }
    public void sleep(){
        System.out.printf("Волк %s после обследования врача уснул. \n", getAnimalName());
    }
    public void age(){
        System.out.printf("Волку %s уже %s лет \n", getAnimalName(), getAge());
        }
    }


class Fox extends Animal{

    String sound = "Фр";
    public Fox(String food,String location, String animalName, String age){
        super(food, location, animalName, age);
    }

    public void makeNoise(){
        System.out.printf("Лиса %s издаёт звук %s \n", getAnimalName(), sound);
    }
    public void eat(){
        System.out.printf("Лиса %s хочет есть %s \n", getAnimalName(), getFood());
    }
    public void sleep(){
        System.out.printf("Лиса %s после обследования врача уснул(а). \n", getAnimalName());
    }
    public void age(){
        System.out.printf("Лисе %s уже %s лет \n", getAnimalName(), getAge());
    }
}

class Veterinarian extends Animal{

    public Veterinarian(String food, String location, String animalName, String age){
        super(food, location, animalName, age);
    }
    void treatAnimal(){
        System.out.printf("Врач приехал в %s, где вылечил %s от отравления от %s \n", getLocation(), getAnimalName(), getFood());
    }
}

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите желаемый вид животного (Fox, Wolf): "); // что есть то есть )
        String animal = in.nextLine();
        System.out.print("Введите название еды: ");
        String food = in.nextLine();
        System.out.print("Введите имя животного: ");
        String name = in.nextLine();
        System.out.print("Введите возраст животного: ");
        String age = in.nextLine();
        System.out.print("Введите здание, в котором находится животное: ");
        String location = in.nextLine();
        Veterinarian veterinarian = new Veterinarian(food, location, name, age);
        switch (animal) {

            case ("Fox"), ("fox"), ("Лиса"), ("лиса"):
                Fox fox = new Fox(food, location, name, age);
                fox.age();
                fox.eat();
                fox.makeNoise();
                veterinarian.treatAnimal();
                fox.sleep();
                break;
            case ("Wolf"), ("wolf"),("Волк"), ("волк"):
                Wolf wolf = new Wolf(food, location, name, age);
                wolf.eat();
                wolf.age();
                wolf.makeNoise();
                veterinarian.treatAnimal();
                wolf.sleep();

                break;
            default:
                System.out.println("Введено некорректное название вида животного.");
        }
    }
}
