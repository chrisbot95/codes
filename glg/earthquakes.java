import java.util.Random;
import java.util.Scanner;
class earthquakes{
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
        x[0][0] = "Earthquake"; x[0][1] = "Vibration of the Earth produced by the rapid release of energy";
        x[1][0] = "Seismic waves"; x[1][1] = "Energy moving outward from the focus of an earthquake ";
        x[2][0] = "Focus="; x[2][1] = "location of initial slip on the fault; where the earthquake origins";
        x[3][0] = "Epicenter="; x[3][1] = "spot on Earth’s surface directly above the focus";
        x[4][0] = "Where do earthquakes occur:"; x[4][1] = "Most earthquakes occur along the edge of the oceanic and continental plates. Along faults: normal, reverse, transform";
        x[5][0] = "Earthquake Belts"; x[5][1] = "95% of energy released by earthquakes originates in narrow zones that wind around the Earth. These zones mark of edges of tectonic plates";
        x[6][0] = "Causes I"; x[6][1] = "Faults. Elastic Rebound - stretch a rubber band it snaps back; but bend a ruler enough > breaks)";
        x[7][0] = "Tectonic forces cause"; x[7][1] = "bending of rocks, storage of elastic energy";
        x[8][0] = "Accumulated forces overcome frictional"; x[8][1] = "resistance on either side of fault";
        x[9][0] = "Sudden slip, causes movement along"; x[9][1] = "fault, and rock breaks";
        x[10][0] = "Vibrations (earthquake) occur as"; x[10][1] = "rock springs back to original position";
        x[11][0] = "The change in stress that follows a mainshock creates smaller earthquakes called"; x[11][1] = "aftershocks";
        x[12][0] = "The aftershocks “illuminate”"; x[12][1] = "the fault that ruptured in the mainshock";
        x[13][0] = "Causes II"; x[13][1] = "Magma - movement of magma toward the surface. Human factors - pumping fluid underground.";
        x[14][0] = "Focus"; x[14][1] = "place underground where earthquake originates (hypocenter)";
        x[15][0] = "Epicenter"; x[15][1] = "Spot on the surface immediately above the focus";
        x[16][0] = "Scarp"; x[16][1] = "surface break (rupture) of fault that earthquake occurred on";
        x[17][0] = "Surface waves (L-waves)"; x[17][1] = " Travel near the Earth's surface. Cause the most damage. High amplitude and low velocity. Longest periods (interval between crests). Termed long, or L waves";
        x[18][0] = "Rayleigh Wave"; x[18][1] = "up and down motion";
        x[19][0] = "love wave"; x[19][1] = "side to side";
        x[20][0] = "Body waves"; x[20][1] = "Travel through Earth’s interior. Two types based on mode of travel. P waves( push pull motion, travel through solids liquids and gases). S waves moves at right angles to their direction of travel, only through solids";
        x[21][0] = "Velocity increases with"; x[21][1] = "rock density";
        x[22][0] = "Velocity changes when"; x[22][1] = "passing from one material to another (increases/decreases)";
        x[23][0] = "Liquids:"; x[23][1] = "S-waves do not get transmitted through liquid; P-waves slow down";
        x[24][0] = "Seismometers"; x[24][1] = "instruments that record seismic waves. Records the movement of Earth in relation to a stationary mass on a rotating drum or magnetic tape";
        x[25][0] = "Three seismographs needed to locate"; x[25][1] = "an epicenter";
        x[26][0] = "Each station determines the time interval between the arrival of"; x[26][1] = "the first P wave and the first S wave at their location";
        x[27][0] = "A travel-time graph then determines each station’s"; x[27][1] = "distance to the epicenter";
        x[28][0] = "A circle with radius equal to distance to"; x[28][1] = "the epicenter is drawn around each station";
        x[29][0] = "The point where all three circles intersect is the"; x[29][1] = "earthquake epicenter";
        x[30][0] = "Two measurements describe the size of an earthquake"; x[30][1] = "Intensity – a measure of earthquake shaking at a given location based on amount of damage. Magnitude – estimates the amount of energy released by the earthquake";
        x[31][0] = "Mercalli Intensity Scale"; x[31][1] = "based on damage done by an earthquake in a particular location. Subjective, because damage done can depend on a lot of things besides earthquake size, such as distance from the earthquake, poor construction and the kind of rock in the area hit by the earthquake.";
        x[32][0] = "Richter Scale:"; x[32][1] = "Based on measuring the amplitude (size) of the largest wave recorded on the seismogram. Scale ranges from M 0 to M 9 and is logarithmic (increase of 1 on the scale means amplitude of ground motion is 10X greater)";
        x[33][0] = "P-waves travel faster through"; x[33][1] = "dense rock,";
        x[34][0] = "S-waves don't travel through"; x[34][1] = "liquid";
        x[35][0] = "Some P and S travel times cannot be explained by"; x[35][1] = "distance from the earthquake alone";
        x[36][0] = "P Wave Velocities"; x[36][1] = "Upper Mantle Fast. Asthenosphere Slow. Lower Mantle Fast";
        x[37][0] = "The S-Wave Shadow Zone"; x[37][1] = "since s waves cant travel through the liquid outer core, they cant be detected on the other side of the outer core";
        x[38][0] = "P wave shadow zone"; x[38][1] = "since the p waves get bent, they can be detected on the other side of the earth through the outer core but only in a certain circular area directly across from the epicenter";
        x[39][0] = "Earthquakes originate at depths ranging"; x[39][1] = "from 5 to , rarely, nearly 700 kilometers";
        x[40][0] = "Earthquake damage"; x[40][1] = "Ground Failure. Fires. Landslides. Liquefaction. Tsunami";
        x[41][0] = "1970 Peru disaster"; x[41][1] = "Buried the towns of Yungay and Ranrahirca, The death toll in both villages was 20,000.";
        x[42][0] = "Tsunamis, or seismic sea waves"; x[42][1] = "Result from “push” of underwater fault or undersea landslide. In open ocean height is > 1 meter. In shallow coast water wave can be > 30 meters";
        x[43][0] = "Long-term methods"; x[43][1] = " seismic hazard maps. probability analysis based on:historical EQ records geologic EQ records slip-rate on active faults frequency and magnitude of recent EQ's";
        x[44][0] = "Long Term Predictions"; x[44][1] = "Strain Energy - accumulates uniformly release irregularly Some locked by friction “Seismic gaps”> Prime candidates for major earthquake. ";
        x[45][0] = "Short-term predictions"; x[45][1] = "Foreshocks: usually increase in magnitude. Ground deformation. Fluctuations in water well levels. Changes in local radio wave characteristics. Anomalous animal behavior???";
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