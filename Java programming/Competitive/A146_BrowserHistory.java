import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   storeHistory()
// Description     :   To store last 5 visited websites
// Input           :   String[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void storeHistory(String Arr[])
    {
        Queue<String> qobj = new LinkedList<String>();

        for(String str : Arr)
        {
            if(qobj.size() == 5)
            {
                qobj.remove();
            }

            qobj.add(str);
        }

        System.out.println("Browser history:");

        for(String str : qobj)
        {
            System.out.println(str);
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to store last 5 visited websites
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A146_BrowserHistory
{
    public static void main(String A[])
    {
        String Websites[] =
        {
            "google.com",
            "github.com",
            "openai.com",
            "oracle.com",
            "stackoverflow.com",
            "youtube.com"
        };

        CollectionX col = new CollectionX();

        col.storeHistory(Websites);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:   google.com
//          github.com
//          openai.com
//          oracle.com
//          stackoverflow.com
//          youtube.com
//
// Output:  github.com
//          openai.com
//          oracle.com
//          stackoverflow.com
//          youtube.com
//
//////////////////////////////////////////////////////////////////////////////////////////////////