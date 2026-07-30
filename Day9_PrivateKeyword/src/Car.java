final class Engine 
{
	void start()
	{
		System.out.println("Start car");
	}
	
	void accelerate()
	{
		System.out.println("Start acceralate");
	}
}
public class Car
{
	public static void main(String[] args)
	{
	Engine e1 = new Engine();
	e1.start();
	e1.accelerate();
	}	
}