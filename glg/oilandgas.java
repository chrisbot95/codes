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
        x[0][0] = "Marcellus Shale"; x[0][1] = "84.2 TRILLION cubic feet of gas (undiscovered, technically recoverable; USGS 2011…some sources now say far more than that) In 2010 the average price (US-EIA) per 1,000 cubic feet of gas was $12.07… NY uses 1.1 trillion cubic feet of natural gas each year";
        x[1][0] = "Here’s what you need to have an economic petroleum resource:"; x[1][1] = "A rock that originally had some percentage of organic material in it. (Marine sedimentary rock that had a lot of algae.) That rock must have gone through a critical degree of heat and pressure at some point to “cook” the organics into mature petroleum.";
        x[2][0] = "“Thermogenic Window”."; x[2][1] = "That rock must have gone through a critical degree of heat and pressure at some point to “cook” the organics into mature petroleum. You get the temperature just right you can make “crude oil”. Keep cooking it you can make “natural gas”. Cook it too much and you could lose it all.";
        x[3][0] = "The petroleum needs to be in a permeable rock so you can drill down and get it out, but because it is less dense than any water in the rock it will rise towards the surface. It needs to be trapped by some impermeable boundary in the rock so makes a big pool."; x[3][1] = "";
        x[4][0] = "The petroleum originates in the"; x[4][1] = "“source rock” It then migrates through the “reservoir rock” (like an aquifer for oil or gas).";
        x[5][0] = "It is trapped there by some kind of impermeable"; x[5][1] = "“cap rock”.";
        x[6][0] = "You drill a well through the cap rock and pump out the petroleum."; x[6][1] = "";
        x[7][0] = "hydrologic fracturing"; x[7][1] = "If you can artificially fracture the shale you create permeability and the gas can flow! It now becomes an economic resource.";
        x[8][0] = "(Marcellus Shale is"; x[8][1] = "Devonian)";
        x[9][0] = "Utica Shale…"; x[9][1] = "Of Ordovician origin 38.1 trillion cubic feet of gas (undiscovered, technically recoverable; USGS 2012)";
        x[10][0] = ""; x[10][1] = "";
        x[11][0] = ""; x[11][1] = "";
        x[12][0] = ""; x[12][1] = "";
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