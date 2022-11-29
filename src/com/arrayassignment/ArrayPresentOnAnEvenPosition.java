package com.arrayassignment;

   public class ArrayPresentOnAnEvenPosition {

       public static void main(String[] args) {
           // declaration and initialization of array.
           int[] arr = new int[]{1, 2, 3, 4, 5, 6};

           // iterating through the array using for loop
           for (int i = 1; i < arr.length; i = i + 2) {

               // print element to the console
               System.out.println(arr[i]);

           }

       }
   }