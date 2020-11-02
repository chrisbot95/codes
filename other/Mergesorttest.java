class Mergesorttest{
    public static void main(String[] args){

    }
    public static void mergeSort(int[] x, int l, int r){
        if(l>=r){
            int m = (l+r)/2;
            mergeSort(x, l, m);
            mergeSort(x, m+1, r);
            Merge(x, l, r);
        }
    }
    public static void Merge(int[] x, int l, int r){
        int m = (l+r)/2;
    }
}