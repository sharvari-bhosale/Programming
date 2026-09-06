import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   shortestConnection()
// Description     :   To find minimum number of connections between two persons
// Input           :   HashMap<String, ArrayList<String>>, String, String
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void shortestConnection(
        HashMap<String, ArrayList<String>> hobj,
        String Source,
        String Destination)
    {
        Queue<String> qobj = new LinkedList<String>();

        HashMap<String, Integer> Distance =
            new HashMap<String, Integer>();

        qobj.add(Source);
        Distance.put(Source, 0);

        while(!qobj.isEmpty())
        {
            String Current = qobj.remove();

            if(Current.equals(Destination))
            {
                System.out.println("Number of connections : " +
                                   Distance.get(Current));
                return;
            }

            ArrayList<String> Friends = hobj.get(Current);

            for(String Friend : Friends)
            {
                if(!Distance.containsKey(Friend))
                {
                    Distance.put(Friend,
                                 Distance.get(Current) + 1);

                    qobj.add(Friend);
                }
            }
        }

        System.out.println("No connection found");
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to find shortest connection in social network
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A155_SocialNetwork
{
    public static void main(String A[])
    {
        HashMap<String, ArrayList<String>> hobj = new HashMap<String, ArrayList<String>>();

        ArrayList<String> alobj;

        alobj = new ArrayList<String>();
        alobj.add("Rahul");
        alobj.add("Pooja");
        hobj.put("Amit", alobj);

        alobj = new ArrayList<String>();
        alobj.add("Neha");
        hobj.put("Rahul", alobj);

        alobj = new ArrayList<String>();
        alobj.add("Kiran");
        hobj.put("Pooja", alobj);

        alobj = new ArrayList<String>();
        alobj.add("Riya");
        hobj.put("Neha", alobj);

        alobj = new ArrayList<String>();
        alobj.add("Riya");
        hobj.put("Kiran", alobj);

        CollectionX col = new CollectionX();

        col.shortestConnection(hobj, "Amit", "Riya");
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// Amit  -> Rahul, Pooja
// Rahul -> Neha
// Pooja -> Kiran
// Neha  -> Riya
// Kiran -> Riya
//
// Output:
//
// Number of connections : 3
//
//////////////////////////////////////////////////////////////////////////////////////////////////