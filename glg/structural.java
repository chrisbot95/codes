import java.util.Random;
import java.util.Scanner;
class structural{
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
        x[0][0] = "Stress:"; x[0][1] = "the force per unit area acting on any surface within a solid in response to external forces acting upon it.";
        x[1][0] = "Strain:"; x[1][1] = "the change in the shape or the volume of a body as a result of stress.";
        x[2][0] = "compression"; x[2][1] = "Compressive stresses tend to cause shortening or a decrease in volume.";
        x[3][0] = "tension"; x[3][1] = "Tensile stresses tend to cause extension, the pulling apart of a material.";
        x[4][0] = "shear"; x[4][1] = "Shear stresses act tangentially, and tend to cause shear or sliding movements along parallel shear surfaces.";
        x[5][0] = "elastic strain"; x[5][1] = "the damage is not permanent";
        x[6][0] = "plastic strain"; x[6][1] = "the damage is ultra fuckin permanent";
        x[7][0] = "elastico-plastic"; x[7][1] = "its elastic up to some point, past the yield point it gets more plastic and shit";
        x[8][0] = "brittle deformation"; x[8][1] = "cracks, breaking";
        x[9][0] = "ductile deformation"; x[9][1] = "bending";
        x[10][0] = "what are the factors affecting rock strength?"; x[10][1] = "confining pressure, heat, rock type, strain rate";
        x[11][0] = "anticlines"; x[11][1] = "shaped like an a, points towards the sky";
        x[12][0] = "synclines"; x[12][1] = "points towards hell";
        x[13][0] = "limbs"; x[13][1] = "the two sides of a cline, on either side of the hingle line and axial plane axis bullshit";
        x[14][0] = "monocline"; x[14][1] = "when it folds over a fault line like a thrust fault or whatever";
        x[15][0] = "open fold"; x[15][1] = "relaxed fold";
        x[16][0] = "tight fold"; x[16][1] = "upright fold";
        x[17][0] = "basin"; x[17][1] = "bowl shit";
        x[18][0] = "dome"; x[18][1] = "upside down bowl";
        x[19][0] = "fold symmetry"; x[19][1] = "symmetrical folds, asymmetrical folds, recumbeld folds, overturned folds, convolute bedding, domes and basins";
        x[20][0] = "cleavage plane"; x[20][1] = "the imaginary line the rock is stretched across/with";
        x[21][0] = "the michigan basin"; x[21][1] = "michigan is actually a basin, with late paleozoic rocks, surrounded by silurian and devonian rocks, which are surrounded by cambrian and ordovician rocks";
        x[22][0] = "types of faults"; x[22][1] = "Dip and Strike. Strike-Slip Faults (Shear). Dip-Slip Faults> Normal Faults (Exension). Reverse and ThrustFaults (Shortening). Oblique-Slip Faults";
        x[23][0] = "orogenisis fact that keeps getting repeated as fuck"; x[23][1] = "fold and thrust belts, they push continental crust down under the mountains I guess. they cause basins?? rocks at great depth are faulted and squeezed up to the surface";
        x[24][0] = "whats an example of a fold and thrust belt area"; x[24][1] = "glacier national park";
        x[25][0] = "chief mountain"; x[25][1] = "a mountain that has older rock on top because of a thrust fault that got eroded away leaving the mountain behind. the thrus fault is called the lewis thrust fault. it was precambrian rock on top of cretaceous shale";
        x[26][0] = "rifting causes"; x[26][1] = "mountains and ridges and basins with normal faults I guess";
        x[27][0] = "platform"; x[27][1] = "sedimentary rocks at surface";
        x[28][0] = "shield"; x[28][1] = "metamorphic rocks at surface";
        x[29][0] = "the adirondacks are actually a"; x[29][1] = "dome, ancient rock doming up and still rising. might be a geothermal hotspot pushing them up";
        x[30][0] = "the adirondacks were formed during the ___ orogeny"; x[30][1] = "grenville orogeny with super continent rodinia";
        x[31][0] = "post-grenville rifting"; x[31][1] = "rodinia breaks up and causes mountain ranges?";
        x[32][0] = "taconic orogeny"; x[32][1] = "islands hitting us and shit";
        x[33][0] = "acadian orogeny"; x[33][1] = "microcontinent hit us";
        x[34][0] = "aleghenian orogeny"; x[34][1] = "made the mountian ranged what they are n shit. then the mesozoic rifting";
        x[35][0] = "there was rifting in the"; x[35][1] = "mesozoic";
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