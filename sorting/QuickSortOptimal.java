package sorting;

import java.util.*;

public class QuickSortOptimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        sc.close();
        quickSort(arr,0,arr.size()-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static void quickSort(ArrayList<Integer> arr, int start, int end){
        if (start>=end) return;
        int pivot = end;
        int i = start-1;
        int j = start;
        while(j<pivot){
            if(arr.get(j)<arr.get(pivot)){
                i++;
                int temp = arr.get(j);
                arr.set(j,arr.get(i));
                arr.set(i, temp);
            }
            j++;
        }
        int temp = arr.get(i+1);
        arr.set(i+1,arr.get(pivot));
        arr.set(pivot,temp);
        int pivotIndex = i + 1;
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }
}
