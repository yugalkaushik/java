package sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Before: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
        mergeSort(arr);
        System.out.println();
        System.out.print("After: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr){
        int len = arr.length;
        if(len < 2) return;
        int mid = len/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[len-mid];
        for(int i=0;i<mid;i++){
            leftHalf[i] = arr[i];
        }
        for(int i=mid;i<len;i++){
            rightHalf[i-mid] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);

    }
    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;
        while(i<leftLength && j<rightLength){
            if(leftArray[i] <= rightArray[j]){
                inputArray[k] = leftArray[i];
                i++;
            } else{
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftLength){
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rightLength){
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
