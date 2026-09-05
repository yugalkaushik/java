package patterns;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=n;i>0;i--){
            StringBuilder curr = new StringBuilder();
            for(int j=i;j>0;j--){
                curr.append("*");
            }
            System.out.println(curr);
        }
    }    
}
