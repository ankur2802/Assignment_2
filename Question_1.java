
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





