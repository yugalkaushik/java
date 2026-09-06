package patterns;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder curr = new StringBuilder();
        curr.repeat("*",n);
        System.out.println(curr);
        for(int i=0;i<n-2;i++){
            StringBuilder looped = new StringBuilder();
            looped.append("*");
            looped.repeat(" ",n-2);
            looped.append("*");
            System.out.println(looped);

        }
        System.out.println(curr);
    }
}
