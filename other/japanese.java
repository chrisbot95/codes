import java.util.Scanner;
class japanese{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        System.out.println();
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)=='a')
                System.out.print("ka");
            if(x.charAt(i)=='b')
                System.out.print("tu");
            if(x.charAt(i)=='c')
                System.out.print("mi");
            if(x.charAt(i)=='d')
                System.out.print("te");
            if(x.charAt(i)=='e')
                System.out.print("ku");
            if(x.charAt(i)=='f')
                System.out.print("lu");
            if(x.charAt(i)=='g')
                System.out.print("ji");
            if(x.charAt(i)=='h')
                System.out.print("ri");
            if(x.charAt(i)=='i')
                System.out.print("ki");
            if(x.charAt(i)=='j')
                System.out.print("zu");
            if(x.charAt(i)=='k')
                System.out.print("me");
            if(x.charAt(i)=='l')
                System.out.print("ta");
            if(x.charAt(i)=='m')
                System.out.print("rin");
            if(x.charAt(i)=='n')
                System.out.print("to");
            if(x.charAt(i)=='o')
                System.out.print("mo");
            if(x.charAt(i)=='p')
                System.out.print("no");
            if(x.charAt(i)=='q')
                System.out.print("ke");
            if(x.charAt(i)=='r')
                System.out.print("shi");
            if(x.charAt(i)=='s')
                System.out.print("ari");
            if(x.charAt(i)=='t')
                System.out.print("chi");
            if(x.charAt(i)=='u')
                System.out.print("do");
            if(x.charAt(i)=='v')
                System.out.print("ru");
            if(x.charAt(i)=='w')
                System.out.print("mei");
            if(x.charAt(i)=='x')
                System.out.print("na");
            if(x.charAt(i)=='y')
                System.out.print("fu");
            if(x.charAt(i)=='z')
                System.out.print("zi");
            if(x.charAt(i)==' ')
                System.out.print(" ");
        }
    }
}