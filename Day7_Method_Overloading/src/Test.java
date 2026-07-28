class Test 
{
	void add(int a , int b)
	{
		System.out.println(a + b);
	}
	
	void add(int a , int b , int c)
	{
		System.out.println(a + b + c);
	}
	
	void add(int a , String b)
	{
		System.out.println(a + b);
	}
	
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.add(10, 20);
		t1.add(20, 30, 40);
		t1.add(10, "Vasanth");
	}
}
