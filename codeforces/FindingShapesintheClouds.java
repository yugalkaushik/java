package codeforces;

import java.util.*;

public class FindingShapesintheClouds {
    static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        boolean alternating = true;
        if(n%2==0){
            for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    alternating = false;
                    break;
                }
            }
            if(!alternating){
                System.out.println("YES");
            } else System.out.println("NO");
        } else System.out.println("NO");
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