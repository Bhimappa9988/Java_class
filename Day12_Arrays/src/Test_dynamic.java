class Test_dynamic
{
	public static void main(String[] args)
	{
		int [] ar = new int[5]; //creation of object   index no 0 1 2 3 4 5
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;   // initialize the data
		ar[3] = 40;
		ar[4] = 50;
		
		ar[0] = 100;  ar[1] = 0;  // updating the data
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]); // access the data
		System.out.println(ar[3]);
		System.out.println(ar[4]);
	}
}