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
        x[0][0] = "Native Elements:"; x[0][1] = "pure masses of a single metal, pretty stable when it comes to weathering and erosion";
        x[1][0] = "Carbonates:"; x[1][1] = "metal cation bonded to carbonate anion (CO32-) susceptable to weathering in a low ph environment?";
        x[2][0] = "Halides:"; x[2][1] = "metal cation bonded to a halogen ion (i.e.: Cl- or F-) easily broken apart with just water";
        x[3][0] = "Sulfates:"; x[3][1] = "metal cation bonded to Sulfate (SO42-)";
        x[4][0] = "Silicates:"; x[4][1] = "SiO44- minerals with Silicon-Oxygen tetrahedron, silicates are kinda strong";
        x[5][0] = "Oxides:"; x[5][1] = "metal cation bonded to Oxygen anion";
        x[6][0] = "Sulfides:"; x[6][1] = "metal cation bonded to Sulfide (S2-)";
        x[7][0] = "Saprolite:"; x[7][1] = "Chemically weathered rock. like solid bedrock that turned into a clump of clay minerals.";
        x[8][0] = "Oxidation-Reduction Reactions: "; x[8][1] = "These reactions involve the gain or loss of electrons from atoms.  For example;";
        x[9][0] = "Hydrolysis Reactions:"; x[9][1] = "Reaction of minerals with H+ from water.   For example;";
        x[10][0] = "Carbonation Reactions:"; x[10][1] = "The reaction of minerals with dissolved CO2 in water.";
        x[11][0] = "Hydration Reactions"; x[11][1] = "";
        x[12][0] = "Ion-Exchange Reactions:"; x[12][1] = "These reactions generally involve the substitution of loosely bonded ions adsorbed onto mineral surfaces ";
        x[13][0] = "Chelation:"; x[13][1] = "rxn between a metal ion and a complexing agent.";
        x[14][0] = "Le Chateliers principal"; x[14][1] = "When equilibrium systems are disturbed they adjust to minimize the effect of the disturbance.";
        x[15][0] = "Silicate Minerals"; x[15][1] = "Most common minerals on Earth (>95%). Compose oceanic crust and mantle. Silicate tetrahedra can form long chains, sheets, and networks";
        x[16][0] = "The building blocks of the silicate minerals is the"; x[16][1] = "silicate tetrahedral which is one silica and 4 oxygen anions.";
        x[17][0] = "the isolated silica tetrahedral shit and its surrounded by cations(iron or magnesium), a mineral that has this is "; x[17][1] = "olivine";
        x[18][0] = "micas have"; x[18][1] = "sheet silica structures";
        x[19][0] = "pyroxenes have"; x[19][1] = "single chains of silicas";
        x[20][0] = "amphiboles have"; x[20][1] = "double chains of silicas";
        x[21][0] = "quartz have"; x[21][1] = "three dimensional frameworks of silicas";
        x[22][0] = "feldspars fall close to the framework but we have our"; x[22][1] = "sodium and aluminium mixed into the feldspars aswell";
        x[23][0] = "cations are easier to remove/replace from a mineral if they have a"; x[23][1] = "small charge, or if they're a small radius ion";
        x[24][0] = "the least susceptible to weathering minerals are the ones with the"; x[24][1] = "more complicated silica tetrahedral formations";
        x[25][0] = "the micas are a little out of order when it comes to weathering in the bowens reaction series because"; x[25][1] = "they are strong along the sheet axis but not inbetween the sheets, and theres a lot of chemical substitution that happens in between the sheets";
        x[26][0] = "when we bring iron bearing silicates to the surface and expose them to weathering (Olivine, pyroxene, amphibole, biotite) we create a series of clay minerals and iron oxides (especially any minerals that have iron+2 and iron+3 as their cations"; x[26][1] = "";
        x[27][0] = "when we bring feldspars to the surface and expose them to weathering, we get"; x[27][1] = "Clay minerals, K, Na, Ca ions (I guess when you pull out them ions you are left with clay minerals)";
        x[28][0] = "Quarts weathers to"; x[28][1] = "Quartz";
        x[29][0] = "Muscovite mica weathers to "; x[29][1] = "clay minerals K ions ( so we pull the potassium out and were left with clay minerals, whatever that means)";
        x[30][0] = "Calcite weathers to"; x[30][1] = "Ca, CO3 ions (calcium and carbonate)";
        x[31][0] = "Clay minerals"; x[31][1] = "Hydrated silicates of Al, Fe, and Mg arranged in sheets of Si tetrahedrals and Al octahedrals";
        x[32][0] = "The aluminium octahedral (important in clay apparently) is"; x[32][1] = "an aluminium cation surrounded by 6 oxygens";
        x[33][0] = "Clay minerals are like legos, or combinations of sheets of "; x[33][1] = "silica tetrahedrals and aluminium octahedrals";
        x[34][0] = "a 2:1 clay is "; x[34][1] = "2 silica tetrahedral sheets with 1 aluminium octahedral sheet combined like an oreo cookie with exchangeable water molecules or cations between the sheets";
        x[35][0] = "a 1:1 clay is "; x[35][1] = "1 to 1 like really with them exchangeable water molecules or cations inbetween honey";
        x[36][0] = "a 2:1:1 clay is "; x[36][1] = "2 rows of silica tets, 1 row of alu octs, and a row of some cation inbetween the cookies, in the case of his example of muskovite, its potassium ions.";
        x[37][0] = "left off at 21:51"; x[37][1] = "";
        x[38][0] = "montmorillonite"; x[38][1] = "when you have muscovite and you remove the potassium bondings between the oreo cookies";
        x[39][0] = "illite"; x[39][1] = "if you still have some K+ left over from taking the potassium out of the muscovite";
        x[40][0] = "we can remove a silica tet out of the 2:1 clay and make a 1:1 clay called kaolinite"; x[40][1] = "";
        x[41][0] = "kaolinite"; x[41][1] = "muscovite > montmorillonite > kaolonite, we removed the potassium between the cookies and removed one of the tets";
        x[42][0] = "Gibsite"; x[42][1] = " a 1:1 clay I guess, not sure how Im supposed to tie this in....";
        x[43][0] = "the 3 different bonds he showed us with the clay minerals were the"; x[43][1] = "1:1 clay minerals bonded with a hydrogen bond, like oreo cookies stacked. individual cookies stacked with a cation inbetween, and the same but with water inbetween ( causing more space)";
        x[44][0] = "so when it comes to adding water to the clay minerals (assuming were still talking about muscovite here idk) what are the different stages of adding water and shit?"; x[44][1] = "you start with illite, which still has some k+(1 nm), then you add water and cations and get vermiculite(1.0 - 1.4 nm), add more water and cations and you get smectite(1.0 - 2.0 nm)";
        x[45][0] = "weathering of clay minerals gradient, GO!"; x[45][1] = "mica (2:1:1) > illite 2:1 CEC 20 > Int. 2:1 CEC 30 > Vermiculite 2:1 CEC 150 > Smectite 2:1 CEC 80 > Kaolinite 1:1 CEC 3 > gibsite 1:1 CEC 0";
        x[46][0] = "you can keep breaking down clay minerals until it becomes pretty much just"; x[46][1] = "silica tets and alu octs";
        x[47][0] = "water has a neutral overall charge but it is polarized so it can"; x[47][1] = "fit between the clay minerals and hold things together";
        x[48][0] = "Non silicate minerals are easy to weather"; x[48][1] = "gypsum and halite just need water";
        x[49][0] = "phosphates and carbonates in acidic conditions are next easiest to weather"; x[49][1] = "";
        x[50][0] = "weathering sequence for fine grained minerals"; x[50][1] = "non silicates (easiest to weather), phosphates and carbonates(in acidic conditions), mafic minerals (silicates), feldspars, muscovite, quartz > turn into clay minerals, more stable than silicate counterparts. oxides at the earths surface are the most stable minerals (gibbsite, hematite, zircon), ";
        x[51][0] = "presence of vegetation is a"; x[51][1] = "weathering factor";
        x[52][0] = "factors affecting weathering > "; x[52][1] = "parent material (mineral stability, permeability, joints and fractures) Climate, Vegetation, Topography, Time";
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