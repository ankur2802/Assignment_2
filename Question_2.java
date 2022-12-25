// Quick Sort Algorithm


import java.util.*;
public class Question_2
{
    // for partiton
    int partition (int a[], int low, int high)
    {
        int pivot = a[high]; // pivot element
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++)
        {
            if (a[j] < pivot)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[high];
        a[high] = t;
        return (i + 1);
    }

    // quicksort
    void quick(int a[], int low, int high)
    {
        if (low < high)
        {
            int p = partition(a, low, high);
            quick(a, low, p - 1);
            quick(a, p + 1, high);
        }
    }

    //print sort array
    void printArr(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
    //    int a[] = { 12, 17, 27, 5, 20, 26 };
       // int n = a.length;
        System.out.println("enter the values in the array");
        for(int z=0; z<n;z++){
            a[z]=sc.nextInt();
        }

        System.out.println("Before sorting array elements are : ");
        Question_2 q1 = new Question_2();
        q1.printArr(a, n);
        q1.quick(a, 0, n - 1);
        System.out.println();
        System.out.println("After sorting array elements are : ");
        q1.printArr(a, n);
        System.out.println();
    }
}
