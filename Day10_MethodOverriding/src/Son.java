class Father 
{
	void drink()
	{
		System.out.println("coffee");
	}
}

class Son extends Father 
{
	@Override
	void drink()
	{
		System.out.println("tea");
	}
	public static void main(String[] args)
	{
		Son s1 = new Son();
		Father f1 = new Father();
		s1.drink();
		f1.drink();
	}
}
