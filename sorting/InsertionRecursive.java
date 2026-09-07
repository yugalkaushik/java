package sorting;

import java.util.Scanner;

public class InsertionRecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        insertionSort(arr, n);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    private static void insertionSort(int[] arr, int n){
        if(n<=1) return;
        insertionSort(arr,n-1);
        int key = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>key){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
