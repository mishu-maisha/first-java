class Pen{
   String color;
   String type;

   public void printobj(){
      System.out.println(this.color);
      System.out.println(type);
   }
}
public class PrintObj{
    public static void main (String[] args){
       Pen p1=new Pen();
       p1.color="orange";
       p1.type="boll point";

       Pen p2=new Pen();
       p2.color="red";
       p2.type="gel pen";

       p1.printobj();
       p2.printobj();
    }


    
}