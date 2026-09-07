package sorting;

import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            int index = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int curr = arr[i];
            arr[i] = arr[index];
            arr[index] = curr;
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
