package class_inherit;
class animals
{
	protected String name;
	protected String age;
	
	//default constructor
	public animals()
	{
		name = "N/A";
		age = "";
	}
	//constructor//this. use only if same name as class virebles
	public animals(String name, String age)
	{
		this.name = name;
		this.age = age;
	}
	
	//set
	public void set_name(String name)
	{
		this.name = name;	
	}
	public void set_age(String age)
	{
		this.age = age;
	}
	//get
	public String get_name()
	{
		return name;
	}
	//has to be a string can change it with the integer.set
	public String get_age()
	{
		return this.age;
	}
}
