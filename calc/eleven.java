import java.util.Random;
import java.util.Scanner;
class eleven{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[70][2];
        int length=14;
        int[] z = new int[length];
        int r;
        int temp;
        for(int i=0; i<length; i++){
            z[i]=i;
        }
        for(int i=0; i<length; i++){
            r = rand.nextInt(length);
            temp = z[i];
            z[i] = z[r];
            z[r] = temp;
        }
        x[0][0] = "4)Comparison Test"; x[0][1] = "if the first function is less then the second function and the second function is convergent, then we know the first one is convergent aswell";
        x[1][0] = "4)The Limit Comparison Test"; x[1][1] = "you take the limit of An/Bn and it will equal some constant. That constant should be greater than 0. If it does equal a constant it means that the convergence status of both A and B are the same.";
        x[2][0] = "The Integral Test"; x[2][1] = "Suppose f is a function which is 1.continuous, 2.positive, 3.decreasing on the interval A to infinity. let An = f(n). Its not necessary that its always decreasing, just that its eventually decreasing. once we know we can do the integral test, we take the integral of the function and then find if it equals a finite number, that means that the integral is convergent. Therefore the series is also convergent.";
        x[3][0] = "The P series test"; x[3][1] = "on the interval 1 to infinity, 1/x^p is convergent if p>1 and divergent if p<=1; on the interval 1 to infinity, its swapped.";
        x[4][0] = "THE SQUEEZE THEOREM"; x[4][1] = "the range of sin or cos is from -1 to 1, and the squarage of either brings the range to 0 to 1. use that inequality shit";
        x[5][0] = "what is an alternating series?"; x[5][1] = "A series whose terms are alternately positive and  negative";
        x[6][0] = "under what conditions does an alternating series converge?"; x[6][1] = "Bn+1 is greater than zero, less than or equal to Bn, and lim(n>infinity)Bn = 0, where Bn = |An|";
        x[7][0] = "If these conditions are satisfied, what can you say about the remainder after n terms?"; x[7][1] = "|Rn| <= Bn+1";
        x[8][0] = "a series Ean is called absolutely convergent if"; x[8][1] = "the series E|an| is convergent";
        x[9][0] = "a series is conditionally convergent if it is"; x[9][1] = "convergent but not absolutely convergent";
        x[10][0] = "The alternating p series"; x[10][1] = "1/x^(0<p<=1) but alternating, they are all conditionally convergent";
        x[11][0] = "Theorem 3 = if a series is absolutely convergent, then it is"; x[11][1] = "convergent";
        x[12][0] = "By theorem 3(______) An is convergent"; x[12][1] = "if a series is absolutely convergent, then it is convergent";
        x[13][0] = "any geometric series with |r|<1 is"; x[13][1] = "absolutely convergent";
        x[14][0] = "for cos(n)/n^3, it has negative values, how do we show its convergence?"; x[14][1] = "if we can show |cos(n)/n^3| is convergent, then it is absolutely convergent and so convergent. remember the whole |cosx|/n^3 is between 0 and 1 thing which is less then or equal to 1/n^3 which is convergent";
        x[15][0] = "The Ratio Test"; x[15][1] = "put An+1 over An and take the limit. If it equals a constant (0<=C<1) then it is absolutely convergent, If C is > 1 or infinity, it is divergent. If C = 1, the Ratio Test is inconclusive.";
        x[16][0] = "if you see factorials, try"; x[16][1] = "The ratio test";
        x[17][0] = "The Root Test"; x[17][1] = "useful with powers. take the nth root of the absolute value of An, if 0<=L<1 then it is absolutely convergent, if L>1 or 1 is infinity, then it is divergent, if L=1, the test is inconclusive.";
        x[18][0] = "first look at the sequence,"; x[18][1] = "";
        x[19][0] = ""; x[19][1] = "";
        x[20][0] = ""; x[20][1] = "";
        x[21][0] = ""; x[21][1] = "";
        x[22][0] = ""; x[22][1] = "";
        x[23][0] = ""; x[23][1] = "";
        x[24][0] = ""; x[24][1] = "";
        x[25][0] = ""; x[25][1] = "";
        x[26][0] = ""; x[26][1] = "";
        x[27][0] = ""; x[27][1] = "";
        x[28][0] = ""; x[28][1] = "";
        x[29][0] = ""; x[29][1] = "";
        x[30][0] = ""; x[30][1] = "";
        x[31][0] = ""; x[31][1] = "";
        x[32][0] = ""; x[32][1] = "";
        x[33][0] = ""; x[33][1] = "";
        x[34][0] = ""; x[34][1] = "";
        x[35][0] = ""; x[35][1] = "";
        x[36][0] = ""; x[36][1] = "";
        x[37][0] = ""; x[37][1] = "";
        x[38][0] = ""; x[38][1] = "";
        x[39][0] = ""; x[39][1] = "";
        x[40][0] = ""; x[40][1] = "";
        x[41][0] = ""; x[41][1] = "";
        x[42][0] = ""; x[42][1] = "";
        x[43][0] = ""; x[43][1] = "";
        x[44][0] = ""; x[44][1] = "";
        x[45][0] = ""; x[45][1] = "";
        x[46][0] = ""; x[46][1] = "";
        x[47][0] = ""; x[47][1] = "";
        x[48][0] = ""; x[48][1] = "";
        x[49][0] = ""; x[49][1] = "";
        x[50][0] = ""; x[50][1] = "";
        x[51][0] = ""; x[51][1] = "";
        x[52][0] = ""; x[52][1] = "";
        x[53][0] = ""; x[53][1] = "";
        x[54][0] = ""; x[54][1] = "";
        x[55][0] = ""; x[55][1] = "";
        x[56][0] = ""; x[56][1] = "";
        x[57][0] = ""; x[57][1] = "";
        x[58][0] = ""; x[58][1] = "";
        x[59][0] = ""; x[59][1] = "";
        x[60][0] = ""; x[60][1] = "";
        x[61][0] = ""; x[61][1] = "";
        x[62][0] = ""; x[62][1] = "";
        x[63][0] = ""; x[63][1] = "";
        x[64][0] = ""; x[64][1] = "";
        x[65][0] = ""; x[65][1] = "";
        x[66][0] = ""; x[66][1] = "";
        x[67][0] = ""; x[67][1] = "";
        x[68][0] = ""; x[68][1] = "";
        x[69][0] = ""; x[69][1] = "";
        String n;
        while(true){
            for(int i=0; i<length; i++){
                for(int j=0; j<2; j++){
                    System.out.print(x[z[i]][j]); 
                    n = user.nextLine();
                }
                System.out.println();
            }
        }
    }
}