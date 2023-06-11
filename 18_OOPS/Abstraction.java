

public class Abstraction {
    public static void main(String args[]){
        Mustang myHorse = new Mustang();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
    
}

 abstract class Animal{   //---> Abstract class
    Animal(){
        System.out.println("Animal constructor is called.");
    }
    void eat(){
        System.out.println("Animal eats.");
    }
    abstract void walk(); //---> abstract function(only idea is given. Walk function
                          //kaisa dikhega vo uski further subclasses will tell.
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called.");
    }
    void walk(){   //---> Implementation of walk function.
        System.out.println("Walks on 4 legs.");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called.");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor is called.");
    }
    void walk(){
        System.out.println("Walks on 2 legs.");
    }
}