 class Student {
   public String name;
   public int id;

   public Student() {
     System.out.println("I was called");
   }

   public void showDetail(){
    System.out.println(name+ " "+ id);
   }
}
public class ConstructorDef{
    public static void main (String[] args){
     Student s1=new Student();
     Student s2=new Student();
     Student s3=new Student();
     Student s4=new Student();
    }
}
