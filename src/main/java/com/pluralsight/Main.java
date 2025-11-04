package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scanner = new Scanner(System.in);
        String input;
        int totalAge = 0;

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Person> foundPeople = new ArrayList<>();

        people.add(new Person("Alice", "Smith", 30));
        people.add(new Person("Bob", "Johnson", 24));
        people.add(new Person("Charlie", "Brown", 55));
        people.add(new Person("Dana", "Miller", 41));
        people.add(new Person("Ethan", "Davis", 19));
        people.add(new Person("Fiona", "George", 62));
        people.add(new Person("George", "Rodriguez", 38));
        people.add(new Person("Hannah", "Martinez", 28));
        people.add(new Person("Ivy", "Hernandez", 70));
        people.add(new Person("Jack", "George", 33));

        while(!done){
            System.out.println("Please enter name: (0 to exit)");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("0")){
                done = true;
                break;
            }
            else {
                for(Person person:people){
                    if (person.getFirstName().equalsIgnoreCase(input)||person.getLastName().equalsIgnoreCase(input)){
                        foundPeople.add(person);
                    }
                }
            }
            System.out.println("People with name " + input);
            for (Person person: foundPeople){
                System.out.println(person);
                totalAge += person.getAge();
            }
            System.out.println("Average age is " + (totalAge/foundPeople.size()));
        }

    }
}
