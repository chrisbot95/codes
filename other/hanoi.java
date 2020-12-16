class hanoi{
    public static void main(String[] args){
        towers(3,1,3);
    }
    public static void towers(int n, int i, int j){
        System.out.print(n+" "+i+" "+j);
        if (n==1){
            System.out.println("; move disk from peg "+i+" to peg "+j);
        }
        else{
            int k = 6-i-j;
            System.out.println(" k = "+k);
            towers(n-1,i,k);
            System.out.println("move "+i+" to "+j);
            towers(n-1,k,j);
        }
    }
}