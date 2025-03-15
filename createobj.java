class Pen  {//conventional to use caplital letters for class
    String color;/*attributes*/
    String type;//color type are data of the class

     public void write(){//public+method type+method name.rules for method creating: it is conventional in java to use smaill letters in making methods
        //method is a member of class
        System.out.println("this pen writes well");//method

     }
}
public class createobj{
    public static void main (String[] args){
     Pen pen1=new Pen();//creating objects: class name+any name related to it
     pen1.color="blue";  //need to allocate memory for Pen class
     pen1.type="Matador i-teen";//accesing value of obj by obj.class attributes

     pen1.write();//calling methods:obj.method name
    }
}