package patterns;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=n;i>0;i--){
            StringBuilder curr = new StringBuilder();
            for(int j=0;j<n-i;j++){
                curr.append(" ");
            }
            for(int j=0;j<2*i-1;j++){
                curr.append("*");
            }
            System.out.println(curr);
        }
    }
}
