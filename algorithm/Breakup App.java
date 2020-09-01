import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        String str;
        int w1=0,w2=0;

        int a= input.nextInt();
        for (int i=0;i<a;i++)
        {
            str=input.nextLine();
            if(str.contains("G:"))
            {
                if(str.contains("19"))
                {
                    w1=w1+2;
                }
                if(str.contains("21"))
                {
                    w2=w2+2;
                }
            }
            if(str.contains("M:"))
            {
                if(str.contains("19"))
                {
                    w1=w1+1;
                }
                if(str.contains("21"))
                {
                    w2=w2+1;
                }
            }
           

        }
         if(w1>w2)
            System.out.println("Date");
            else
            System.out.println("No Date");
