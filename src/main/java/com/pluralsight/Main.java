package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        boolean done = false;
//        Scanner scanner = new Scanner(System.in);
//        String input;
//
//        ArrayList<Person> people = getPeople();
//        ArrayList<Person> foundPeople;
//
//        while(!done){
//            System.out.println("Please enter name: (0 to exit)");
//            input = scanner.nextLine();
//            if(input.equalsIgnoreCase("0")){
//                done = true;
//                break;
//            }
//            else {
//                foundPeople = getSameName(input, people);
//            }
//            System.out.println("People with name " + input);
//            printPeople(foundPeople);
//            getAverageAge(foundPeople);
//            findYoungest(foundPeople);
//            findOldest(foundPeople);
//        }
//        String lastInput = scanner.nextLine();
//        ArrayList<Person> matchingPeople = people.stream()
//                .filter(person -> person.getLastName().equalsIgnoreCase(lastInput))
//                .collect(Collectors.toCollection(ArrayList::new));
//        matchingPeople.forEach(System.out::println);
//
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// get the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (temp, num)-> temp += num);
        System.out.println(sum);
    }
    public static ArrayList<Person> getPeople(){
        ArrayList<Person> people = new ArrayList<>();
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
        return people;
    }

    public static ArrayList<Person> getSameName(String input, ArrayList<Person> people){
        ArrayList<Person> foundPeople = new ArrayList<>();
        for(Person person: people){
            if (person.getFirstName().equalsIgnoreCase(input)||person.getLastName().equalsIgnoreCase(input)){
                foundPeople.add(person);
            }
        }
        return foundPeople;
    }
    public static void printPeople(ArrayList<Person> people){
        for (Person person: people){
            System.out.println(person.toString());
        }
    }
    public static void getAverageAge(ArrayList<Person> people){
        double totalAge = 0;
        double curAge = 0;
        for(Person person: people){
            curAge = person.getAge();
            System.out.println(person.toString());
            totalAge += curAge;
        }
        System.out.println("Average age is " + totalAge/people.size());
    }
    public static void findYoungest(ArrayList<Person> people){
        int youngest = 100;
        for(Person person : people){
            if(person.getAge()<youngest){
                youngest =person.getAge();
            }
        }
        System.out.println("Youngest is " + youngest + " years old");
    }
    public static void findOldest(ArrayList<Person> people){
        int oldest = 0;
        for(Person person : people){
            if(person.getAge()> oldest){
                oldest =person.getAge();
            }
        }
        System.out.println("Youngest is " + oldest + " years old");
    }
}
