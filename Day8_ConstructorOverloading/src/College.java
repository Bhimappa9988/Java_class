class College
{
    String student;
    int rollNo;
    String branch;
    double fee;

    College(String student,int rollNo,String branch,double fee)
    {
        this.student=student;
        this.rollNo=rollNo;
        this.branch=branch;
        this.fee=fee;
        System.out.println(student+" "+rollNo+" "+branch+" "+fee);
    }

    College(String student,int rollNo,String branch)
    {
        this.student=student;
        this.rollNo=rollNo;
        this.branch=branch;
        System.out.println(student+" "+rollNo+" "+branch);
    }

    College(String student,int rollNo)
    {
        this.student=student;
        this.rollNo=rollNo;
        System.out.println(student+" "+rollNo);
    }

    College(String student)
    {
        this.student=student;
        System.out.println(student);
    }

    College()
    {
        System.out.println("College Admission");
    }

    public static void main(String args[])
    {
        College c1=new College("Anjali",101,"CSE",85000);
        College c2=new College("Rahul",102,"ISE");
        College c3=new College("Kiran",103);
        College c4=new College("Sneha");
        College c5=new College();
    }
}