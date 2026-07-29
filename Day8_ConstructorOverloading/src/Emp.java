class Emp 
{
	String fname;
	String mname;
	String lname;
	
	Emp(String f, String m, String l)
	{
		this.fname = f;
		this.mname = m;
		this.lname = l;
		System.out.println(f + " " + m + " " + l);
	}
	Emp(String f, String l)
	{
		this.fname = f;
		this.lname = l;
		System.out.println(f + " " + l);
	}
	Emp(String f)
	{
		this.fname = f;
		System.out.println(f);
	}
	public static void main(String[] args)
	{
		Emp E1 = new Emp("Vasanth", "s", "Kumar");
		Emp E2 = new Emp("Sheya", "R");
		Emp E3 = new Emp("Rohit");		
	}
}

