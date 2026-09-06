package patterns;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            StringBuilder curr = new StringBuilder();
            for(int j=n-i;j<=n;j++){
                curr.append((char)('A'+ j - 1));
            }
            System.out.println(curr);
        }
    }
}
