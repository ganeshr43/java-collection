package com.tavisca.vo;

import com.tavisca.util.Gender;

//import java.util.Comparator;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Integer age;

    public Person(String firstName, String lastName, Gender gender, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return  firstName.toLowerCase().substring(0, 1).toUpperCase()
                + " " + lastName.toLowerCase().substring(0, 1).toUpperCase();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nPerson [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender +", age=" + age + "]";
    }

//    @Override
//    public int compare(Person o1, Person o2) {
//        Integer fNameComparison = o1.firstName.compareTo(o2.firstName);
//        if (fNameComparison > 0 || fNameComparison < 0)
//            return fNameComparison;
//        else {
//            Integer lNameComparison = o1.lastName.compareTo(o2.lastName);
//            if (lNameComparison > 0 || lNameComparison < 0)
//                return lNameComparison;
//            else {
//                Integer ageComparison = o1.age.compareTo(o2.age);
//                return ageComparison;
//            }
//        }
//    }
}
