import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   identifyCharacter()
// Description     :   To identify first non-repeating character
// Input           :   String
// Output          :   none
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void identifyCharacter(String Char)
    {
        LinkedHashMap<Character, Integer> lobj =
            new LinkedHashMap<Character, Integer>();

        for(int i = 0; i < Char.length(); i++)
        {
            char ch = Char.charAt(i);

            if(lobj.containsKey(ch))
            {
                lobj.put(ch, lobj.get(ch) + 1);
            }
            else
            {
                lobj.put(ch, 1);
            }
        }

        for(Character c : lobj.keySet())
        {
            if(lobj.get(c) == 1)
            {
                System.out.println("First non-repeating character : " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to identify first non-repeating character
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A142_FirstNonRepeating
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Message = "";

        System.out.println("Enter your message : ");
        Message = sobj.nextLine();

        Message = Message.toLowerCase();

        CollectionX col = new CollectionX();

        col.identifyCharacter(Message);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input  : programming
//
// Output : First non-repeating character : p
//
//
//////////////////////////////////////////////////////////////////////////////////////////////////