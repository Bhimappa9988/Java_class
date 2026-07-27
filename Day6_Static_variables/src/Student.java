class Student 
{
	String sname;
	static String tname = "Vasanth";
	
	Student(String s)
	{
		this.sname = s;
	}
	
	public static void main(String []args)
	{
		Student s1 = new Student("Sai");
		Student s2 = new Student("Rohit");
		
        System.out.println(s1.sname);
        System.out.println(s2.sname);
        System.out.println(Student.tname);
	}
}