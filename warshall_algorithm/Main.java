import java .util.*;
public class Main
{
    static void warshall(int[][] adjmatrix){
        int n=adjmatrix.length;
        int[][] closure =new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                closure[i][j]=adjmatrix[i][j];
                
            }
        }
        
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(closure[i][k]==1 && closure[k][j]==1){
                        closure[i][j]=1;
                    }
                }
            }
        }
        System.out.println("transitive closure Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(closure[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
                   int[][] adjmatrix={
                       {0,1,0},
                       {0,0,1},
                       {0,0,0}
                   };
                   warshall(adjmatrix);
	}
}
