class Student{
    private int age;
    private String name;


  public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}


public class encapsulation {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Karan");
        System.out.println(s1.getName());
    }
}