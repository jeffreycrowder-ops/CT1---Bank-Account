package module6;

// comparator to sort Student objects by roll number.

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {

 // compare() returns negative, zero, or positive depending on roll number order.
 @Override
 public int compare(Student s1, Student s2) {
     return Integer.compare(s1.getRollno(), s2.getRollno());
 }
}
