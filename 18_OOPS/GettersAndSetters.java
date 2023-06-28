

public class GettersAndSetters {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

    }
    
}

class Pen{
    private String color;
    private int tip;
    
    // Setters
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }

    // Getters
    String getColor(){
        return color;
    }
    int getTip(){
        return tip;
    }
}