package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BasicHashMapExample
{
    public static void main(String args[])
    {
        //HashMap needs keys(index values) to be passed along with the values
        //Can control the index placement of values

        //Declare a HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //add values along with the index numbers
        hm.put(0, "Hyderabad");
        hm.put(2, "Bengaluru");
        hm.put(1, "Kochi");
        hm.put(3, "Anjuna");
        hm.put(4, "Candolim");
        hm.put(5, "Hubli");
        System.out.println(hm);

        //print a specific value using the index
        System.out.println(hm.get(1));

        //fun with code
        String temp = hm.get(2);
        if (temp==null)
        {
            System.out.println("The index is empty");
        }
        else
        {
            System.out.println("The index is populated with "+hm.get(2));
        }

        //Remove from HashMap
        hm.remove(4);
        System.out.println("HashMap after removal: "+hm);

        //Convert HashMap to Set
        Set es = hm.entrySet();

        //iterate through the set
        Iterator itr = es.iterator();
        while (itr.hasNext())
        {
            /*Casting to map (telling the compiler that this is a map and has 2 values)
            without which it will be pointed towards the index but will not know which value to take*/
            Map.Entry mp = (Map.Entry) itr.next();
            System.out.println(mp.getKey()+" - "+mp.getValue());
        }
    }
}
