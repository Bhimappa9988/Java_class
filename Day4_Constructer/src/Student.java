class Student
{
	
	String sname;
	int age;
	char gender;
	
	Student(String sn, int a, char g)
	{
		this.sname = sn;
		this.age = a;
		this.gender = g;
	}
	
	public static void main(String []args) 
	{
		Student s1 = new Student("Bhim", 21, 'm');
		Student s2 = new Student("Shreya", 20, ' ');
		
		System.out.println(s1.sname + " " + s1.age + " " + s1.gender);
		System.out.println(s2.sname + " " + s2.age + " " + s2.gender);
	}

}
