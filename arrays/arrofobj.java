class Student{
    int marks;
    String name;
}

public class arrofobj {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Karan";
        s1.marks = 45;

        
        s2.name = "Ajay";
        s2.marks = 34;

        
        s3.name = "Lodu";
        s3.marks = 14;

        
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        
        for(Student s : students){
            System.out.println(s.name);
            System.out.println(s.marks);
        }
    }
}