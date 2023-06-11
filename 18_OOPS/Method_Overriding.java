package OOPS;

public class Method_Overriding {
    public static void main(String args[]){
        deer d1 = new deer();
        d1.eat();
    }
    
}

class Animal{
    void eat(){
        System.out.println("Eats anything.");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("Eats grass.");
    }
}
