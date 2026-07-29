class Student
{
    String name;
    int age;
    char gender;

    Student(String name, int age, char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println(name + " " + age + " " + gender);
    }

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

    Student(String name)
    {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Rahul",21,'M');
        Student s2 = new Student("Kiran",20);
        Student s3 = new Student("Anjali");
    }
}