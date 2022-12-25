
// Array subset of another array




import java.util.Scanner; 
public class Question_6 {
	
	
public static boolean isSubset(int[] arr1, int[] arr2,int len1,int len2) {
int i,j; 
for (i=0; i < len1; i++){
 if (arr1[i] == arr2[0]){
     int count=1;
       for (j=1; j < len2; j++){
           if (arr1[i+j] == arr2[j]){
               count++;
               }
            }
     System.out.println(count);
            if (count ==len2){
            return true;
            }
      }
}
return false;
}

public static boolean isSubset1(int[] arr2, int[] arr1,int len2,int len1) {
int i,j; 
for (i=0; i < len2; i++){
	
     if (arr2[i] == arr1[0]){
     int count=1;
       for (j=1; j < len1; j++){
           if (arr2[i+j] == arr1[j]){
               count++;
               }
            }
     System.out.println(count);
            if (count ==len1){
            return true;
            }
      }
}
return false;
}



public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("enter the size of the array1");
int len1=scanner.nextInt();
System.out.println("enter the size of the array2");
int len2=scanner.nextInt();

int[] arr1=new int[len1];
int[] arr2=new int[len2];
System.out.println("enter the values in the array1");
for(int i=0; i<len1; i++) {
arr1[i] =scanner.nextInt();
}

//sort of array1
for(int x=0; x<arr1.length-1; x++){
    for(int y=0; y<arr1.length-x-1; y++){
        if(arr1[y]>arr1[y+1]){
            //swap
            int temp= arr1[y];
            arr1[y]=arr1[y+1];
            arr1[y+1]=temp;
        }
    }

}

// sorted array
System.out.println("sorted array 1: ");
for(int z=0; z<arr1.length;z++) {
	
	System.out.print(arr1[z]+" ");
	
}
System.out.println();

System.out.println("enter the values in the array2");
for(int i=0; i<len2; i++) {
arr2[i] =scanner.nextInt();
}

//sort of array 2
for(int x=0; x<arr2.length-1; x++){
    for(int y=0; y<arr2.length-x-1; y++){
        if(arr2[y]>arr2[y+1]){
            //swap
            int temp= arr2[y];
            arr2[y]=arr2[y+1];
            arr2[y+1]=temp;
        }
    }

}
//sorted array 
System.out.println("sorted array 2: ");
for(int z=0; z<arr2.length-1;z++) {
	
	System.out.print(arr2[z]+" ");
	
}
System.out.println();

if(len1>len2) {

if(isSubset(arr1, arr2, len1, len2)) {
System.out.println("yes array 2 is a subset");
}
else {
System.out.println(" array 2 is not a subset");
}

}

else {
	if(isSubset(arr2, arr1, len2, len1)) {
		System.out.println("yes array 1 is a subset");
		}
		else {
		System.out.println(" array 1 is not a subset");
		}
		
	
}
} 
}