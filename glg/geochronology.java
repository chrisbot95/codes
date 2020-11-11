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
        x[0][0] = "Bishop James Ussher"; x[0][1] = "(1581-1656) The world was created on October 23, 4004 BCE (Therefore the world is 6024 years old) calculated the ages of everyone who lived through the bible.";
        x[1][0] = "Nicholas Steno"; x[1][1] = "(1638-1686) collected things, nicholas recognized the shark teeth from a rock in the mountains, hypothesized the sharkteeth got trapped in the rock. and the earth is older than 6000 years, the processes would take super long";
        x[2][0] = "James Hutton"; x[2][1] = "(1726-1797) came up with the principle of Uniformitarianism 'the present is the key to the past' he noticed ripples in tilted sandstone and assumed they were like modern ripples and the tilt took a long ass time";
        x[3][0] = "William 'strata' Smith"; x[3][1] = "(1769-1839) First nationwide geological map (1815), made while digging canals and shit, he was mapping rocks and stratigraphy and shit. everything inbetween must exist, must be continuous between where he saw the two shits. various strata could always be found in the same relative positions. Each particular stratum could be identified by the fossils it contained.- 1815";
        x[4][0] = "Sir Charles Lyell"; x[4][1] = "(1797-1875) Developed all of the ideas into usable geological principles";
        x[5][0] = "relative dating: Steno's Principles"; x[5][1] = "Superposition, Original Horizontality, Lateral Continuity";
        x[6][0] = "Other Stratigraphic Principles"; x[6][1] = "Cross-cutting Relationships(Hutton), Principle of Inclusions, Principle of Fossil Succession(Smith)";
        x[7][0] = "Law of inclusions"; x[7][1] = "the inclusions (xenoliths, pebbles) are older then what they are embedded in";
        x[8][0] = "lithostratigraphy"; x[8][1] = "Rock stratigraphy";
        x[9][0] = "biostratigraphy"; x[9][1] = "plants or animals fossils";
        x[10][0] = "Nonconformity"; x[10][1] = "Two different rock types in contact";
        x[11][0] = "Angular Unconformity"; x[11][1] = "Sedimentary rocks at different angles in contact";
        x[12][0] = "Disconformity"; x[12][1] = "Missing time between two horizontal sedimentary rock units in contact";
        x[13][0] = "Index Fossils"; x[13][1] = "A fossil that identifies and dates the strata in which it is found. The best index fossils are ones that existed world wide for a narrow and distinct period of time.";
        x[14][0] = "principle of superposition"; x[14][1] = "the sedimentary rocks on the bottom must be the oldest";
        x[15][0] = "principle of original horizontality"; x[15][1] = "sedimentary rocks must be flatlined, if not > something happened";
        x[16][0] = "principle of lateral continuity"; x[16][1] = "flatlined sedimentary rocks in two different spots must be continous inbetween. once apon a time there was no canyon and the rocks once stretched across";
        x[17][0] = "principle of cross cutting relations"; x[17][1] = "if one rock cuts across another, that rock is younger";
        x[18][0] = "Maclurites"; x[18][1] = "is characteristic of a group of early gastropods that first appeared in the Late Cambrian and became extinct at the end of the Ordovician.";
        x[19][0] = "What are the types of decay?"; x[19][1] = "alpha(2 neutrons and 2 protons lost), beta(neutron loses an electron and becomes a proton), electron (beta) capture(a proton captures an electron and becomes a neutron)";
        x[20][0] = "what are the assumptions for Radiometric dating?"; x[20][1] = "Radioactive decay rate is known, initial p/d ratios are known, its a closed system, parent and daughter atoms are detectable";
        x[21][0] = "can you radiocarbon date dinasaurs?"; x[21][1] = "no bitch";
        x[22][0] = "carbon 14 becomes"; x[22][1] = "nitrogen 14";
        x[23][0] = "potassium 40 is"; x[23][1] = "a radioactive isotope and can be used to date granite since that has potassium shitz";
        x[24][0] = "the span of carbon14 dating is "; x[24][1] = "5,730 years";
        x[25][0] = "the span of potassium 40 dating is"; x[25][1] = "1.25 billion years";
        x[26][0] = "how is carbon 14 created? "; x[26][1] = "The energy from the sun bombards nitrogen 14, which creates carbon 14. the ratio of carbon 12,13,and 14 in the air should be consistent with whats in whatever you're trying to date(horsey or treey), once the thing dies the clock starts because carbon 14 starts to decay. we also cant date anything after 1950 because the us dropped bombs that flooded the atmosphere with carbon 14";
        x[27][0] = "what is the limit of radiocarbon dating"; x[27][1] = "40,000 years";
        x[28][0] = "dinasaur bones that we have in museums and shit I guess is made out of "; x[28][1] = "silica that replaced the carbon shits";
        x[29][0] = "carbon dating things at the bottom of bodies of water means that there is "; x[29][1] = "a delay in the gases reaching the things at the bottom of the water. they will date older, based on stuff like ocean circulation. can take hundreds of years.";
        x[30][0] = "each ring in a tree represents"; x[30][1] = "one year";
        x[31][0] = "dendrochronology"; x[31][1] = "using tree rings to date shit?";
        x[32][0] = "The amount of energy the sun gives off >"; x[32][1] = "changes over time";
        x[33][0] = "varve records"; x[33][1] = "layers in sedimentary rock that represent seasonal cycles (clay represents colder, silt represents warmer)";
        x[34][0] = "Fission -track dating"; x[34][1] = "radiometric dating technique, count imperfections in a crystal with a closed system. each scratch represents a half life apparently. counting through a microscope.";
        x[35][0] = "lichenometry"; x[35][1] = "lichens grow at a predictable rate, we can measure the diameter of the patch of lichens and make an assumption of how old the rocks are that the lichen are attached to";
        x[36][0] = "Ice cores"; x[36][1] = "ice in glaciers have annual layers";
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