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
        x[0][0] = "what are the eras inside the phanerozoic eon?"; x[0][1] = "Cenozoic, Mesozoic, and Paleozoic";
        x[1][0] = "what are the periods inside the cenozoic era?"; x[1][1] = "tertiary, quaternary";
        x[2][0] = "what are the periods inside the mesozoic era?"; x[2][1] = "triassic, jurassic, cretaceous";
        x[3][0] = "what are the periods inside the paleozoic era?"; x[3][1] = "cambrian, ordovician, silurian, devonian, mississippian, pennsylvanian, permian";
        x[4][0] = "The hadean began when?"; x[4][1] = "4600 my ago";
        x[5][0] = "The archean began when?"; x[5][1] = "3800 my ago";
        x[6][0] = "the proterozoic began when?"; x[6][1] = "2500 my ago";
        x[7][0] = "the paleozoic began when?"; x[7][1] = "544 my ago";
        x[8][0] = "when do the oldest known rocks date back to?"; x[8][1] = "The beginning of the archaean, 3800 my ago";
        x[9][0] = "when do the oldest known fossils date back to?"; x[9][1] = "the beginning of the archaean, 3800 my ago";
        x[10][0] = "when did the atmosphere start to have more oxygen?"; x[10][1] = "towards the beginning/first half of the paleoproterozoic";
        x[11][0] = "what is the precrambrian?"; x[11][1] = "it is the collection of eons before the phanerozoic eon that contains the paleozoic mesozoic and cenozoic. it contains the hadean, the archean, and the proterozoic.";
        x[12][0] = "the proterozoic can be broken up into"; x[12][1] = "the paleoproterozoic(transition to oxygen atmosphere, and approximate origin of eukaryotes. The mesoproterozoic, and finally the neoproterozoic(oldest animal fossils)";
        x[13][0] = "when do the oldest known animal fossils date back to?"; x[13][1] = "the neoproterozoic which began 900 my ago and ended 540 my ago";
        x[14][0] = "the hadean was "; x[14][1] = "lots of magma and fire seas and shit";
        x[15][0] = "archean notes >"; x[15][1] = "first igneous rocks, water vapor, starting to have liquid water. eventually have sedimentary. first fossils from primitive life forms";
        x[16][0] = "archean notes 2 >"; x[16][1] = "early life forms called stromatolites made of algae build layer after layer of algae. fossils found in earliest fossil record.";
        x[17][0] = "3 billion years ago had"; x[17][1] = "barely any oxygen in the air";
        x[18][0] = "2.5 b years started having "; x[18][1] = "higher oxygen concentration and that kept going into the precambrian";
        x[19][0] = "BIF banded iron formation"; x[19][1] = "forms in sedimentary rocks in the ocean. its alternating layers of red silicate minerals and grey iron minerals. there were dissolved iron and silica ions in the ocean. primitive life forms converted co2 to o2 which gets dissolved into the ocean waters that are cold. dissolved iron in ocean water + O2 = the iron will precipitate out as a sediment. there is more or less oxygen in the water depending on how cold it is.";
        x[20][0] = "during the proterozoic, where was most of the continental land mass?"; x[20][1] = "in the southern hemisphere";
        x[21][0] = "what are ediacaran fauna?"; x[21][1] = "animals from the latest precambrian that look like leaves and shit ";
        x[22][0] = "zones of precambrian rocks we call them"; x[22][1] = "shield rocks";
        x[23][0] = "how was the canadian shield formed"; x[23][1] = "over a couple billion years, the canadian shield became formed from a bunch of precambrian seperate continents that became jammed together from very early plate tectonic processes";
        x[24][0] = "rodinia"; x[24][1] = "supercontinent made from the collision of ur, arctica, baltica, atlantica. The supercontinent before pangaea. broke apart into e and w gondwanda and laurasia";
        x[25][0] = "Regression:"; x[25][1] = "shoreline moves down on land. (Shallowing)";
        x[26][0] = "Transgression:"; x[26][1] = "shoreline moves up on land. (Deepening)";
        x[27][0] = "Sea level cycles:"; x[27][1] = "Related to glacial cycles (climate). Or Mountain building cycles (tectonic).";
        x[28][0] = "Orogeny:"; x[28][1] = "The processes of forming mountains. Usually through tectonic collisions.";
        x[29][0] = "carboniferous period refers to "; x[29][1] = "the mississippian and pennsilvanian periods";
        x[30][0] = "global/ustatic sea level change"; x[30][1] = "when the ice melts or freezes due to the climate and the sea levels change";
        x[31][0] = "orogeny"; x[31][1] = "process of forming mountains usually though tectonic collisions.";
        x[32][0] = "during the ordovician"; x[32][1] = "it is a cold period, sea level goes down. exapnsion of shallow seas";
        x[33][0] = "taconic orogeny"; x[33][1] = "an island formed from the volcanos at the subduction zone gets smashed into america I guess of the east coast";
        x[34][0] = "trilobites are at the"; x[34][1] = "ordovician";
        x[35][0] = "at the end of the ordovician there is a"; x[35][1] = "57% mass extinction";
        x[36][0] = "during the silurian"; x[36][1] = "the canadian shield is coming up and shit";
        x[37][0] = "during the devonian, ____ smashes into the east side of north america, causing the _____ orogeny"; x[37][1] = "avalonia. Acadian orogeny";
        x[38][0] = "in the sea during the devonian, animals develop"; x[38][1] = "teeth and thicker shells";
        x[39][0] = "early terrestrial landscapes in the devonian are littered with"; x[39][1] = "huge ferns and amphibians";
        x[40][0] = "at the end of the devonian, there is another"; x[40][1] = "mass extinction at 50%";
        x[41][0] = "during the carboniferous, pangaea is formed, and this continent smashes into america"; x[41][1] = "africa";
        x[42][0] = "the taconic orogeny where a volcanic island on top of a subduction zone smashed into america happened in"; x[42][1] = "the end of the ordovician";
        x[43][0] = "the acadian orogeny where the microcontinent avalonia smashes into the east coast of america happened in"; x[43][1] = "the end of the devonian";
        x[44][0] = "the alleghanian orogeny where africa smashes into the east coast of america happened in"; x[44][1] = "the end of the carboniferous";
        x[45][0] = "the permian period happens after the"; x[45][1] = "carboniferous period, and during this period pangaea is completely formed";
        x[46][0] = "during the permian, it is really good for animals, but after the permian, there is a huge"; x[46][1] = "mass extinction which is actually the biggest mass extinction in the fossil record, it marks the end of the paleozoic.";
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