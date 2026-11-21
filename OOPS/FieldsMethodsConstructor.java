
class Student {

    // Fields
    String name;
    int age;
    static String college = "Mumbai University";
    final int id = 101;

    // Method
    void Study() {
        System.out.println("Student is Studying...");
    }

    // Constructor
    Student(String name) {
        this.name = name;
    }
}

public class FieldsMethodsConstructor {

    public static void main(String[] args) {

        Student s1 = new Student("Harsh");

        s1.age = 12;

        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.college);
        System.out.println(s1.id);

        s1.Study();
    }
}


//fields - is a variable declard inside the class
//  String name = " Harsh";
//  int age = 23 ;

// Types of Fields-Instance Field , Static Field , Final Field
//Method= defines the behavior actions an object can performs

//Constructor - Special member of a class 
// used to initialize an object when it is created