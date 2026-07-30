class father
{
	int money = 1000;
	
	void car()
	{
		System.out.println("use car");
	}
	
	private void Smoke()
	{
		System.out.println("smoking");
	}
}
public class Son extends father
{
	public static void main(String[] args)
	{
		Son s1 = new Son();
		System.out.println(s1.money);
		s1.car();
		// s1.Smoke(): =>can't call because of private keyword
	}
}
