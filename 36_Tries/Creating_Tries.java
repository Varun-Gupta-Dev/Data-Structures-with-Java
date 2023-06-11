public class Creating_Tries {
    static class Node{
        char children[] = new char[26];
        boolean eow = false;
        Node(){
            for(int i=0; i<children.length; i++){
                children[i]=null;
            }
        }
    }
    Node root = new Node(); // Root node remains empty

    public static void main(String args[]){
        String words[] = {"the","a","there","their","any","thee"};
    }
}
