public class fourth {
    static class student {
        String name;
        int rollno;
        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("Rollno: "+rollno);
        }
    }
    static class subject{
        String sub1,sub2;
        void display()
        {
            System.out.println("Subject1: "+sub1);
            System.out.println("Subject2: "+sub2);
        }
    }
    public static void main(String args[]){
        //obj for student class
        student s1=new student();
        s1.name="Ram";
        s1.rollno=101;

        //obj for subject class
        subject sb1=new subject();
        sb1.sub1="English";
        sb1.sub2="Science";

        s1.display();
        sb1.display();
    }
    
     
}
