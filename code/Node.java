public class Node
{
	public Node( String name, int duration ) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.duration = duration;
	}

	public String getName( ) {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	private String name;
	
	private int duration;
	
	private Boolean on_critical_path;
	
	

}
