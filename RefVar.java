class student{//create a class before main class to store attributes of objs
    int id;//attributes or fields
    String name;//or reference variable
}

class RefVar{
    public static void main(String args[]){
        student s1=new student();//create s1 obj under student class
        s1.id=220344;//assign values in objs
        s1.name="Maisha";
        System.out.println(s1.id+" "+s1.name);

        //by using reference variable ,we first create objects under a class 
    }   //and then assign values to it
}