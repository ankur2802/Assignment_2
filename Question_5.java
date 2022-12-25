

//Selection Sort


import java.util.*;
public class Question_5 {
public static void printArray(int arr[]){
    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
    public static void main (String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    int arr[]= new int[size];
        System.out.println("enter the values in array");
    for(int i=0; i<arr.length; i++){

        arr[i]=sc.nextInt();
    }

    for(int i=0; i<arr.length-1; i++){
        int smallest=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[smallest]>arr[j] ){
                smallest=j;
            }
        }

      /*  arr[smallest]= arr[smallest]+arr[i];
        arr[i]= arr[smallest]-arr[i];
        arr[smallest]= arr[smallest]-arr[i]; */
        // this method of swapping can be used but take care of equal number as it will zero
        int temp= arr[smallest];
        arr[smallest]= arr[i];
        arr[i]= temp;

    }
    System.out.println("After sorting array is: ");
    printArray(arr);



    }



}
