/*
Write a function that takes two lists of sorted numbers and returns a list that combines the two into a single sorted list.

For instance, if given the lists:
A = [1,3,5,7]
B = [2,4,6,8]
Your function will return [1,2,3,4,5,6,7,8]
 */

import java.io.*;
import java.util.*;
import java.lang.Integer;

import org.apache.commons.lang3.ObjectUtils.Null;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    // Test Cases
    Integer[] TestArrayA = {-113, -6, -3, 0};
    Integer[] TestArrayB = {};
        
    // Create a modifiable ArrayList from the array
    // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
    
    // Arrays for input + output
    ArrayList<Integer> arrayNumA = new ArrayList<>(Arrays.asList(TestArrayA));
    ArrayList<Integer> arrayNumB = new ArrayList<>(Arrays.asList(TestArrayB));
    ArrayList<Integer> arrayFinalNum = new ArrayList<Integer>();
    
    // Ensuring test inputs are populating correctly
    System.out.println("Test Array A: " + arrayNumA);
    System.out.println("Test Array B: " + arrayNumB);

    // Pointer variables
    int pointerA = 0;
    int pointerB = 0;

    // While loop to traverse through array A 
    while (pointerA < arrayNumA.size() && pointerB < arrayNumB.size())
    {
        // Check the indices
        if (arrayNumA.get(pointerA) <= arrayNumB.get(pointerB))
        {
            // Add A[i] to the final array if the value of A[i] <= B[i]
            arrayFinalNum.add(arrayNumA.get(pointerA));
            pointerA++;
        }
        else
        {
            // Add B[i] to final array if the value of B[i] < A[i]
            arrayFinalNum.add(arrayNumB.get(pointerB));
            pointerB++;
        }
    }

    // Add remaining leftover values from either array A or B
    while (pointerA < arrayNumA.size())
    {
        // Add remaining A[i] to the final array
        arrayFinalNum.add(arrayNumA.get(pointerA));
        pointerA++;
    }

    while (pointerB < arrayNumB.size())
    {
        // Add remaining B[i] to the final array
        arrayFinalNum.add(arrayNumB.get(pointerB));
        pointerB++;
    }

    // Print the final array
    System.out.println("Final Resulting Array: " + arrayFinalNum);

    
  }
}
