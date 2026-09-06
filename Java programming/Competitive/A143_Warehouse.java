import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   manageProducts()
// Description     :   To manage product quantity
// Input           :   String
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void manageProducts(String Operations[])
    {
        HashMap<Integer, Integer> hobj =
            new HashMap<Integer, Integer>();

        for(String str : Operations)
        {
            String Arr[] = str.split(" ");

            String Operation = Arr[0];
            int ProductID = Integer.parseInt(Arr[1]);

            if(Operation.equals("ADD"))
            {
                int Quantity = Integer.parseInt(Arr[2]);

                if(hobj.containsKey(ProductID))
                {
                    hobj.put(ProductID,
                            hobj.get(ProductID) + Quantity);
                }
                else
                {
                    hobj.put(ProductID, Quantity);
                }
            }

            else if(Operation.equals("SELL"))
            {
                int Quantity = Integer.parseInt(Arr[2]);

                if(hobj.containsKey(ProductID))
                {
                    hobj.put(ProductID,
                            hobj.get(ProductID) - Quantity);
                }
                else
                {
                    System.out.println("Product " + ProductID +
                                       " does not exist");
                }
            }

            else if(Operation.equals("RESTOCK"))
            {
                int Quantity = Integer.parseInt(Arr[2]);

                if(hobj.containsKey(ProductID))
                {
                    hobj.put(ProductID,
                            hobj.get(ProductID) + Quantity);
                }
                else
                {
                    hobj.put(ProductID, Quantity);
                }
            }

            else if(Operation.equals("SEARCH"))
            {
                if(hobj.containsKey(ProductID))
                {
                    System.out.println("Product " + ProductID +
                                       " available quantity : " +
                                       hobj.get(ProductID));
                }
                else
                {
                    System.out.println("Product " + ProductID +
                                       " does not exist");
                }
            }
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to manage e-commerce warehouse
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A143_Warehouse
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Operations[] =
        {
            "ADD 101 50",
            "ADD 102 30",
            "SELL 101 5",
            "RESTOCK 102 20",
            "SEARCH 101"
        };

        CollectionX col = new CollectionX();

        col.manageProducts(Operations);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:   ADD 101 50
//          ADD 102 30
//          SELL 101 5
//          RESTOCK 102 20
//          SEARCH 101
//
// Output:  Product 101 available quantity : 45
//
//////////////////////////////////////////////////////////////////////////////////////////////////