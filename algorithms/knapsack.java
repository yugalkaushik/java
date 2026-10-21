package algorithms;
import java.util.*;

public class knapsack {
    
    static int recursion(int[]wt, int[] val, int i, int w){
        if(i==0 || w == 0) return 0;
        if(wt[i-1] > w) return recursion(wt,val,i-1,w);
        int skip = recursion(wt,val,i-1,w);
        int take = val[i-1] + recursion(wt,val,i-1,w - wt[i-1]);
        return Math.max(take,skip);
    }

    static int memo(int[]wt, int[]val, int i, int w, int[][]dp){
        if(i==0 || w==0) return 0;
        if(wt[i-1] > w) return memo(wt,val,i,w,dp);
        if(dp[i][w] != -1) return dp[i][w];
        int take = val[i-1] + memo(wt, val, i-1, w - wt[i-1], dp);
        int skip = memo(wt, val, i-1, w, dp);
        return dp[i][w] = Math.max(take, skip);
    }
    
    public static void main(String[] args){
        int[] wt = new int[]{1,3,4,7};
        int[] val = new int[]{1,4,5,7};
        int w = 7;
        int i = 4;
        System.out.println(recursion(wt,val,i,w));
        int[][] dp = new int[i+1][w+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(memo(wt,val,i,w,dp));
    }
}
