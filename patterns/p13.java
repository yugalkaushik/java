package patterns;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            StringBuilder curr = new StringBuilder();
            for(int j=1;j<=i;j++){
                curr.append(j);
            }
            for(int j=1;j<2*(n-i);j++){
                curr.append(" ");
            }
            for(int j=i;j>=1;j--){
                curr.append(j);
            }
            System.out.println(curr);
        }
    }
}
