

public class Derived_class {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eats();

    }
    
}

class Animal{  // ---> Parent class.
    String color;
    void eats(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{ //---> Derived class
    int fins;
    void swims(){
        System.out.println("Swims");
    }
}
