import java.util.Random;
import java.util.Scanner;
class soils{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[70][2];
        int length=6;
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
        x[0][0] = "spodosols"; x[0][1] = "strong eluviation in a and e horizons; organics, caliche in b or c hor(slightly organic b horizon) Spodosols often occur under coniferous forest in cool, moist climates.";
        x[1][0] = "aridosols"; x[1][1] = "thin a and b horizons with little organics, caliche(calcite crystals)(calcium carbonite) in b or c hor(develops in very dry places with a lot of evaporation)airy for dry in arid. arid regions";
        x[2][0] = "histosols"; x[2][1] = "wet, organic-rich soils, thick o and a horizons(forms in a wet land)";
        x[3][0] = "oxisols"; x[3][1] = "highly weathered, red b horizon from oxidized fe(Iron in the soil) found primarily in the intertropical regions of the world. South America and Africa, almost always on highly stable continental cratons.";
        x[4][0] = "ultisols"; x[4][1] = "highly weathered b horizon enriched in clay and al-oxides.(weathered away all the irons, left with the minerals that are the hardest to weather, quartz, aluminum oxides) tropics, lots of time and water. found primarily in humid temperate and tropical areas of the world, typically on older, stable landscapes. are strongly leached, acid forest soils with relatively low native fertility.";
        x[5][0] = "vertisols"; x[5][1] = "high clay content; shrinks and swells w soil moisture variations(minerals shrink or swell with water absorbsion) Vertisols are most commonly formed in warm, subhumid or semi-arid climates, where the natural vegetation is predominantly grass, savanna, open forest, or desert shrub. Large areas of Vertisols are found in Northeastern Africa, India, and Australia , with smaller areas scattered worldwide.";
        x[6][0] = ""; x[6][1] = "";
        x[7][0] = ""; x[7][1] = "";
        x[8][0] = ""; x[8][1] = "";
        x[9][0] = ""; x[9][1] = "";
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
                System.out.print(i+". ");
                for(int j=0; j<2; j++){
                    System.out.print(x[z[i]][j]); 
                    n = user.nextLine();
                }
                System.out.println();
            }
        }
    }
}