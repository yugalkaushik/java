package patterns;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            StringBuilder curr = new StringBuilder();
            for(int j=0;j<=i;j++){
                curr.append(i+1);
            }
            System.out.println(curr);
        }
    }
}
