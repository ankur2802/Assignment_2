
// Merge sort algorithm

import java.util.Arrays;
import java.util.Scanner;
class Question_4 {

  
  void merge(int arr[], int a, int b, int c) {

    int n1 = b - a + 1;
    int n2 = c - b;

    int left[] = new int[n1];
    int right[] = new int[n2];

    
    for (int i = 0; i < n1; i++)
      left[i] = arr[a + i];
    for (int j = 0; j < n2; j++)
      right[j] = arr[b + 1 + j];

    
    int i, j, k;
    i = 0;
    j = 0;
    k = a;

    while (i < n1 && j < n2) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = left[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = right[j];
      j++;
      k++;
    }
  }

  // Divide the array into two sub arrays, sort them and merge them
  void mergeSort(int arr[], int left, int right) {
    if (left < right) {

      
      int mid = (left + right) / 2;

      
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);

      
      merge(arr, left, mid, right);
    }
  }

  public static void main(String args[]) {

   
    //int[] arr = { 6, 5, 12, 10, 9, 1 };
	  Scanner sc= new Scanner (System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
  int arr[]=new int[size];

  System.out.println("enter the int values in the array");
  for (int z=0; z<arr.length;z++){
      arr[z]=sc.nextInt();
  }
	  

    Question_4 q2 = new Question_4();

    
    q2.mergeSort(arr, 0, arr.length - 1);

    System.out.println("Array after sorting:");
    System.out.println(Arrays.toString(arr));
  }
}