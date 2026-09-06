package patterns;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while(i<n){
            StringBuilder curr = new StringBuilder();
                for(int j=0;j<=i;j++){
                    if((i+j)%2==0){
                        curr.append("1 ");
                    } else{
                        curr.append("0 ");
                    }
                }
                System.out.println(curr);
            i++;
        }
    }
}
