
 import java.util.ArrayList; 
 import java.util.Scanner;

 public class Array{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      ArrayList<Integer> list =new ArrayList<>();
       System.out.println("Enter n");
      int n= sc.nextInt();
      

      for(int i=0;i<n;i++){
        int val=sc.nextInt();
        list.add(val);

      }
      System.out.println("The elements of the array:");
      for (int i = 0; i < n; i++) {
          System.out.println(list.get(i));
          
          
      }
      

    }

}