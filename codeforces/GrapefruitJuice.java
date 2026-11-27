package codeforces;

import java.util.*;

public class GrapefruitJuice {
    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long joy = 0;
        int count = 0;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i];
            count++;
            if(count==k){
                if(sum < x){
                    joy += x;
                } else{
                    joy += sum;
                }
                sum = 0;
                count = 0;
            }
        }
        joy += sum;
        System.out.println(joy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
