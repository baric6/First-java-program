package class_inherit;

public class child extends animals
{
	private String toy;
	
	//default constructor
	child(){
		this.toy = "N/A";
	}
	//constructor
	child(String toy)
	{
		this.toy = toy;
	}
	
	//set
	public void set_toy(String toy)
	{
		this.toy = toy;
	}
	
	//get
	public String get_toy()
	{
		return toy;
	}
	
	

}
