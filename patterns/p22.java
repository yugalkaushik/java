package patterns;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 0; i < 2*n-1; i++) {
            StringBuilder curr = new StringBuilder();

            for(int j = 0; j < 2*n-1; j++) {
                int min = Math.min(
                    Math.min(i, j),
                    Math.min(2*n-2-i, 2*n-2-j)
                );
                curr.append(n - min).append(" ");
            }
            System.out.println(curr);
        }
    }
}
