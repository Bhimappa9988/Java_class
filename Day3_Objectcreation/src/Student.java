class Student {
	 
	   String sname  ;
	   int age ;
	   int grade ;
 
	 public static void main(String[] args) {
		 
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.sname = "kiran";
		s1.age = 10;
		s1.grade = 9;
		
		
		s2.sname = "rohith";
		s2.age = 11;
		s2.grade = 8;
	
		System.out.println(s1.sname);
		System.out.println(s1.age);
		System.out.println(s1.grade);
		
		System.out.println(s2.sname);
		System.out.println(s2.age);
		System.out.println(s2.grade);
	
		
	}

}