import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   findFrequency()
// Description     :   To count frequency of each word and find most frequent word
// Input           :   String[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void findFrequency(String Arr[])
    {
        HashMap<String, Integer> hobj =
            new HashMap<String, Integer>();

        for(String str : Arr)
        {
            if(hobj.containsKey(str))
            {
                hobj.put(str, hobj.get(str) + 1);
            }
            else
            {
                hobj.put(str, 1);
            }
        }

        String MostFrequent = "";
        int iMax = 0;

        for(String str : hobj.keySet())
        {
            System.out.println(str + " -> " + hobj.get(str));

            if(hobj.get(str) > iMax)
            {
                iMax = hobj.get(str);
                MostFrequent = str;
            }
        }

        System.out.println("\nMost frequent word : " + MostFrequent);
        System.out.println("Frequency : " + iMax);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to find most frequently occurring word
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A149_WordFrequency
{
    public static void main(String A[])
    {
        String Words[] =
        {
            "python",
            "java",
            "c",
            "java",
            "python",
            "cpp",
            "java"
        };

        CollectionX col = new CollectionX();

        col.findFrequency(Words);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// python java c java python cpp java
//
// Output:
//
// java -> 3
// python -> 2
// c -> 1
// cpp -> 1
//
// Most frequent word : java
// Frequency : 3
//
//////////////////////////////////////////////////////////////////////////////////////////////////