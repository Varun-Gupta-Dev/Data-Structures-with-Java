

public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Varun Gupta");
        Student s3 = new Student(95);
        System.out.println(s2.name);
    }
    
}

class Student{
    String name;
    int roll;
                                                             
    Student(){ // ---> Non parametrised constructor.
        System.out.println("Constructor is called...");
    }

    Student(String name){ //---> Parametrised constructor.
        this.name = name;
    }

    Student(int roll){ //---> Parameterised constructor.
        this.roll = roll;
    } 
                                                                        


    
    
}
