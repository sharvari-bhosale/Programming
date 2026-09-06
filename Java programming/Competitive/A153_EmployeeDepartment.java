import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   groupEmployees()
// Description     :   To group employees department-wise
// Input           :   String[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void groupEmployees(String Arr[])
    {
        LinkedHashMap<String, ArrayList<String>> hobj =
            new LinkedHashMap<String, ArrayList<String>>();

        for(String str : Arr)
        {
            String Data[] = str.split(" ");

            String Name = Data[0];
            String Department = Data[1];

            if(hobj.containsKey(Department))
            {
                hobj.get(Department).add(Name);
            }
            else
            {
                ArrayList<String> alobj =
                    new ArrayList<String>();

                alobj.add(Name);

                hobj.put(Department, alobj);
            }
        }

        for(String Department : hobj.keySet())
        {
            System.out.println("\n" + Department + ":");

            ArrayList<String> alobj = hobj.get(Department);

            for(String Name : alobj)
            {
                System.out.println(Name);
            }
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to group employees department-wise
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A153_EmployeeDepartment
{
    public static void main(String A[])
    {
        String Employees[] =
        {
            "Amit IT",
            "Rahul HR",
            "Pooja IT",
            "Neha Finance",
            "Kiran HR",
            "Riya IT"
        };

        CollectionX col = new CollectionX();

        col.groupEmployees(Employees);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// Amit IT
// Rahul HR
// Pooja IT
// Neha Finance
// Kiran HR
// Riya IT
//
// Output:
//
// IT:
// Amit
// Pooja
// Riya
//
// HR:
// Rahul
// Kiran
//
// Finance:
// Neha
//
//////////////////////////////////////////////////////////////////////////////////////////////////