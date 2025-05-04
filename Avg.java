
import java.util.Scanner;
import java.util.ArrayList;

public class Avg{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list= new ArrayList<>();
    System.out.println("Enter number of elements:");
    int n=sc.nextInt();

    System.out.println("Enter "+ n +" integers");
    for (int i= 0; i<n; i++) {
         int val=sc.nextInt();
         list.add(val);
        
    }
    int sum =0;
    for(int num: list){
        sum=sum+num;
    }
    double avg= (double)sum/list.size();
    System.out.println("Average "+ avg);
    }
}