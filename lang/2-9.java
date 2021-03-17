import java.util.Random;
import java.util.Scanner;
class blankstudy{
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
        x[0][0] = "non contracting grammar"; x[0][1] = "right side of each production is at least as long as left side";
        x[1][0] = "contracting grammar"; x[1][1] = "left side has more characters than the right side";
        x[2][0] = "essentially non-contracting grammar"; x[2][1] = "Start symbol can only go to lambda in the first step/derivation";
        x[3][0] = "any context free grammar can be converted to an"; x[3][1] = "essentially non-contracting grammar";
        x[4][0] = "ok so the tree shit lets go, he has a tree here that looks wack"; x[4][1] = "";
        x[5][0] = "in a context free grammar, the left hand side of a production can only be a sinlge"; x[5][1] = "nonterminal";
        x[6][0] = "context sensitive, the left hand side of a production can be anything as long as"; x[6][1] = "its not null";
        x[7][0] = "in a context sensitive grammar, it has to be"; x[7][1] = "non contracting";
        x[8][0] = "Context-sensitive grammar"; x[8][1] = "Any essentially non-contracting grammar. Context-sensitive productions are allowed as long as they are non-contracting";
        x[9][0] = "Context sensitive productions"; x[9][1] = "you can use the production only if that s is preceding the b, so it depends on the context I guess.......";
        x[10][0] = "context free productions"; x[10][1] = "theres no terminals on either side of the nonterminal on the left side of the production";
        x[11][0] = "unrestricted grammar"; x[11][1] = "No restriction on productions except the left side must be non-null. can define a language with an ";
        x[12][0] = "parse"; x[12][1] = "determin its derivation or construct a parse tree";
        x[13][0] = ""; x[13][1] = "";
        x[14][0] = ""; x[14][1] = "";
        x[15][0] = ""; x[15][1] = "";
        x[16][0] = ""; x[16][1] = "";
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