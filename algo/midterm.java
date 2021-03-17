import java.util.Scanner;
class midterm{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int n;
        while(true){ 
            sum = 0;
            n = scan.nextInt();
            for(int i=1; i<=n; i=2*i){
                for(int j=i; j<=n; j++){
                    sum++;
                }
            }
            System.out.println("sum = "+sum);
        }
    }
}