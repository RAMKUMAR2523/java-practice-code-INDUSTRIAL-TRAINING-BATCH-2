public class Main
{
	public static void main(String[] args) {
		int[][] graph={{0,1,1},{1,0,1},{1,1,0}};
		if(ishamiltonian(graph)){
		    System.out.print("Hamiltonian circuit exist");
		}
		else{
		    System.out.print("Hamiltonian circuit does not exist");
		}
	}
	static boolean ishamiltonian(int[][] graph){
	    if(graph[0][1]==1&&graph[1][2]==1&&graph[2][0]==1){
	        return true;
	    }
	    return false;
	}
}