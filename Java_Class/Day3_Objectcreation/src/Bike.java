class Bike {
	
	String bname;
	int price;
	String color;

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
		b1.bname = "r15";
		b1.price = 159098;
		b1.color = "black";
		
		b2.bname = "r3";
		b2.price = 169098;
		b2.color = "blue";
		
		System.out.println(b1.bname);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		System.out.println(b2.bname);
		System.out.println(b2.price);
		System.out.println(b2.color);				
	}

}