package com.tavisca.bootstrap;

import com.tavisca.util.Gender;
import com.tavisca.vo.Person;

import java.util.*;

public class Starter {

    public static void main(String[] args) {
        try {
            Integer numberOfPersons = Integer.parseInt(args[0]);

            //3 Collection
            Collection<Person> personsList = new ArrayList<Person>();
            for(int i = 0; i < numberOfPersons; i++) {
                personsList.add(
                        new Person(getRandomFirstName(), getRandomLastName(), getRandomGender(), getRandomAge())
                );
            }
            System.out.println("___________________");
            System.out.println("Person List Before Sorting: " + Arrays.toString(personsList.toArray()));
            System.out.println("___________________");
            //Sorting
            Collections.sort((List)personsList, Comparator.comparing(Person::getFirstName)
                    .thenComparing(Person::getLastName)
                    .thenComparingInt(Person::getAge));
            System.out.println("Person List After Sorting: " + personsList);
            System.out.println("___________________");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getRandomFirstName() {
        String[] fNames = {"John", "Mitchel", "Walter", "Ben", "James"};
        Integer i = getRandomNumberWithinRange(0, fNames.length - 1);
        return  fNames[i];
    }

    private static String getRandomLastName() {
        String[] lNames = {"Doe", "Franklin", "Morgan", "Stokes", "White"};
        Integer i = getRandomNumberWithinRange(0, lNames.length - 1);
        return  lNames[i];
    }

    private static Integer getRandomAge() {
        Integer i = getRandomNumberWithinRange(10, 100);
        return  i;
    }

    private static Gender getRandomGender() {
        Integer i = getRandomNumberWithinRange(0, 2);
        return  Gender.values()[i];
    }

    private static Integer getRandomNumberWithinRange(Integer min, Integer max) {
        Integer randomNumber = (int)(Math.random()*((max-min)+1))+min;
        return randomNumber;
    }
}

//class PersonComparator implements Comparator<Person> {
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        return 0;
//    }
//}
