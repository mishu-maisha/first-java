class Student{
  public String name;
  public int id;

  public Student(String name, int id){
    this.name=name;//need to use this operator otherwise it will call reference var 
    this.id =id;
  }
  public void print(){
    System.out.println(name+" "+id);
  }
}
public class Constructorpar{
  public static void main(String[] args) {
      Student s1=new Student("Maisha",44);
      Student s2=new Student ("Faiza",8);
      s1.print();
      s2.print();
  }
}