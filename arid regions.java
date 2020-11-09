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
        x[0][0] = "arid indicates"; x[0][1] = "the absence of water";
        x[1][0] = "weathering is impeded by"; x[1][1] = "the lack of water";
        x[2][0] = "physical processes"; x[2][1] = "dominate";
        x[3][0] = "in an arid environment, what is the primary agent of physical change?"; x[3][1] = "wind";
        x[4][0] = "rocks are literally sand blasted by"; x[4][1] = "sand grains carried by the wind";
        x[5][0] = "what kind of weathering is prominent in arid environments?"; x[5][1] = "physical, not chemical";
        x[6][0] = "semi-arid = "; x[6][1] = "still has green plants, the soil looks pretty dry tho";
        x[7][0] = "arid = "; x[7][1] = "plants are still there and living but are a very dark color and conserve water";
        x[8][0] = "hyper arid = "; x[8][1] = "desert with no plants";
        x[9][0] = "cactus's are designed > "; x[9][1] = "to conserve water, and the needles dont let water evaporate to easily";
        x[10][0] = "saltation = "; x[10][1] = "when particals bounce along being carried by a river or air";
        x[11][0] = "suspension = "; x[11][1] = "when particals are being carried off the ground due to a stream of water or air";
        x[12][0] = "quartz grains fracture > "; x[12][1] = "conchoidally when hit";
        x[13][0] = "faceting = "; x[13][1] = "repeated collisions of grains on a surface cause this apparently, a smoothed surface";
        x[14][0] = "rocks with faceted surfaces are called "; x[14][1] = "ventifacts, artifacts of the wind";
        x[15][0] = "arid environments have a lot of quartz because"; x[15][1] = "quartz is resistant to weathering";
        x[16][0] = "quartz reacts to "; x[16][1] = "strong bases, high ph";
        x[17][0] = "quartz grains in arid environments often have a ____ apperance due to grain to grain collisions and etching by strong bases"; x[17][1] = "frosted";
        x[18][0] = "desert varnish ="; x[18][1] = "forms by leaching of soluable cations with iron and manganese being left behind to form a distinctive dark coating";
        x[19][0] = "hydrologic cycle"; x[19][1] = "involves the continuous circulation of water in the Earth-Atmosphere system. At its core, the water cycle is the motion of the water from the ground to the atmosphere and back again.";
        x[20][0] = "low pressure system has lots of"; x[20][1] = "clouds and rain";
        x[21][0] = "as the air rises up, it has less pressure and expands, as expands it cools, as it cools you can change the dewpoint in the air and creates water vapor and creates rain"; x[21][1] = "";
        x[22][0] = "as air gets pushed towards the ground, pressure increases, molecules condense and the air warms up and becomes dry, air will take up any excess moisture it finds in the ground"; x[22][1] = "";
        x[23][0] = "over the equator there is a "; x[23][1] = "permanent low pressure system";
        x[24][0] = "where the convection currents meet and push air down we have our"; x[24][1] = "high pressure systems in areas like the sahara desert and tropics, tropic of capricorn and tropic of cancer";
        x[25][0] = "how to make good thick soil"; x[25][1] = "lots of precipitation and water causes lots of weathering over a long period of time";
        x[26][0] = "over the equator we have very thick soils"; x[26][1] = "";
        x[27][0] = "over the tropics we dont have thick soils"; x[27][1] = "";
        x[28][0] = "the 45 degree soils arent as easily developed because glaciers scrape all the soil away back to bedrock, 10-20,000 years to make soil compared to millions of years"; x[28][1] = "";
        x[29][0] = "coastal deserts"; x[29][1] = "associated with cold ocean currents lowering the ability for air to hold moisture, cool dry air blows onto land and causes evaporation";
        x[30][0] = "rain shadow effect"; x[30][1] = "mountains force air to go upwards and cool causing precipitation. dry air on the lee facing side = no rain. other side of the mountain will be dry";
        x[31][0] = "when the air gets to the gobi desert it"; x[31][1] = "didnt get any more chances to pick up any water";
        x[32][0] = "high pressure systems over poles"; x[32][1] = "";
        x[33][0] = "arroyos"; x[33][1] = "dry river valleys";
        x[34][0] = "playa"; x[34][1] = "lake during the wet season, dry for most of the year";
        x[35][0] = "alluvial fan"; x[35][1] = "";
        x[36][0] = "pediment"; x[36][1] = "big apron of soil around the edge of the mountains made by alluvial fans";
        x[37][0] = "inselberg"; x[37][1] = "island of bedrock";
        x[38][0] = "playa lakes have layers of"; x[38][1] = "salt and clay. salt from evaporation of water leaving behind minerals.";
        x[39][0] = "racetrack bed mystery"; x[39][1] = "";
        x[40][0] = "deflation"; x[40][1] = "wind blows away a pile of sand";
        x[41][0] = "desert pavement"; x[41][1] = "layer of pebbles left behind after deflation";
        x[42][0] = "abrasion"; x[42][1] = "sand blasting";
        x[43][0] = "ventifacts"; x[43][1] = "wind shaped stones with sharp edge faces";
        x[44][0] = "yardangs"; x[44][1] = "streamlined desert ridges";
        x[45][0] = "wind swept sand dunes can cause plants to form from the water in the bedrock"; x[45][1] = "";
        x[46][0] = "sandstorms"; x[46][1] = "suspension of sand particles, sand blasting";
        x[47][0] = "desert pavements are caused by"; x[47][1] = "wind blowing away the finer particles, so all the larger particles are left behind. the larger particles then protect the sand underneath from getting blown away";
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