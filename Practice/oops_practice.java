package Practice;

public class oops_practice {

    
public static void main(String args[]) {

         }

}
 class Shape {
protected void display() {
System.out.println("Display-base");
}
}
// Circle.java
 class Circle extends Shape { 
protected void display() {
System.out.println("Display-derived");
}
}