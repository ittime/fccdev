import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!");

        String[] myArray = myList.toArray(new String[0]);
        
        for (String str : myArray) {
            System.out.println(str);
        }
    }
}
