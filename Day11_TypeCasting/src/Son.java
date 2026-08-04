class Father
{
	
}
class Son extends Father
{
	public static void main(String[] args)
	{
		Father f1 = new Son(); // up casting
		Son s2 = (Son) f1; // down casting
	}
}
