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