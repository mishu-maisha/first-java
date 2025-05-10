class animal{
    void eat(){
        System.out.println("This animal is cute");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("This dog barks");
    }
}
public class InheritanceSmpl{
    public static void main(String[] args){
    dog d =new dog();
    d.eat();
    d.bark();
    }
}