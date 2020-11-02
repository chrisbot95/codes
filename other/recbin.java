class Testmyshit{    
    public static void main(String[] args)
    {
        System.out.println(recBin(7,4));
    }
    public static int recBin(int n, int m)
    {
        if(m==0||m==n){
            return 1;
        }
        else{
            int a = recBin(n-1, m-1);
            int b = recBin(n-1, m);
            return a+b;
        }
    }
}