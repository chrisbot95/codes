import java.util.Random;
import java.util.Scanner;
class landslides{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[40][2];
        int length=36;
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
        x[0][0] = "Mass wasting"; x[0][1] = "all processes by which masses of rock and soil move downslope";
        x[1][0] = "Mass movement"; x[1][1] = "force of gravity pulls weaker material downslope";
        x[2][0] = "downslope movements are related to"; x[2][1] = "gravitational forces and material strength";
        x[3][0] = "fall:"; x[3][1] = "singular or multiple blocks of rock plunge from a height";
        x[4][0] = "slide:"; x[4][1] = "mass movement that occurs as one unit";
        x[5][0] = "flow:"; x[5][1] = "mass movement that is internally chaotic and turbulent. disorganized slide?";
        x[6][0] = "lahar:"; x[6][1] = "mudflow or debris flow consisting mainly of volcanic material";
        x[7][0] = "Three factors of slope and material breakage"; x[7][1] = "nature of slope materials(angle of repose), amount of water, steepness and stability";
        x[8][0] = "unconsolidated material:"; x[8][1] = "loose sand or sandy silt";
        x[9][0] = "consolidated material:"; x[9][1] = "rock, jointed and deformed, rock, massive";
        x[10][0] = "compacted materials"; x[10][1] = "steam rolled sediments";
        x[11][0] = "angle of repose of fine dry sand"; x[11][1] = "35 degrees";
        x[12][0] = "angle of repose of coarse dry sand"; x[12][1] = "40 degrees";
        x[13][0] = "angular pebbles angle of repose"; x[13][1] = "45 degrees";
        x[14][0] = "higher angle mountains are made of "; x[14][1] = "stronger rocks that are harder to weather";
        x[15][0] = "talus slope"; x[15][1] = "boulders cobbles whatever else eroded off cliff and collected at bottom";
        x[16][0] = "poor water pressure"; x[16][1] = "saturation of water pushing out on sand";
        x[17][0] = "liquifaction"; x[17][1] = "temporary transformation of solid material to a fluid state cuased by the pressure of water in the pores of the material";
        x[18][0] = "triggers of mass movements:"; x[18][1] = "earthquake vibrations, rainfall and water infiltration, vegetation loss(trees on a slope dying), overloading(stepping on quicksand)";
        x[19][0] = "the alaska landslide was caused by:"; x[19][1] = "a water saturated sandy layer between to clay layers that liquifactioned during an earthquake";
        x[20][0] = "Rockfall:"; x[20][1] = "rocks fall quickly like that trail shit";
        x[21][0] = "Rockslide"; x[21][1] = "rocks slide slowly moderate velocity along a plane of weakness";
        x[22][0] = "rock avalanche"; x[22][1] = "rock flows, air hockey pucks";
        x[23][0] = "debris avalanche"; x[23][1] = "sand, gravel, soil mixed with air";
        x[24][0] = "debris slide"; x[24][1] = "debris sliding";
        x[25][0] = "debris flow/mudflows"; x[25][1] = "boulders knock down trees. flow has cushion of water aparently, I guess hes just referring to the mud part";
        x[26][0] = "earth flow"; x[26][1] = "viscous flow, slowest flow so far, like debris and mud, has water";
        x[27][0] = "creep"; x[27][1] = "soil moves very slowly down hill, need timelapse photography";
        x[28][0] = "freeze thaw steps"; x[28][1] = "the soil freezes and thaws and it moves down slope, bending things towards the falling direction";
        x[29][0] = "how are lahars set up"; x[29][1] = "water from the snowy tops of volcanoes melt during an eruption and mix in with the volcanic ash and flow downhill";
        x[30][0] = "slump:"; x[30][1] = "slide of cohesive unconsolidated material, silt, clay. has a domino effect. blocks of electrostatically cohesioned material go downhill one at a time";
        x[31][0] = "electrostatic cohesion"; x[31][1] = "fine particles like clay or silt stick together with static electricity";
        x[32][0] = "clump:"; x[32][1] = "a clump of trees or soil sticking together sliding down during a debris slide";
        x[33][0] = "retaining wall and draining pipes"; x[33][1] = "meant for keeping up slopes of doil/ground";
        x[34][0] = "mudflow barriers"; x[34][1] = "net for catching mudflows, water separates from the solids";
        x[35][0] = "trench/debris basins"; x[35][1] = "catches the rocks in a basin bullshit";
        x[36][0] = ""; x[36][1] = "";
        x[37][0] = ""; x[37][1] = "";
        x[38][0] = ""; x[38][1] = "";
        x[39][0] = ""; x[39][1] = "";

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