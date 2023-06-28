import java.util.*;
public class Copy_constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Varun";
        s1.roll = 185;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.print(s2.marks[i]+" ");
        }

    }

    
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks = new int[3];
    }

    // Shallow Copy Constructor
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
        this.marks = s.marks;
    }

    //Deep Copy Constructor
    // Student(Student s){
    //     marks = new int[3];
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.password = s.password;
    //     for(int i=0; i<3; i++){
    //         this.marks[i] = s.marks[i];
    //     }
    // }
}
