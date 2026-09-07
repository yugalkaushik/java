package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSortbrute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        sc.close();
        quickSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static void quickSort(ArrayList<Integer> arr){
        if (arr.size() <= 1) return;
        int len = arr.size();
        int pivot = arr.get(len-1);
        ArrayList<Integer> leftPart = new ArrayList<>();
        ArrayList<Integer> rightPart = new ArrayList<>();
        for(int i=0;i<len-1;i++){
            if(arr.get(i)>pivot){
                rightPart.add(arr.get(i));
            } else{
                leftPart.add(arr.get(i));
            }
        }
        quickSort(leftPart);
        quickSort(rightPart);
        arr.clear();
        arr.addAll(leftPart);
        arr.add(pivot);
        arr.addAll(rightPart);
    }
}
