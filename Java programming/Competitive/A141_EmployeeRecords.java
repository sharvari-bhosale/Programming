// Write a program that display how many times each employee enetered the office.

import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Class Name      :   CollectionX 
// Description     :   To perform various opeation using Collection Framework
//
// Function name   :   CountFrequency()
// Description     :   To count how many times a employee has entered in office
// Input           :   int
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
// 
/////////////////////////////////////////////////////////////////////////////////////////////////
/// 
class CollectionX
{
    public void CountFrequency(int Arr[])
    {
        HashMap <Integer, Integer> hobj = new HashMap<Integer, Integer>();

        int iCount = 0;

        for(int i : Arr)
        {
            if(hobj.containsKey(i))
            {
                iCount = hobj.get(i);
                hobj.put(i, iCount+1);
            }
            else
            {
                hobj.put(i, 1);
            }
        }

        for(int i : hobj.keySet())
        {
            System.out.println(i + " -> " + hobj.get(i));
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Application to display how many times each employee entered the office
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A141_EmployeeRecords 
{
    public static void main(String A[]) 
    { 
        int Arr[] = {101,102,103,101,104,102,101,105};

        CollectionX col = new CollectionX();
        col.CountFrequency(Arr);
    }    
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   101,102,103,101,104,102,101,105
//
//  Output  :   101 -> 3
//              102 -> 2
//              103 -> 1
//              104 -> 1
//              105 -> 1
//
//////////////////////////////////////////////////////////////////////////////////////////////////

