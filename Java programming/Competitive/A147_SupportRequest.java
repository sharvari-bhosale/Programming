import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   addRequest()
// Description     :   To add customer support request
// Input           :   String
// Output          :   none
//
// Function name   :   processRequest()
// Description     :   To process first customer support request
//
// Function name   :   showPendingRequests()
// Description     :   To display pending requests
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    Queue<String> qobj = new LinkedList<String>();

    public void addRequest(String Request)
    {
        qobj.add(Request);
    }

    public void processRequest()
    {
        if(qobj.isEmpty())
        {
            System.out.println("No request to process");
        }
        else
        {
            System.out.println("Processing request : " + qobj.remove());
        }
    }

    public void showPendingRequests()
    {
        System.out.println("Pending requests:");

        for(String str : qobj)
        {
            System.out.println(str);
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to manage customer support requests
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A147_SupportRequest
{
    public static void main(String A[])
    {
        CollectionX col = new CollectionX();

        col.addRequest("R101");
        col.addRequest("R102");
        col.addRequest("R103");
        col.addRequest("R104");

        col.showPendingRequests();

        col.processRequest();
        col.processRequest();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// R101
// R102
// R103
// R104
//
// Output:
//
// Pending requests:
// R101
// R102
// R103
// R104
//
// Processing request : R101
// Processing request : R102
//
//////////////////////////////////////////////////////////////////////////////////////////////////