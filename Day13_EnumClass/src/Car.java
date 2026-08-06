enum color{
	red, white, black, green   //fixed values
}
class Car 
{
	String brand;
	color colour; // enum name
	
	public static void main(String[] args)
	{
		Car c1 = new Car();
	
		c1.colour = color.black;
		c1.brand = "KIA";
		System.out.println(c1.colour);
		System.out.println(c1.brand);
	}
}
