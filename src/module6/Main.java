package module6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // creates ArrayList to store 10 Student objects
        ArrayList<Student> students = new ArrayList<>();

        // adds sample student data with random addresses.
        students.add(new Student(5, "Jeff", "42 Maple Ridge Lane"));
        students.add(new Student(2, "Anna", "19 Crescent Hollow"));
        students.add(new Student(9, "Mike", "301 Riverbend Court"));
        students.add(new Student(1, "Zara", "88 Pine Orchard Way"));
        students.add(new Student(7, "Chris", "12 Willow Crest Drive"));
        students.add(new Student(3, "Bella", "77 Oak Lantern Street"));
        students.add(new Student(10, "Sam", "5 Briarwood Terrace"));
        students.add(new Student(4, "Nina", "230 Silverbrook Trail"));
        students.add(new Student(6, "Omar", "14 Meadowstone Circle"));
        students.add(new Student(8, "Liam", "93 Autumn Gate Road"));

        // checks for duplicate roll numbers in the list
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getRollno() == students.get(j).getRollno()) {
                    System.out.println("\nWARNING: Duplicate roll number detected in the following entries:");
                    System.out.println(students.get(i));
                    System.out.println(students.get(j));
                }
            }
        }

        
        // prints the original unsorted list.
        System.out.println("Original List:");
        students.forEach(System.out::println);

        // sorts by name using NameComparator and print results.
        System.out.println("\nSorted by Name:");
        SelectionSort.sort(students, new NameComparator());
        students.forEach(System.out::println);

        // sorts by roll number using RollComparator and print results.
        System.out.println("\nSorted by Roll Number:");
        SelectionSort.sort(students, new RollComparator());
        students.forEach(System.out::println);
    }
}
