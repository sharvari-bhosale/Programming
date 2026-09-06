import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   findPair()
// Description     :   To find two transactions whose sum is equal to target
// Input           :   int[], int
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void findPair(int Arr[], int iTarget)
    {
        HashSet<Integer> hobj = new HashSet<Integer>();

        for(int i : Arr)
        {
            int iNo = iTarget - i;

            if(hobj.contains(iNo))
            {
                System.out.println(iNo + " + " + i + " = " + iTarget);
                return;
            }

            hobj.add(i);
        }

        System.out.println("No pair found");
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to find two transactions matching target
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A151_TransactionPair
{
    public static void main(String A[])
    {
        int Transactions[] =
        {
            1200, 500, 700, 300, 1500
        };

        int iTarget = 2000;

        CollectionX col = new CollectionX();

        col.findPair(Transactions, iTarget);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// 1200 500 700 300 1500
// Target : 2000
//
// Output:
//
// 500 + 1500 = 2000
//
//////////////////////////////////////////////////////////////////////////////////////////////////