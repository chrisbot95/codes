import java.util.Random;
class biggestnum{
    public static void main(String[] args){
        int[] x = new int[10];
        Random r = new Random();
        for(int i=0; i<x.length; i++){
            x[i] = r.nextInt(20);
            System.out.print(x[i]+" ");
        }
        System.out.println();
        //System.out.println(1/2);
        System.out.println(getNum(0, x.length-1, x));
    }
    public static int getNum(int s, int e, int[] x){
        System.out.println(s+" "+e);
        if(e-1>s){
            int a = getNum(s, (e+s)/2, x);
            int b = getNum((e+s)/2+1, e, x);
            if(x[a]>x[b])
                return a;
            else
                return b;
        }
        else{
            if(x[e]>x[s])
                return e;
            else
                return s;
        }
    }
}