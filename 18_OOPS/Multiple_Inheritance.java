

public class Multiple_Inheritance {
    public static void main(String args[]){
         Crocodile c = new Crocodile();
        c.swim();
        c.walk();
    }
    
}

interface Aquatic{
    void swim();
}
interface Land{
    void walk();

}

class Crocodile implements Aquatic, Land{
    public void swim(){
        System.out.println("It can swim.");
    }

    public void walk(){
        System.out.println("It can walk on land.");
    }
} 
