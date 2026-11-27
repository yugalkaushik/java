package codeforces;

import java.util.*;

public class picnicfortwo {
    static void solve(Scanner sc) {
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        boolean[] aubrey = new boolean[l];
        boolean[] sunny = new boolean[l];

        for(int i=0;i<l;i++){
            int num = i*a%l;
            if(!aubrey[num]){
                aubrey[num] = true;
            }
        }

        for(int i=0;i<l;i++){
            int num = i*b%l;
            if(!sunny[num]){
                sunny[num] = true;
            }
        }
        for(int i=0;i<l;i++){
            if(aubrey[i] && sunny[i]){
                count++;
            }
        }
        System.out.println(count);
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
