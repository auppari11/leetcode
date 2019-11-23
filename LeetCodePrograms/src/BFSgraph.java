import java.util.*;


public class BFSgraph {
	class Graph
	{
		public int V;
		public LinkedList<Integer> adj[];
		Graph(int v)
		{
			V=v;
			adj=new LinkedList[v];
			for(int i=0;i<v;++i)
				adj[i]=new LinkedList<Integer>();
		}
	
	public void addEdge(int v,int w)
	{
		
		adj[v].add(w);
	}
	public void BFS(int s)
	{
		boolean visited[]=new boolean[V];
		LinkedList<Integer> queue=new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i=adj[s].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
			}
		}
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSgraph bf=new BFSgraph();
		Graph gp=bf.new Graph(4);
		gp.addEdge(0, 1);
		gp.addEdge(0, 2);
		gp.addEdge(1, 2);
		gp.addEdge(2, 0);
		gp.addEdge(2, 3);
		gp.addEdge(3, 3);
		gp.BFS(1);
	}

}
