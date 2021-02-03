import java.util.Random;
import java.util.Scanner;
class minecraft{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[70][2];
        int length=24;
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
        x[0][0] = "Piston"; x[0][1] = "3 wood planks, 4 cobblestone, 1 iron ingot, 1 redstone";
        x[1][0] = "tripwire hook"; x[1][1] = "iron ingot, stick, wood plank";
        x[2][0] = "crossbow"; x[2][1] = "3 sticks, 2 strings, tripwire hook, iron ingot";
        x[3][0] = "armor stand"; x[3][1] = "smooth stone slab, 6 sticks";
        x[4][0] = "bookshelf"; x[4][1] = "6 wood planks, 3 books";
        x[5][0] = "book"; x[5][1] = "3 paper, leather";
        x[6][0] = "paper"; x[6][1] = "3 sugarcane";
        x[7][0] = "barrel"; x[7][1] = "6 wood planks, 2 wood slabs";
        x[8][0] = "composter"; x[8][1] = "7 wood slabs";
        x[9][0] = "dandelion"; x[9][1] = "small yellow flower,";
        x[10][0] = "poppy"; x[10][1] = "small red flower, makes red dye";
        x[11][0] = "blue orchid"; x[11][1] = "bunch of light blue flowers, makes light blue dye";
        x[12][0] = "allium"; x[12][1] = "round purplish flower, makes magenta dye";
        x[13][0] = "azure bluet"; x[13][1] = "bunch of white flowers, makes light gray dye";
        x[14][0] = "red tulip"; x[14][1] = "a red tulip, makes red dye";
        x[15][0] = "orange tulip"; x[15][1] = "an orange tulip, makes orange dye";
        x[16][0] = "white tulip"; x[16][1] = "makes light gray dye";
        x[17][0] = "pink tulip"; x[17][1] = "";
        x[18][0] = "oxeye daisy"; x[18][1] = "round white flower with yellow middle, makes light gray dye";
        x[19][0] = "corn flower"; x[19][1] = "blue horizontal flower, makes blue dye";
        x[20][0] = "lily of the valley"; x[20][1] = "";
        x[21][0] = "sunflower"; x[21][1] = "";
        x[22][0] = "lilac"; x[22][1] = "";
        x[23][0] = "rose bush"; x[23][1] = "";
        x[24][0] = "peony"; x[24][1] = "";
        x[25][0] = "composter"; x[25][1] = "";
        x[26][0] = "barrel"; x[26][1] = "";
        x[27][0] = "iron hoe"; x[27][1] = "";
        x[28][0] = "iron axe"; x[28][1] = "";
        x[29][0] = "bow"; x[29][1] = "";
        x[30][0] = "clay pot"; x[30][1] = "";
        x[31][0] = "mutton"; x[31][1] = "";
        x[32][0] = "flint"; x[32][1] = "";
        x[33][0] = "ender pearl"; x[33][1] = "";
        x[34][0] = "steak"; x[34][1] = "";
        x[35][0] = "vines"; x[35][1] = "";
        x[36][0] = "fletching table"; x[36][1] = "";
        x[37][0] = "cookie"; x[37][1] = "";
        x[38][0] = "kelp"; x[38][1] = "";
        x[39][0] = "magenta dye"; x[39][1] = "";
        x[40][0] = "leather cap"; x[40][1] = "";
        x[41][0] = "glass bottle"; x[41][1] = "";
        x[42][0] = "inc sac"; x[42][1] = "";
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