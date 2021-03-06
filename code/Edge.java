public class Edge
{
	public Edge( Node fromNode, Node toNode ) {
		// TODO Auto-generated constructor stub
		this.setFromNode(fromNode);
		this.setToNode(toNode);
	}




	public Node getToNode( ) {
		return toNode;
	}




	public void setToNode( Node toNode ) {
		this.toNode = toNode;
	}




	public Node getFromNode( ) {
		return fromNode;
	}




	public void setFromNode( Node fromNode ) {
		this.fromNode = fromNode;
	}




	//private int on_critical_path;


	private Node toNode;




	private Node fromNode;




	public String toString( ) {
		return getFromNode().getName() +"->"+ getToNode().getName() + 
				((fromNode.getOn_critical_path() && toNode.getOn_critical_path() )? " [color=red]":"");
	}
}
