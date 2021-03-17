class Enigmatest{
    public static void main(String[] args){
        
    }
    public static boolean Enigma(int[][] A){
        int n = 9;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if (A[i][j] != A[j][i]){
                    return false
                }
            }
        }
        return true;
    }
}