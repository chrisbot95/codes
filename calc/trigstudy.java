import java.util.Random;
import java.util.Scanner;
class trigstudy{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[40][2];
        x[0][0] = "a² - x²"; x[0][1] = "sin form";
        x[1][0] = "a² + x²"; x[1][1] = "tangent form";
        x[2][0] = "x² - a²"; x[2][1] = "secant form";
        x[3][0] = "tan² = "; x[3][1] = "sec² - 1";
        x[4][0] = "derivative of sec(x)"; x[4][1] = "sec(x)tan(x)";
        x[5][0] = "integral of csc(x)"; x[5][1] = "-ln(|csc(x)+cot(x)|)";
        x[6][0] = "derivative of tan(x)"; x[6][1] = "sec²(x)";
        x[7][0] = "integral of sec²(x)"; x[7][1] = "tan(x)";
        x[8][0] = "integral of sec(x)"; x[8][1] = "ln(|sec(x)+tan(x)|)";
        x[9][0] = "integral of tan(x)"; x[9][1] = "-ln(|cos(x)|)";
        x[10][0] = "integral of 1/(x²+1)"; x[10][1] = "arctan(x)";
        x[11][0] = "rationalizing substitution"; x[11][1] = "when we have e^x, we set u to e^x, eventually we will have to deal with a ln(stuff)";
        x[12][0] = "cot²(x) = "; x[12][1] = "csc²(x) - 1";
        x[13][0] = "derivative of csc(x)"; x[13][1] = "-cot(x)csc(x)";
        x[14][0] = "improper integrals, they:"; x[14][1] = "converge if the value is finite, diverge if the value is infinite; involve infinity";
        x[15][0] = "infinite discontinuity"; x[15][1] = "when either or both of the one sided limits go towards infinity. (ex. divide by 0)";
        x[16][0] = "infinite interval"; x[16][1] = "when the interval of an integral is infinite";
        x[17][0] = ""; x[17][1] = "";
        x[18][0] = ""; x[18][1] = "";
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
        int r;
        while(true){
            r = rand.nextInt(3);
            for(int i=0; i<2; i++){
                System.out.print(x[r][i]); 
                n = user.nextLine();
            }
            System.out.println();
        }
    }
}