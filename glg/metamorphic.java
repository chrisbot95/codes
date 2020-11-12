import java.util.Random;
import java.util.Scanner;
class metamorphic{
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
        x[0][0] = "metamorphism"; x[0][1] = "to change form through solid state reactions without melting";
        x[1][0] = "what are metamorphic rocks?"; x[1][1] = "Rocks changed from one form to another by intense heat and/or pressure or by the action of hot fluids";
        x[2][0] = "contact metamorphism"; x[2][1] = "metamorphism that occurs adjacent to igneous intrusions or along fractures with hot fluids (hydrothermal meta)";
        x[3][0] = "regional metamorphism"; x[3][1] = "occurs over large areas such as deep within the core of rising mountains. Generally accompanied by folding and faulting.";
        x[4][0] = "Recrystallization"; x[4][1] = "Change in shape and size or grains";
        x[5][0] = "Phase Change"; x[5][1] = "Mineral change without composition change";
        x[6][0] = "Metamorphic Reaction"; x[6][1] = "Atoms migrate through solid crystals. Chemical reactions create new minerals";
        x[7][0] = "Pressure Solution"; x[7][1] = "Minerals dissolve where pressed together (with the help of water) and precipitate under lower temperature/pressure.";
        x[8][0] = "Plastic Deformation"; x[8][1] = "Minerals behave like soft plastics";
        x[9][0] = "Metamorphic Petrology"; x[9][1] = "";
        x[10][0] = "Controls on Metamorphism"; x[10][1] = "1. Heat & Geothermal Gradient. 2. Pressure a)Hydrostatic Pressure b)Lithostatic Pressure c)Differential Stress - Compressive Stress - shear stress. 3. Circulating Fluids 4.Parent Rock (protolith)";
        x[11][0] = "sites of dissolution"; x[11][1] = "the rock grains dissolve and squeeze out either the top or bottom or whatever and then recrystallize. relative to the direction of compressive stress";
        x[12][0] = "geothermal gradient facts > "; x[12][1] = "under a mountain range, the geotherm gradient gets pushed upward because the compressive stress on the sides of the mountains causes there to be more heat underneath. under an active rift, the crust is thinning so the pressures are less but more magma is being allowed to come closer to the surface";
        x[13][0] = "the larger the intrusion of magma, "; x[13][1] = "the larger the metamorphic zone";
        x[14][0] = "foliation"; x[14][1] = "when the grains are visibly aligned under pressure(flattended)";
        x[15][0] = "lineation"; x[15][1] = "stretched version of foliation, you know how it is";
        x[16][0] = "slate protolith"; x[16][1] = "shale";
        x[17][0] = "quartzite protolith"; x[17][1] = "sandstone";
        x[18][0] = "marble protolith"; x[18][1] = "limestone";
        x[19][0] = "phyllite protolith"; x[19][1] = "slate";
        x[20][0] = "schist protolith"; x[20][1] = "phyllite";
        x[21][0] = "gneiss protolith"; x[21][1] = "schist";
        x[22][0] = "fine grained hornfels protolith"; x[22][1] = "any rock";
        x[23][0] = "shale metamorphosed"; x[23][1] = "slate";
        x[24][0] = "shale metamorphosed"; x[24][1] = "slate";
        x[25][0] = "sandstone metamorphosed"; x[25][1] = "quarzite";
        x[26][0] = "limestone metamorphosed"; x[26][1] = "marble";
        x[27][0] = "slate metamorphosed"; x[27][1] = "phyllite";
        x[28][0] = "phyllite metamorphosed"; x[28][1] = "schist";
        x[29][0] = "schist metamorphosed"; x[29][1] = "gneiss";
        x[30][0] = "any rock metamorphosed"; x[30][1] = "fine grained hornfels";
        x[31][0] = "what are two examples of non foliated rocks"; x[31][1] = "quartzite, marble";
        x[32][0] = "what type of metamorphism is associated with fine grained hornfels?"; x[32][1] = "contact";
        x[33][0] = "migmatites"; x[33][1] = "gneisses with light and dark-colored layers formed by partial melting; commonly having contorted swirling patterns. the minerals that melt earlier are at the bottom of the bowens reaction series, quartz & feldspars. why there is light colored liquids with dark colored metamorphic rocks";
        x[34][0] = "Mylonites:"; x[34][1] = "associated with fault zones where rocks are subjected to high differential pressures";
        x[35][0] = "Eclogites:"; x[35][1] = "Very high pressure course grained metamorphic rock with mafic chemistry. Associated with deep subduction zones. Usually contain garnet and pyroxene.";
        x[36][0] = "Slaty cleavage:"; x[36][1] = "Planar foliation developed parallel to shear planes in tightly folded rocks.";
        x[37][0] = "Gneissic Texture:"; x[37][1] = "parallel to sub-parallel foliation of medium- to coarse-grained platy minerals in alternating layers of different composition. Distinctly Banded";
        x[38][0] = "garnets tend to be created in"; x[38][1] = "metamorphic rocks";
        x[39][0] = "porphyroblast"; x[39][1] = "large mineral crystal in a metamorphic rock which has grown within the finer grained matrix.";
        x[40][0] = "Migmatitic Texture:"; x[40][1] = "Foliated texture with stages of initial melting of felsic minerals preserved";
        x[41][0] = "Non-Foliated Textures:"; x[41][1] = "Crystalline, Sandy, Microgranular, Smooth";
        x[42][0] = "Crystalline texture "; x[42][1] = "medium- to coarse-grained aggregate of inter-grown, visible crystals (Marble)";
        x[43][0] = "Sandy texture"; x[43][1] = "medium- to coarse-grained aggregates of sand-sized grains that resemble sandstone (Quartzite)";
        x[44][0] = "Microgranular texture"; x[44][1] = "fine-grained aggregate of inter-grown, equal-sized, microscopic crystals (Hornfels)";
        x[45][0] = "Smooth texture"; x[45][1] = "homogenous texture with no visible grains, shiny luster (Anthracite)";
        x[46][0] = "lithification"; x[46][1] = "turn sediments into sedimentary rock, but keep kranking and you get low grade, mid, high grade, past high grade is partial melting with migmitites. after migmitites is magma or liquid";
        x[47][0] = "thermal metamorphism is along the"; x[47][1] = "top of the graph after about 250 degrees";
        x[48][0] = "prograde metamorphism"; x[48][1] = "going through higher grades of metamorphism";
        x[49][0] = "retrograde metamorphism"; x[49][1] = "taking pressure off metamorphic rocks reverses a bit of the metamorphism";
        x[50][0] = "incredibly high pressures creates a special type of schist"; x[50][1] = "blueschist";
        x[51][0] = "Conditions of thermal metamorphism create"; x[51][1] = "hornfels, granulite";
        x[52][0] = "conditions beneath mountain belts create"; x[52][1] = "zeolite, greenschist, amphibolite, granulite";
        x[53][0] = "conditions beneath a stable continental interior create"; x[53][1] = "zeolite, greenschist, amphibolite, eclogite";
        x[54][0] = "conditions in an accretionary prism"; x[54][1] = "zeolite, PP, blueschist, Eclogite";
        x[55][0] = "muscovite quartz granite at high temperatures creates"; x[55][1] = "kspar, indicator mineral aluminosilicate (Al2SiO5) + H20";
        x[56][0] = "polymorphic minerals example"; x[56][1] = "graphite and diamond, same composition, carbon, different pressures";
        x[57][0] = "andalusite"; x[57][1] = "low pressure low temp";
        x[58][0] = "kyanite"; x[58][1] = "high pressure low temp";
        x[59][0] = "sillimanite"; x[59][1] = "high pressure high temp";
        x[60][0] = "metamorphic indicator minerals"; x[60][1] = "zeolite, chlorite, epidote(M), amphibole(M), Garnet(H), Pyroxene(H)";
        x[61][0] = "metamorphic rock grades with the rocks"; x[61][1] = "slate-L, Phyllite-LM, Schist-MH, Gneiss-H, Marble-contact or H, Quartzite-contact or H, Hornfels-contact Low p high t.";
        x[62][0] = "the circulating fluids throught the ocean floors and shit"; x[62][1] = "contact shit";
        x[63][0] = "marble is made from limestone and "; x[63][1] = "heat from magma";
        x[64][0] = "iron deposits will form from water coming through the fucking magma or some shit? iron deposits on top of that shitty marble"; x[64][1] = "";
        x[65][0] = "a subduction zone and two shits coming together can be perfect for regional metamorphism"; x[65][1] = "";
        x[66][0] = "canadian shield has almost all"; x[66][1] = "metamorphic rocks, includes the adirondacks, appalachians are their own metamorphics";
        x[67][0] = "towards boston you keep getting higher"; x[67][1] = "grades of metamorphic rocks, except for cape cod and long island for some reason";
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