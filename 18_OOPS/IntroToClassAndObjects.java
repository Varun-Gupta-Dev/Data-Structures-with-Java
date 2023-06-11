package OOPS;

public class IntroToClassAndObjects {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setColor("Yellow");
        p1.color = "Red";
        //System.out.println(p1.color);
        bankAccount myacc = new bankAccount();
        myacc.setPass("abcd");
        /*System.out.println(myacc.password); -->Invalid because we cannot access 
        password as it is private.*/

    }
    
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class bankAccount{
    public String name;
    private String password;
    public void setPass(String pwd){
        password = pwd;
    }
}
