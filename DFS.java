package DFSandBFS;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] elements= new int[] {1,2,3,4,5,6,7,8};
		
		Node root= GraphMaking.makeGraph(elements);
		dfs(root);
	}
	
	static void dfs(Node root)
	{	
		if(root== null) return;
		dfs(root.left);
		System.out.println(root.data);
		dfs(root.right);
		
	}

}



class Node
{
	Node left,right;
	int data;
	Node(int data)
	{
		this.data= data;
		left=null;
		right= null;
	}
}
