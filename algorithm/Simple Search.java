class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int [] arr= new int[a];
        for (int i=0;i<a;i++)
        {
            arr[i]=input.nextInt();
        }
        int search= input.nextInt();
        for(int z=0;z<a;z++)
        {
            if(search==arr[z])
            System.out.println(z);
        }
