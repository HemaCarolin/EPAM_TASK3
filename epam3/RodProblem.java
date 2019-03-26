package epam3;
import java.util.Scanner;
class RodProblem {
 public static void main(String args[] ) throws Exception {
     //Scanner
     Scanner scan = new Scanner(System.in);
      int testcases = scan.nextInt(); 
      for(int i=0;i<testcases;i++)
      {
     int rod_length = scan.nextInt();
     rod_length++;
      int special_rod=-1;
         while(rod_length>=2)
         {
             special_rod++;
             if(rod_length%2==0)
             {
                 rod_length=rod_length/2;
             }
             else
             {
                 rod_length=(rod_length-((rod_length+1)/2));
             }
         }
         System.out.println(special_rod);
     }
      scan.close();
 }
}