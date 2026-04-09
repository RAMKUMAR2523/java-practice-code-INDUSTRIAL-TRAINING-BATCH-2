import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter number of vertices: ");
	    int V=sc.nextInt();
	    System.out.println("Enter number of edges:");
	    int E=sc.nextInt();
	    
	    ArrayList<int[]> edges=new ArrayList<>();
	    int indegree[]=new int[V];
	    
	    System.out.println("Enter edges(u,v):");
	    
	    for(int i=0;i<E;i++){
	        int u=sc.nextInt();
	        int v=sc.nextInt();
	        edges.add(new int[]{u,v});
	        indegree[v]++;
	    }
	    Queue<Integer> q=new LinkedList<>();
	    
	    for(int i=0;i<V;i++){
	        if(indegree[i]==0){
	            q.add(i);
	            
	        }
	    }
	    
	    System.out.println("Topological sort: ");
	    while(!(q.isEmpty())){
	        int node=q.poll();
	        System.out.print(node+" ");
	        
	        for(int i=0;i<edges.size();i++){
	            int u=edges.get(i)[0];
	            int v=edges.get(i)[1];
	            
	            if(u==node){
	                indegree[v]--;
	                if(indegree[v]==0) q.add(v);
	            }
	        }
	    }
	
	}
}
