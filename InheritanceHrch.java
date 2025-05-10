class animal{
    void eat(){
        System.out.println("This animal eats good");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("This dog barks");
    }
}
class cat extends animal{
    void mew(){
        System.out.println("This cat is cute");
    }
}
public class InheritanceHrch{
    public static void main(String[] args){
        dog d=new dog();
        d.eat();
        d.bark();

        cat c=new cat();
        c.eat();
        c.mew();
    }
}