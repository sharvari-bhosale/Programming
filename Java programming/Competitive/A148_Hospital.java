import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   Patient
// Description     :   To store patient information
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class Patient
{
    String name;
    int severity;

    public Patient(String name, int severity)
    {
        this.name = name;
        this.severity = severity;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   displayPatients()
// Description     :   To display patients according to severity
// Input           :   Patient[]
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void displayPatients(Patient Arr[])
    {
        PriorityQueue<Patient> pobj =
            new PriorityQueue<Patient>(
                new Comparator<Patient>()
                {
                    public int compare(Patient p1, Patient p2)
                    {
                        return p2.severity - p1.severity;
                    }
                });

        for(Patient p : Arr)
        {
            pobj.add(p);
        }

        System.out.println("Patient treatment order:");

        while(!pobj.isEmpty())
        {
            Patient p = pobj.remove();

            System.out.println(p.name);
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to display patients according to severity
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A148_Hospital
{
    public static void main(String A[])
    {
        Patient Arr[] =
        {
            new Patient("Rahul", 2),
            new Patient("Amit", 5),
            new Patient("Pooja", 1),
            new Patient("Neha", 4)
        };

        CollectionX col = new CollectionX();

        col.displayPatients(Arr);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:
//
// Rahul 2
// Amit 5
// Pooja 1
// Neha 4
//
// Output:
//
// Patient treatment order:
// Amit
// Neha
// Rahul
// Pooja
//
//////////////////////////////////////////////////////////////////////////////////////////////////