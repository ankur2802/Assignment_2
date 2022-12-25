
// Find duplicate in array

import java.util.*;
public class Question_1{
	public static void main(String args[]) {
		int temp1=0;
		int temp2=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int [size];
		System.out.println("enter the values in the array");
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int j=0; j<arr1.length;j++) {
			for(int k=j+1;k<arr1.length;k++) {
				if(arr1[j]==arr1[k]) {
					temp1++;
					arr2[j]=arr1[j];
				}
				else {
					temp2++;
				}
			}
		}
		
		if(temp1>0) {
			for(int l=0; l<arr2.length;l++) {
				if(arr2[l]>0) {
					int a=l+1;
					System.out.println("duplicate found : "+arr2[l]+ " at position :"+a);
				}
			}
		}
		else {
			System.out.println("no duplicate found");
			}
		
		
	}
}


//import java.util.*;
//public class Question_1 {  
//  public static void main(String[] args) {      
//        int gf=0;
//        int g=0;
//        int j=0;
//      //Initialize array   
//     // int [] arr = new int []{1, 2, 3, 4, 2, 7, 8, 8, 3};  
//  	boolean flag=false;
//      Scanner sc= new Scanner(System.in); 
//      System.out.println("enter the size of the array");
//      int size=sc.nextInt();
//      int arr[]=new int[size];
//      System.out.println("enter values in array"); 
//      
//      // for storing value in array
//      for (int k=0; k<arr.length; k++) {
//      	arr[k]=sc.nextInt();
//      }
//       
//      //Searches for duplicate element
//      for(int i = 0; i < arr.length; i++) {  
//          for( j = i+1; j <arr.length; j++) {  
//              if(arr[i] == arr[j])  {
//              	//System.out.println("Duplicate elements in given array: " + arr[j]);
//                 // System.out.println(arr[j]);  
//                // flag=true;
//              	g++;
//           
//                  }
//              else {
//              	gf++;
//              	//System.out.println("No duplicates at"+arr[j]);
//              }
//              
//               }
//          }
//      if(g>0) {
//      	System.out.println("Duplicate elements in given array: " + arr[j]);
//      }
//      else if(gf>=1) {
//      	System.out.println("duplicate not found");
//      }
//      
//      
//      }  
//  }  


