public class third {
    public static void main(String args[]){
   student s1=new student();
   s1.name="Ram";
   s1.rollno=101;
   s1.display();

    }
    static class student{
     String name;
     int rollno;
     void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll_No : "+rollno);
     }
    }
}
