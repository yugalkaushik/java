package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean swapped;
        for(int i = n-1;i>0;i--){
            swapped = false;
            for(int j=0;j<i;j++){
                if(arr[j+1]<arr[j]){
                    int curr = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = curr;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
