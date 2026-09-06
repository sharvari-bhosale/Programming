import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   displayTopProducts()
// Description     :   To display top 2 most frequently purchased products
// Input           :   int[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void displayTopProducts(int Arr[])
    {
        HashMap<Integer, Integer> hobj =
            new HashMap<Integer, Integer>();

        for(int i : Arr)
        {
            if(hobj.containsKey(i))
            {
                hobj.put(i, hobj.get(i) + 1);
            }
            else
            {
                hobj.put(i, 1);
            }
        }

        ArrayList<Integer> alobj =
            new ArrayList<Integer>(hobj.keySet());

        Collections.sort(alobj, new Comparator<Integer>()
        {
            public int compare(Integer iNo1, Integer iNo2)
            {
                return hobj.get(iNo2) - hobj.get(iNo1);
            }
        });

        int iCount = 0;

        for(Integer i : alobj)
        {
            System.out.println(i + " -> " + hobj.get(i));

            iCount++;

            if(iCount == 2)
            {
                break;
            }
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to display top 2 most frequently purchased products
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A150_ProductFrequency
{
    public static void main(String A[])
    {
        int Products[] =
        {
            101, 102, 101, 103, 101,
            102, 104, 105, 102, 102, 103
        };

        CollectionX col = new CollectionX();

        col.displayTopProducts(Products);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// 101 102 101 103 101 102 104 105 102 102 103
//
// Output:
//
// 102 -> 4
// 101 -> 3
//
//////////////////////////////////////////////////////////////////////////////////////////////////