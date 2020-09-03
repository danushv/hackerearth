import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int size=input.nextInt();
        int []arr= new int [size];
        for (int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        int q_size= input.nextInt();
        int []qarr= new int[q_size];
        for (int a=0;a<q_size;a++)
        {
            qarr[a]=input.nextInt();

        }
        int sum=0;

        for(int j=0;j<q_size;j++)
        {sum=0;
                for (int x=0;x<size;x++)
                {
                    sum=sum+arr[x];
                    if(sum>=qarr[j] )
                    {System.out.println(x+1);
                    break;}
                    else if(x==size-1)
                    System.out.println("-1");
                }
        }
