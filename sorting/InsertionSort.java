package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j-1] > curr){
                arr[j+1] = arr[j];
            }
            arr[j + 1] = curr;
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
