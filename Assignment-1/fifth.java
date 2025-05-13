public class fifth {
    public static void main(String[] args) {
        try {
            // Creating an obj of the outer class fifth
            fifth outerClass = new fifth();
            Class<?> c = Class.forName("fifth$Student");


            Student s = (Student) c.getDeclaredConstructor(fifth.class).newInstance(outerClass);

            
            s.name = "vidhi";
            s.roll_no = 49;

           
            System.out.println("Student Details: ");
            s.display();

        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
    class Student
     {
        String name;
        int roll_no;

        //methodd
        void display() {
            System.out.println("Name: " + name);
            System.out.println("RollNo: " + roll_no);
        }
    }
}
