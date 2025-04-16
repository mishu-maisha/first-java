class car{//create a class
    int no;
    String color;

    void insertDetail(int n,String s){//Firstly creating a method in the class (instance)initializing values of objs
      no=n; //by invoking the methods
      color=s;
    }
    void printDetail(){//to print no and color
        System.out.println(no+" "+color);
    }
}
class objbyMethod{
    public static void main(String args[]){
        car car1=new car();//create objs
        car car2=new car();
        car1.insertDetail(1000,"Red");//insertdetail=>n=>no(assigns value in no)
        car2.insertDetail(2000,"Blue");//keeps these values in compile
        car1.printDetail();//finally shows(prints) by calling this method
        car2.printDetail();



    }
}
