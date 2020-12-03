import java.util.Random;
import java.util.Scanner;
class mesoceno{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[70][2];
        int length=32;
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
        x[0][0] = "when does pangaea start to break up?"; x[0][1] = "jurassic period";
        x[1][0] = "when does pangaea split the fuck up?"; x[1][1] = "early cretaceous period";
        x[2][0] = "when do the north and south atlantic oceans start to form?"; x[2][1] = "cretaceous period";
        x[3][0] = "at the end of the cretaceous period is the infamous"; x[3][1] = "k-t boundary event that wiped out the dinasaurs. k is for cretaceous, t for tercery";
        x[4][0] = "evidence for the kt boundary event"; x[4][1] = "mineral layer seen around the world which had lots of iridium in it, which was evidence it was a meteorite impact, since iridium forms mostly in space I think";
        x[5][0] = "larger creatures have a harder time >"; x[5][1] = "adjusting to changes in the ecosystem";
        x[6][0] = "what are the cenozoic epochs?"; x[6][1] = "paleocene, eocene, oligocene, miocene, pliocene, pleistocene, holocene";
        x[7][0] = "whats the name of the crater we think is the site of the meteorite crash"; x[7][1] = "chicxulub crater";
        x[8][0] = "during the paleocene, the continents are"; x[8][1] = "recognizable";
        x[9][0] = "during the paleocene, we have a detailed record of the rising and falling"; x[9][1] = "sea levels";
        x[10][0] = "during the early triassic, pangaea"; x[10][1] = "is together";
        x[11][0] = "during the mesozoic"; x[11][1] = "";
        x[12][0] = "hppmoep"; x[12][1] = "hey please press my other every penis";
        x[13][0] = "ppmdsoc"; x[13][1] = "please press my dick suck on cock";
        x[14][0] = "hey please press my other every penis"; x[14][1] = "holocene pleistocene pliocene miocene oligocene eocine paleocene";
        x[15][0] = "please press my dick suck on cock"; x[15][1] = "permian pennsylvanian mississippian devonian silurian orovician cambrian";
        x[16][0] = "Eocene notes "; x[16][1] = "whales, detailed record of rising falling sea level, low sea level - glacial period. high sea level - warm period, pulses of climate shift. late eocene - pulses of mass extinction";
        x[17][0] = "oligocene notes"; x[17][1] = "early warm earliest monkeys, largest land mammales. late - colder. oceans circulation is reorganizing and changing the way the ocean currents deliver heat from the eqator regions to the polar regions, major reason for the climate shift changing earths external heat dist. polar regions get colder, creates ice on land and drops sea level - regression.";
        x[18][0] = "Miocene notes"; x[18][1] = "as earth gets cooler through the cenozoic the glacial times will be a lot more dramatic than before, when we get into pliocene and pleistocene we get way more fucking dramatic shifts <remember picture, huge bite out of cookie>";
        x[19][0] = "Pliocene notes"; x[19][1] = "horses zebras camel, tiger things";
        x[20][0] = "Pleistocene notes "; x[20][1] = "climate shifts get fucking crazy. sea levels lower as canada/northern europe and asia is covered in ice (glaciation). rapid climate shifts every 100,000 years(rapid for geology) make it hard for animals/ecosystems  to adapt. india is well into asia, himilayas well defined, europe well defined. arabian peninsula rifted off africa. you can get to north america from south america, and animals can now commute";
        x[21][0] = "pleistocene notes 2"; x[21][1] = "dry regions north and south of equator on africa and around world. during glacial periods the ecosystems get pushed south. plant eco systems - very dramatic change. when it recedes they can move back upward.";
        x[22][0] = "pleistocene notes 3"; x[22][1] = "we develop very large animals, primates - apparently become a problem. in between glacial times theres a lot of habitat. during glacial times everyone has to scrunch";
        x[23][0] = "pleistocene notes 4"; x[23][1] = "pleistocene wooly mammoth, sabertooth tigers. evolution of primates- start killing large mammals, may be why the bigger animals went missing more so than climate shifts. human ancestors killed everyone dammit.";
        x[24][0] = "EONS > "; x[24][1] = "Phanerozoic - huge explosion of fossils. Precambrian - proterozoic(little life), archean(little life), hadean";
        x[25][0] = "the eras of the phanerozoic"; x[25][1] = "Cenozoic(65my)-recent(mammals). MESOZOIC(245my)-middle(dinasaurs, wrapped by two extinction events, meteorite hit at kt boundary) chickslube crater on the ukatan. PALEOZOIC(545my)-ancient(fun sea creatures)";
        x[26][0] = "periods of mesoceno"; x[26][1] = "quaternary(began 1.8my), tertiary(began 65my) cretaceous jurassic triassic(245my)";
        x[27][0] = "regression"; x[27][1] = "sea level lowers (review)";
        x[28][0] = "transgression"; x[28][1] = "sea level rises (review)";
        x[29][0] = "how long ago was the beginning of the cenozoic?"; x[29][1] = "65 my";
        x[30][0] = "how long ago was the beginning of the mesozoic?"; x[30][1] = "245 my";
        x[31][0] = "how long ago was the beginning of the paleozoic?"; x[31][1] = "545 my";
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