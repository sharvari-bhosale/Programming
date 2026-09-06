import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   Student
// Description     :   To store student information
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class Student
{
    String Name;
    int Marks;

    public Student(String Name, int Marks)
    {
        this.Name = Name;
        this.Marks = Marks;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Class Name      :   CollectionX
// Description     :   To perform various operations using Collection Framework
//
// Function name   :   displayStudents()
// Description     :   To display students according to marks
// Input           :   ArrayList<Student>
// Output          :   none
//
// Author          :   Sharvari Gorakhnath Bhosale
// Date            :   06/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

class CollectionX
{
    public void displayStudents(ArrayList<Student> sobj)
    {
        Collections.sort(sobj, new Comparator<Student>()
        {
            public int compare(Student s1, Student s2)
            {
                if(s1.Marks != s2.Marks)
                {
                    return s2.Marks - s1.Marks;
                }
                else
                {
                    return s1.Name.compareTo(s2.Name);
                }
            }
        });

        for(Student s : sobj)
        {
            System.out.println(s.Name + " " + s.Marks);
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to display students according to descending marks
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class A145_Student
{
    public static void main(String A[])
    {
        ArrayList<Student> sobj =
            new ArrayList<Student>();

        sobj.add(new Student("Amit", 78));
        sobj.add(new Student("Pooja", 92));
        sobj.add(new Student("Rahul", 85));
        sobj.add(new Student("Neha", 92));
        sobj.add(new Student("Kiran", 67));

        CollectionX col = new CollectionX();

        col.displayStudents(sobj);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Input:   Amit   78
//          Pooja  92
//          Rahul  85
//          Neha   92
//          Kiran  67
//
// Output:  Neha 92
//          Pooja 92
//          Rahul 85
//          Amit 78
//          Kiran 67
//
//////////////////////////////////////////////////////////////////////////////////////////////////