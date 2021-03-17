class mathgenerator{
    public static void main(String[] args){
        int n = 0;
        for(int i=2; i<=10; i++){
            for(int j=2; j<=10; j++){
                System.out.println("        x["+n+"][0] = \""+i+" * "+j+"\"; x["+n+"][1] = \""+(i*j)+"\";");
                n++;
            }
        }
    }
}