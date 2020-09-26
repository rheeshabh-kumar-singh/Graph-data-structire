package DFSandBFS;

public class GraphMaking {
	
	static Node makeGraph(int[] elements)
	{
		Node root= null;
		Node[] node=new Node[elements.length];
		for(int i=0;i<elements.length;i++)
		{
			node[i]= new Node(elements[i]);
		}
		
		for(int i=0;i<elements.length;i++)
		{
			node[i].left= ((2*i)+1)<=elements.length-1?node[(2*i)+1]:null;
			node[i].right= (2*(i+1))<=elements.length-1?node[2*(i+1)]:null;
		}
		root=node[0];
		return root;
	}

}
