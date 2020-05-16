package Set;

import java.util.*;

public class BasicHashSetExample
{
    public static void main(String args[])
    {
        //HashSet
        //No duplicates accepted
        //Elements stored in non sequential order

        //Declare a Hashset
        HashSet<String> hs = new HashSet<String>();

        //Add elements
        hs.add("India");
        hs.add("Nepal");
        hs.add("Nepal"); //This value is ignored because its a duplicate
        hs.add("France");
        hs.add("KSA");
        System.out.println("Contents of the HashSet: "+hs);

        //Hashset size:
        System.out.println("Size of the Hashset: "+hs.size());

        //Cloning a Hashset - use ".clone()" and put it in another hashset.
        HashSet<String> hs_clone = new HashSet<String>(); //Declare another HashSet
        hs_clone= (HashSet<String>) hs.clone(); //define the new HashSet
        System.out.println("Cloned set contents: "+hs_clone);


        //Iterating through the HashSet
        Iterator<String> itr = hs_clone.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
