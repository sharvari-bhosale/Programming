import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   findLongestSequence()
// Description     :   To find longest consecutive employee ID sequence
// Input           :   int[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void findLongestSequence(int Arr[])
    {
        HashSet<Integer> hobj = new HashSet<Integer>();

        for(int i : Arr)
        {
            hobj.add(i);
        }

        int iLongest = 0;
        int iStart = 0;

        for(int i : hobj)
        {
            if(!hobj.contains(i - 1))
            {
                int iCurrent = i;
                int iCount = 1;

                while(hobj.contains(iCurrent + 1))
                {
                    iCurrent++;
                    iCount++;
                }

                if(iCount > iLongest)
                {
                    iLongest = iCount;
                    iStart = i;
                }
            }
        }

        System.out.println("Longest consecutive sequence:");

        for(int i = iStart; i < iStart + iLongest; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n\nLength : " + iLongest);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to find longest consecutive employee ID sequence
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A152_EmployeeSequence
{
    public static void main(String A[])
    {
        int EmployeeIDs[] =
        {
            100, 4, 200, 1, 3, 2, 5
        };

        CollectionX col = new CollectionX();

        col.findLongestSequence(EmployeeIDs);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// 100
// 4
// 200
// 1
// 3
// 2
// 5
//
// Output:
//
// Longest consecutive sequence:
//
// 1 2 3 4 5
//
// Length : 5
//
//////////////////////////////////////////////////////////////////////////////////////////////////