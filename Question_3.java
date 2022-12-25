
//Bubble Sort

import java.util.*;
public class Question_3 {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
    int arr[]=new int[size];

    System.out.println("enter the int values in the array");
    for (int z=0; z<arr.length;z++){
        arr[z]=sc.nextInt();
    }
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }

    }
    System.out.println("After sorting array elements are - ");
printArray(arr);
    }

}
