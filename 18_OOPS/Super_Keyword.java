

public class Super_Keyword {
    public static void main(String args[]){
        Mastung m = new Mastung();
        
    }
    
}

class Animal{
    
    Animal(){
        System.out.println("Animal constructor is called.");
    }
}

class Horse extends Animal{
    String color;
    Horse(){
        System.out.println("Horse constructor is called.");
    }
}

class Mastung extends Horse{
    
    Mastung(){
        super.color = "Brown";
        System.out.println("Mastung constructor is called.");
        System.out.println(color);
    }
}