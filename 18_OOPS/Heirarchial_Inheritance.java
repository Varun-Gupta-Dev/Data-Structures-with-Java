package OOPS;

public class Heirarchial_Inheritance {
    public static void main(String args[]){
        Mammal dog = new Mammal();
        dog.breath();

    }
    
}

class Animal{
    String skinColor;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }

}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Mammal extends Animal{
    void walk(){
        System.err.println("Walks");
    }
}
