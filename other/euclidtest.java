class euclidtest{    
    public static void main(String[] args)
    {
        for(int i=0; i<=32; i++){
            euclid(32,i);
            System.out.println(i+" count = "+count);
            count = 0;  
        }
    }
    public static int euclid(int n, int m)
    {
        count++;
        //System.out.print("n = "+n+" ");
        //System.out.print("m = "+m+" ");
        int r;
        int g;
        if(m==0||m==n){
            //System.out.println(n);
            return n;
        }
        else{
            r = n%m;
            //System.out.println("r = "+r+" ");
            g = euclid(m,r);
            //System.out.println("g = "+g);
            return g;
        }
    }
    public static int count;
}