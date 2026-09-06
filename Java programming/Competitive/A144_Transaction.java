import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   identifyDuplicate()
// Description     :   To identify duplicate transaction IDs
// Input           :   String[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void identifyDuplicate(String Arr[])
    {
        HashSet<String> hobj =
            new HashSet<String>();

        LinkedHashSet<String> lobj =
            new LinkedHashSet<String>();

        for(String str : Arr)
        {
            if(hobj.contains(str))
            {
                lobj.add(str);
            }
            else
            {
                hobj.add(str);
            }
        }

        System.out.println("Duplicate transactions:");

        for(String str : lobj)
        {
            System.out.println(str);
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to identify duplicate transaction IDs
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A144_Transaction
{
    public static void main(String A[])
    {
        String Transactions[] =
        {
            "TX101",
            "TX102",
            "TX103",
            "TX101",
            "TX104",
            "TX102"
        };

        CollectionX col = new CollectionX();

        col.identifyDuplicate(Transactions);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:   TX101
//          TX102
//          TX103
//          TX101
//          TX104
//          TX102
//
// Output:  Duplicate transactions:
//          TX101
//          TX102
//
//////////////////////////////////////////////////////////////////////////////////////////////////