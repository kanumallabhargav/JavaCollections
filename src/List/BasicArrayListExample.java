package List;

import java.util.*;

public class BasicArrayListExample
{
    public static void main(String args[])
    {
        //Define ArrayList like this
        //Duplicates allowed
        ArrayList<String> a = new ArrayList<String>();

        //Add elements
        a.add("munna");
        a.add("kanumb");
        a.add("batman");
        System.out.println("Arraylist before removal: "+a);

        //Remove elements based on index
        a.remove(1);
        System.out.println("Arraylist after removal: "+a);

        //add at a specific index
        a.add(1, "bhar");
        System.out.println("Arraylist after adding at a specific index: "+a);

        //remove using string
        a.remove("munna");
        System.out.println("Arraylist after removal: "+a);

        //compare
        boolean b = a.contains("bharg");
        //System.out.println(b);
        if (b)
        {
            System.out.println("The element is present");
        }
        else
        {
            System.out.println("The specified element does not exist in the ArrayList");
        }

        //Remove all elements from the ArrayList
        a.clear();
        boolean empty = a.isEmpty();
        if (empty)
        {
            System.out.println("All the elements have been removed");
            System.out.println("ArrayList is now empty");
        }
        else
        {
            System.out.println("Elements could not be removed");
        }

        //Add new elements
        a.add("Batman");
        a.add("Joker");
        a.add("Riddler");
        a.add("Penguin");
        a.add("Two-Face");
        a.add("Scaracrow");
        a.add("Catwoman");
        a.add("Bane");
        a.add("Ra's al Ghul");
        a.add("Clayface");
        a.add("Poison Ivy");
        a.add("Dr. Strange");
        a.add("Superman");
        System.out.println("After adding new elements:"+a);

        //Find the index
        System.out.println("The index of the specified element is: "+a.indexOf("Bane"));

        //Find the size of the ArrayList
        System.out.println("The size of the ArrayList is: "+a.size());
    }

}
