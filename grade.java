import java.util.Scanner;
class grade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double g1 = scan.nextDouble();
        double g2 = scan.nextDouble();
        double g3 = scan.nextDouble();
        double g4 = scan.nextDouble();
        double g5 = scan.nextDouble();
        g1 = g1*3;
        g2 = g2*3;
        g3 = g3*4;
        g4 = g4*2;
        double sum = g1 + g2 + g3 + g4;
        double avg = sum/12;
        System.out.println(avg);
    }
}