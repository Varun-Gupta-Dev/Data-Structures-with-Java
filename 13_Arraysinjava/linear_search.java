import java.util.*;
public class linear_search {
    public static int linearsearch(String menu[],String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"Dosa","Chole Bhature","Samosa","Sandwich","Raj kachori"};
        String key = "Samosa";
        int index = linearsearch(menu,key);
        if(index == -1){
            System.out.println("Item not found:-(");
        }
        else{
            System.out.println("Item found at index "+index);
        }
        
    }
}
