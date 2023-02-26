public class Student {
    private String name;
    private int age;

    public Student(){
        name = "No name yet";
        age = 0;
    }
    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String [] args){
        Student student = new Student();
        Student student2 = new Student("Nigel D. Cope", 20);
        System.out.println("Name: " + student.name + "\nAge: " + student.age + "\n");
        System.out.println("Name: " + student2.name + "\nAge: " + student2.age);
    }
}
