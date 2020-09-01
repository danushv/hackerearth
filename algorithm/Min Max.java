import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner input = new Scanner(System.in);
        
         int a= input.nextInt();
          int []arr=new int[a];
         for (int i=0;i<a;i++)
         {
             arr[i]=input.nextInt();
         }
         Arrays.sort(arr);
         int minsum=0;
         int maxsum=0;
         for (int i=0;i<a-1;i++)
         {
             minsum=minsum+arr[i];
         }
         for (int i=1;i<a;i++)
         {
             maxsum=maxsum+arr[i];
         }
         System.out.println(minsum+" "+maxsum);
