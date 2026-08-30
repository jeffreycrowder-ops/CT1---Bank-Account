package module6;

// comparator to sort Student objects alphabetically by name.

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

 // compare() returns negative, zero, or positive depending on alphabetical order.
 @Override
 public int compare(Student s1, Student s2) {
     return s1.getName().compareToIgnoreCase(s2.getName());
 }
}
