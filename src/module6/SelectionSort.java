package module6;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

 // sort() performs selection sort using the given comparator.
 public static void sort(ArrayList<Student> list, Comparator<Student> comp) {

     // outer loop moves through each position in the list.
     for (int i = 0; i < list.size() - 1; i++) {

         int minIndex = i;

         // inner loop finds the smallest element in the remaining unsorted portion.
         for (int j = i + 1; j < list.size(); j++) {

             // If a smaller element is found, update minIndex.
             if (comp.compare(list.get(j), list.get(minIndex)) < 0) {
                 minIndex = j;
             }
         }

         // swaps the smallest element found with the element at index i.
         Student temp = list.get(i);
         list.set(i, list.get(minIndex));
         list.set(minIndex, temp);
     }
 }
}
