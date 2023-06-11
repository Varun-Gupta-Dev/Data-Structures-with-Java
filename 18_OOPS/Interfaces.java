package OOPS;

public class Interfaces {
    public static void main(String args[]){
        Car c = new Car();
        c.wheels();
        c.purpose();

        Scooter s = new Scooter();
        s.wheels();
        s.purpose();

    }
}

interface Vehicle{
   void wheels();
   void purpose();
}

class Car implements Vehicle{
    public void wheels(){
        System.out.println("It has 4 wheels.");
    }

    public void purpose(){
        System.out.println("For travelling long distances.");
    }
}

class Scooter implements Vehicle{
    public void wheels(){
        System.out.println("It has 2 wheels.");
    }
    public void purpose(){
        System.out.println("For travelling small distances.");
    }
}