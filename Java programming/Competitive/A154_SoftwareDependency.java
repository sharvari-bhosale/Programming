import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   dependencyOrder()
// Description     :   To find valid software dependency order
// Input           :   String[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void dependencyOrder(String Arr[])
    {
        HashMap<String, ArrayList<String>> hobj =
            new HashMap<String, ArrayList<String>>();

        HashMap<String, Integer> indegree =
            new HashMap<String, Integer>();

        for(String str : Arr)
        {
            String Data[] = str.split(" ");

            String Source = Data[0];
            String Destination = Data[1];

            if(!hobj.containsKey(Source))
            {
                hobj.put(Source, new ArrayList<String>());
            }

            if(!hobj.containsKey(Destination))
            {
                hobj.put(Destination, new ArrayList<String>());
            }

            hobj.get(Source).add(Destination);

            if(indegree.containsKey(Destination))
            {
                indegree.put(Destination,
                             indegree.get(Destination) + 1);
            }
            else
            {
                indegree.put(Destination, 1);
            }

            if(!indegree.containsKey(Source))
            {
                indegree.put(Source, 0);
            }
        }

        Queue<String> qobj = new LinkedList<String>();

        for(String str : indegree.keySet())
        {
            if(indegree.get(str) == 0)
            {
                qobj.add(str);
            }
        }

        System.out.println("Valid dependency order:");

        int iCount = 0;

        while(!qobj.isEmpty())
        {
            String Current = qobj.remove();

            System.out.println(Current);

            iCount++;

            for(String Next : hobj.get(Current))
            {
                indegree.put(Next,
                             indegree.get(Next) - 1);

                if(indegree.get(Next) == 0)
                {
                    qobj.add(Next);
                }
            }
        }

        if(iCount != hobj.size())
        {
            System.out.println("Circular dependency exists");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to resolve software dependencies
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A154_SoftwareDependency
{
    public static void main(String A[])
    {
        String Dependencies[] =
        {
            "A C",
            "B C",
            "C D",
            "B E",
            "D F",
            "E F"
        };

        CollectionX col = new CollectionX();

        col.dependencyOrder(Dependencies);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// A -> C
// B -> C
// C -> D
// B -> E
// D -> F
// E -> F
//
// Output:
//
// Valid dependency order:
//
// A
// B
// C
// D
// E
// F
//
//////////////////////////////////////////////////////////////////////////////////////////////////