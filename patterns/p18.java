package patterns;

import java.util.Scanner;

public class p18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            StringBuilder curr = new StringBuilder();
            for(int j=0;j<n-i-1;j++){
                curr.append(" ");
            }
            for(int j=0;j<=i;j++){
                curr.append((char)('A'+j));
            }
            for(int j=i;j>0;j--){
                curr.append((char)('A'+j-1));
            }
            System.out.println(curr);
        }
    }
}
