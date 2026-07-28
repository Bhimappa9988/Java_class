class Test 
{
	int a = 10;
	static int b = 20;
	
	void m1()
	{
		System.out.println(a); // this.a
		System.out.println(b); // this.b  static call directly
	}
	
	void m2()
	{
		System.out.println(b); // call directly
	}
	
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.m1();
		t1.m2();
	}
}
