class animal{
    void eat(){
        System.out.println("This animal is eating");
    }
}
class dog extends animal{
    void bark(){
     System.out.println("This dog is barking");
    }
}
class puppy extends dog{
    void weep(){
        System.out.println("This puppy weeps");
    }
}
public class InheritanceMltpl{
    public static void main(String[] args ){
        puppy p= new puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}