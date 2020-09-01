import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner input = new Scanner(System.in);
         int a= input.nextInt();
         long count=0;
         double sum=0,n1=0,n2=0;

         for(int i=0;i<a;i++)
         {
             n1=input.nextInt();
             n2=input.nextInt();
             if(n1>n2)
             {
             sum=n1/n2;
             if(sum>=1.60&&sum<=1.70)
             count++;
             }
             if(n2>n1)
             {
                 sum=n2/n1;
             if(sum>=1.60&&sum<=1.70)
             count++;
             }
           // a--;
         }
         System.out.println(count);
