import java.util.*;

public class Main
{   
    static final  int INF=9999;
    static final int V=3;
  static  int mindistance(int dist[],boolean visited[]){
        int min=INF,index=-1;
        for(int i=0;i<V;i++){
            if(!visited[i]&&dist[i]<=min){
                min=dist[i];
                index=i;
            }
        }
        return index;
    }
    static void dijkstra(int graph[][],int src,int dest){
        int dist[]=new int[V];
        boolean visited[]=new boolean[V];
        int[] parent=new int[V];
        
        for(int i=0;i<V;i++){
            dist[i]=INF;
           parent[i]=-1;
        }
        dist[src]=0;
        
        for(int count=0;count<V-1;count++){
            int u=mindistance(dist,visited);
            visited[u]=true;
            
            for(int v=0;v<V;v++){
                if(!visited[v]&&graph[u][v]!=0&&dist[u]+graph[u][v]<dist[v]){
                    dist[v]=dist[u]+graph[u][v];
                    parent[v]=u;
                }
            }
        }
        System.out.println("shortest  Distance from "+ src+"to"+dest+"is:"+dist[dest]);
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int graph[][]={
		    {0,4,1},
		    {4,0,2},
		    {1,2,0}
		};
		
	System.out.print("Enter source (0-2):");
	int src=sc.nextInt();
	System.out.print("Enter destination(0-2):");
	int dest=sc.nextInt();
	
	dijkstra(graph,src,dest);
	}
}