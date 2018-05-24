import java.util.ArrayList;

public class ArrayListAdv {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        ArrayList<Integer> myNewArrayList = new ArrayList<Integer>();

        // Set a value

        for(int i =1; i < 20; i++) {
            myNewArrayList.add(Integer.valueOf((i))); // Auto Boxing
        }

        // get value
        for (int i =1; i< 20 ; i++) {
            System.out.println("Value is : " + myNewArrayList.get(i).intValue()); //Unboxing

        }

        String newString = "Something";
    }
}
