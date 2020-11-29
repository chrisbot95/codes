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
        x[0][0] = "Ground Water:"; x[0][1] = "the water that lies beneath the ground surface, filling the pore space between grains in bodies of sediment and clastic sedimentary rock, and filling cracks and crevices in all types of rock";
        x[1][0] = "Ground water is a major economic resource,"; x[1][1] = "particularly in the dry western areas of the US and Canada";
        x[2][0] = "Source of ground water is rain and snow that falls to the ground"; x[2][1] = "a portion of which percolates down into the ground to become ground water";
        x[3][0] = "Most potable water is in the form of"; x[3][1] = "groundwater";
        x[4][0] = "Groundwater is water stored in"; x[4][1] = "pores and fractures in rocks";
        x[5][0] = "Greater than 50 times more fresh water is"; x[5][1] = "stored as groundwater than is on the Earth’s surface";
        x[6][0] = "Nearly 50% of all groundwater is within"; x[6][1] = "1000 meters of the Earth’s surface";
        x[7][0] = "The amount of groundwater that can exist in a body of rock is controlled by 2 factors:"; x[7][1] = "porosity: permeability:";
        x[8][0] = "porosity:"; x[8][1] = "the percentage of rock or sediment that consists of voids or openings";
        x[9][0] = "permeability:"; x[9][1] = "the capacity of a rock to transmit a fluid such as water or petroleum through pores and fractures (connectedness of pores)";
        x[10][0] = "saturated (phreatic) zone:"; x[10][1] = "the subsurface zone in which all rock openings are filled with water";
        x[11][0] = "water table:"; x[11][1] = "the upper surface of the zone of saturation";
        x[12][0] = "vadose zone:"; x[12][1] = "a subsurface zone in which rock openings are generally unsaturated and filled partly with air and partly with water; above the saturated (phreatic) zone";
        x[13][0] = "capillary fringe:"; x[13][1] = "a transition zone with highermoisture content at the base of the vadose zone just above the water table";
        x[14][0] = "well:"; x[14][1] = "a deep hole, generally cylindrical, that is dug of drilled into the ground to penetrate an aquifer within the saturated zone";
        x[15][0] = "recharge:"; x[15][1] = "the addition of new water to the saturated zone the water table in an unconfined aquifer rises in wet seasons and falls in dry seasons as water drains out of the saturated zone into rivers";
        x[16][0] = "perched water table:"; x[16][1] = "the top of a body of ground water separated from the main water table beneath it by a zone that is not saturated";
        x[17][0] = "most ground water moves"; x[17][1] = "relatively slowly through rock underground";
        x[18][0] = "because it moves in response to differences in water pressure and elevation, water within the upper part of the saturated zone tends to move"; x[18][1] = "downward following the slope of the water table";
        x[19][0] = "factors affecting the flow of ground water:"; x[19][1] = "the slope of the water table, permeability";
        x[20][0] = "the slope of the water table:"; x[20][1] = "the steeper the water table, the faster ground water moves";
        x[21][0] = "permeability"; x[21][1] = "if rock pores are small and poorly connected, water moves slowly; when openings are large and well connected, the flow of water is more rapid";
        x[22][0] = "Darcy’s Law"; x[22][1] = "Q=KA (dh/dl)";
        x[23][0] = "Q ="; x[23][1] = "Groundwater Discharge";
        x[24][0] = "A="; x[24][1] = "cross-sectional area of ground";
        x[25][0] = "K ="; x[25][1] = "Hydraulic Conductivity (function of both rock and water)";
        x[26][0] = "dh/dl ="; x[26][1] = "Hydraulic Gradient (slope of water table)";
        x[27][0] = "Aquifer:"; x[27][1] = "a body of saturated rock or sediment through which water can move easily";
        x[28][0] = "Good aquifers include"; x[28][1] = "Sandstone, Conglomerate, well-joined limestone, bodies of sand and gravel, fragmental or fractured volcanic rocks such as columnar basalt";
        x[29][0] = "Aquitard:"; x[29][1] = "when the porosity of a rock is 1% or less and therefore retards the flow of ground water";
        x[30][0] = "Aquaclude:"; x[30][1] = "when the porosity of a rock is 0% and therefore restricts the flow of ground water";
        x[31][0] = "unconfined aquifer:"; x[31][1] = "a partially filed aquifer exposed to the land surface and marked by a rising and falling water table";
        x[32][0] = "confined aquifer (artesian aquifer):"; x[32][1] = "an aquifer completely filled with pressurized water and separated from the land surface by a relatively impermeable confining bed, such as shale";
        x[33][0] = "cone of depression:"; x[33][1] = "a depression of the water table formed around a well when water is pumped out; it is shaped like an inverted cone";
        x[34][0] = "drawdown:"; x[34][1] = "the lowering of the water table near a pumped well";
        x[35][0] = "Saltwater Incursion:"; x[35][1] = "you might pull the saltwater thats beneath the fresh water into your bullshit, so be careful";
        x[36][0] = "artesian well:"; x[36][1] = "a well in which water rises above the aquifer";
        x[37][0] = "we can put a pump into the ground which will pump the water real quick and create a cone of depression, the ground water will go towards the pump due to the new slope."; x[37][1] = "";
        x[38][0] = "stratified"; x[38][1] = "formed or arranged into strata or layers";
        x[39][0] = "spring:"; x[39][1] = "a place where water flows naturally from rock onto the land surface";
        x[40][0] = "Some springs discharge where the water table intersects the land surface, but they also occur where water flows out from"; x[40][1] = "caverns or along fractures, faults, or rock contacts (sandstone on top of shale) that come to the surface";
        x[41][0] = "gaining stream:"; x[41][1] = "a stream that receives water from the zone of saturation";
        x[42][0] = "losing stream:"; x[42][1] = "a stream that looses water to the zone of saturation";
        x[43][0] = "pumping wells can cause or aggravate"; x[43][1] = "ground-water pollution";
        x[44][0] = "Heavy use of ground water can result in:"; x[44][1] = "a regional water table dropping, deepening of a well which means more electricity is needed to pump the water to the surface, the ground surface settling because the water no longer supports the rock and sediment";
        x[45][0] = "on a map, a stream with dotted lines is an"; x[45][1] = "intermitent stream, it dries up sometimes based on the water table.";
        x[46][0] = "having an outhouse next to your drinking well resulted in"; x[46][1] = "a bunch of kids getting colera";
        x[47][0] = "for landfills we have to build our own aquaclude, plastic, clay, that will pool with the shitty water and then they have to pump the water out"; x[47][1] = "";
        x[48][0] = "gas station and oil tank shit"; x[48][1] = "";
        x[49][0] = "subsidence"; x[49][1] = "pulling ground water out of the ground might make it weaker and it can collapse or sink. which can pull the ground beneath sea level, can cause transgression of sea level. some of the coastal communities have to deal with this bullshite";
        x[50][0] = "rain water is naturally acidic"; x[50][1] = "";
        x[51][0] = "when you mix water and co2, you get carbonic acid, which is in rain"; x[51][1] = "";
        x[52][0] = "if the rain water hits a limestone or dolostone"; x[52][1] = "they will dissolve. it will pull the magnesium and calcium ions out of the limestone and dolostone and carry them away. wrock willl dissentigrate and start making caves. caves are associated with limestone and dolostone.";
        x[53][0] = "karst topography:"; x[53][1] = "an area with many sinkholes and with cave systems beneath the land surface";
        x[54][0] = "dissapearing stream"; x[54][1] = "a stream that enters a cave";
        x[55][0] = "deranged drainage"; x[55][1] = "";
        x[56][0] = "sink holes usually line up along"; x[56][1] = "fractures";
        x[57][0] = "caves and sink holes"; x[57][1] = "line up";
        x[58][0] = "soda straws form from"; x[58][1] = "calcite dipping down through cracks in the limestone ceiling";
        x[59][0] = "stalactite"; x[59][1] = "hold on tite(calcium carbonate)";
        x[60][0] = "stalagmite"; x[60][1] = "stalagmite mite poke you in the ass(calcium carbonate)";
        x[61][0] = "hot springs:"; x[61][1] = "springs in which the water is warmer than human body temperature water can gain heat in two ways while underground:";
        x[62][0] = "ground water may circulate near a"; x[62][1] = "magma chamber or a body of cooling igneous rock";
        x[63][0] = "ground water may circulate"; x[63][1] = "unusually deep in the earth";
        x[64][0] = "geyser:"; x[64][1] = "a type of hot spring that periodically erupts hot water and steam; the water is generally near boiling (100oC) pressure builds up behind the bubbles, and as the pressure releases, the water vaporizes";
        x[65][0] = "Electricity can be generated by"; x[65][1] = "harnessing naturally occurring stream and hot water in areas that are exceptionally hot underground (geothermal areas);";
        x[66][0] = "nonelectric uses of geothermal energy include"; x[66][1] = "space heating, as well as paper manufacturing, ore processing, and food preparation";
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