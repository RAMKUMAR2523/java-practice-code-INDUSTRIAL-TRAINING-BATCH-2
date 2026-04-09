import java.util.*;
public class Main

{
    static int[] dp=new int[10];
    
    static int sum(int n){
        if(n==0){
            return 0;
        }
        dp[n]=n+sum(n-1);
        return dp[n];
    }
	public static void main(String[] args) {
	int n=5;
	System.out.println(sum(n));
	}
}
