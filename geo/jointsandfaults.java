import java.util.Random;
import java.util.Scanner;
class blankstudy{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[300][2];
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
        x[0][0] = "rivers cutting into the faults is 3rd order cutting into 2nd order"; x[0][1] = "";
        x[1][0] = "when we make folds we get brittle deformation so we are expecting"; x[1][1] = "joins and cracks and faults, inviting more rapid erosion along those shits";
        x[2][0] = "limestone apparently causes"; x[2][1] = "pitting with the tensile stress....?";
        x[3][0] = "long parallel joint patterns tend to be in"; x[3][1] = "sedimentary rock";
        x[4][0] = "when you put stress on igneous or metamorphic rocks you get"; x[4][1] = "subparallel joints and fractures that intersect";
        x[5][0] = "escarpment on the fault/fault scarp"; x[5][1] = "vertical wall along the upfaulted rock";
        x[6][0] = "if you see a fault, the flatiron looking shit is actually a triangular facet, when a river is going over an area and a fault occurs, uplifting one side, the river quickly incises a triangular facet into the shits."; x[6][1] = "";
        x[7][0] = "The difference between a fault scarp and a fault line scarp"; x[7][1] = "the fault line scarp delineates where the wall is after erosion has pushed it back. the fault scarp is the original wall I guess.";
        x[8][0] = "after triangular facets and flatirons, the rivers just want to "; x[8][1] = "bring everything down to base level";
        x[9][0] = "fault splinter"; x[9][1] = "";
        x[10][0] = "fault slices"; x[10][1] = "";
        x[11][0] = "obsequent fault line scarp"; x[11][1] = "an inverted scarp, one that results from the technically lower layers being higher up than the technically higher layers at the surface because the lower shits has a caprock.";
        x[12][0] = "resequent fault line scarp"; x[12][1] = "when erosion hits the cap rocks it inverts the obsequent shit. or the fault reactivates.";
        x[13][0] = "the rockys have a lot of reverse faults"; x[13][1] = "";
        x[14][0] = "when making a rift zone, you can either pull evenly or oddly, evenly creates two horsts and a graben. a horst is an upthrown block, a graben is a downthrown block. in the rotated version we call it a half graben. one horst, one graben"; x[14][1] = "";
        x[15][0] = "if the valley floor in a horst grabben situation is a basalt, that makes a really rich soil. mafic material is nutritious apparently."; x[15][1] = "";
        x[16][0] = "thrust fault"; x[16][1] = "low angle reverse fault, old rock over young rock";
        x[17][0] = "klippe"; x[17][1] = "chief mountain, montana";
        x[18][0] = "fenster"; x[18][1] = "window into younger rock from surrounding older rock.";
        x[19][0] = ""; x[19][1] = "";
        x[20][0] = ""; x[20][1] = "";
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
        x[70][0] = ""; x[70][1] = "";
        x[71][0] = ""; x[71][1] = "";
        x[72][0] = ""; x[72][1] = "";
        x[73][0] = ""; x[73][1] = "";
        x[74][0] = ""; x[74][1] = "";
        x[75][0] = ""; x[75][1] = "";
        x[76][0] = ""; x[76][1] = "";
        x[77][0] = ""; x[77][1] = "";
        x[78][0] = ""; x[78][1] = "";
        x[79][0] = ""; x[79][1] = "";
        x[80][0] = ""; x[80][1] = "";
        x[81][0] = ""; x[81][1] = "";
        x[82][0] = ""; x[82][1] = "";
        x[83][0] = ""; x[83][1] = "";
        x[84][0] = ""; x[84][1] = "";
        x[85][0] = ""; x[85][1] = "";
        x[86][0] = ""; x[86][1] = "";
        x[87][0] = ""; x[87][1] = "";
        x[88][0] = ""; x[88][1] = "";
        x[89][0] = ""; x[89][1] = "";
        x[90][0] = ""; x[90][1] = "";
        x[91][0] = ""; x[91][1] = "";
        x[92][0] = ""; x[92][1] = "";
        x[93][0] = ""; x[93][1] = "";
        x[94][0] = ""; x[94][1] = "";
        x[95][0] = ""; x[95][1] = "";
        x[96][0] = ""; x[96][1] = "";
        x[97][0] = ""; x[97][1] = "";
        x[98][0] = ""; x[98][1] = "";
        x[99][0] = ""; x[99][1] = "";
        x[100][0] = ""; x[100][1] = "";
        x[101][0] = ""; x[101][1] = "";
        x[102][0] = ""; x[102][1] = "";
        x[103][0] = ""; x[103][1] = "";
        x[104][0] = ""; x[104][1] = "";
        x[105][0] = ""; x[105][1] = "";
        x[106][0] = ""; x[106][1] = "";
        x[107][0] = ""; x[107][1] = "";
        x[108][0] = ""; x[108][1] = "";
        x[109][0] = ""; x[109][1] = "";
        x[110][0] = ""; x[110][1] = "";
        x[111][0] = ""; x[111][1] = "";
        x[112][0] = ""; x[112][1] = "";
        x[113][0] = ""; x[113][1] = "";
        x[114][0] = ""; x[114][1] = "";
        x[115][0] = ""; x[115][1] = "";
        x[116][0] = ""; x[116][1] = "";
        x[117][0] = ""; x[117][1] = "";
        x[118][0] = ""; x[118][1] = "";
        x[119][0] = ""; x[119][1] = "";
        x[120][0] = ""; x[120][1] = "";
        x[121][0] = ""; x[121][1] = "";
        x[122][0] = ""; x[122][1] = "";
        x[123][0] = ""; x[123][1] = "";
        x[124][0] = ""; x[124][1] = "";
        x[125][0] = ""; x[125][1] = "";
        x[126][0] = ""; x[126][1] = "";
        x[127][0] = ""; x[127][1] = "";
        x[128][0] = ""; x[128][1] = "";
        x[129][0] = ""; x[129][1] = "";
        x[130][0] = ""; x[130][1] = "";
        x[131][0] = ""; x[131][1] = "";
        x[132][0] = ""; x[132][1] = "";
        x[133][0] = ""; x[133][1] = "";
        x[134][0] = ""; x[134][1] = "";
        x[135][0] = ""; x[135][1] = "";
        x[136][0] = ""; x[136][1] = "";
        x[137][0] = ""; x[137][1] = "";
        x[138][0] = ""; x[138][1] = "";
        x[139][0] = ""; x[139][1] = "";
        x[140][0] = ""; x[140][1] = "";
        x[141][0] = ""; x[141][1] = "";
        x[142][0] = ""; x[142][1] = "";
        x[143][0] = ""; x[143][1] = "";
        x[144][0] = ""; x[144][1] = "";
        x[145][0] = ""; x[145][1] = "";
        x[146][0] = ""; x[146][1] = "";
        x[147][0] = ""; x[147][1] = "";
        x[148][0] = ""; x[148][1] = "";
        x[149][0] = ""; x[149][1] = "";
        x[150][0] = ""; x[150][1] = "";
        x[151][0] = ""; x[151][1] = "";
        x[152][0] = ""; x[152][1] = "";
        x[153][0] = ""; x[153][1] = "";
        x[154][0] = ""; x[154][1] = "";
        x[155][0] = ""; x[155][1] = "";
        x[156][0] = ""; x[156][1] = "";
        x[157][0] = ""; x[157][1] = "";
        x[158][0] = ""; x[158][1] = "";
        x[159][0] = ""; x[159][1] = "";
        x[160][0] = ""; x[160][1] = "";
        x[161][0] = ""; x[161][1] = "";
        x[162][0] = ""; x[162][1] = "";
        x[163][0] = ""; x[163][1] = "";
        x[164][0] = ""; x[164][1] = "";
        x[165][0] = ""; x[165][1] = "";
        x[166][0] = ""; x[166][1] = "";
        x[167][0] = ""; x[167][1] = "";
        x[168][0] = ""; x[168][1] = "";
        x[169][0] = ""; x[169][1] = "";
        x[170][0] = ""; x[170][1] = "";
        x[171][0] = ""; x[171][1] = "";
        x[172][0] = ""; x[172][1] = "";
        x[173][0] = ""; x[173][1] = "";
        x[174][0] = ""; x[174][1] = "";
        x[175][0] = ""; x[175][1] = "";
        x[176][0] = ""; x[176][1] = "";
        x[177][0] = ""; x[177][1] = "";
        x[178][0] = ""; x[178][1] = "";
        x[179][0] = ""; x[179][1] = "";
        x[180][0] = ""; x[180][1] = "";
        x[181][0] = ""; x[181][1] = "";
        x[182][0] = ""; x[182][1] = "";
        x[183][0] = ""; x[183][1] = "";
        x[184][0] = ""; x[184][1] = "";
        x[185][0] = ""; x[185][1] = "";
        x[186][0] = ""; x[186][1] = "";
        x[187][0] = ""; x[187][1] = "";
        x[188][0] = ""; x[188][1] = "";
        x[189][0] = ""; x[189][1] = "";
        x[190][0] = ""; x[190][1] = "";
        x[191][0] = ""; x[191][1] = "";
        x[192][0] = ""; x[192][1] = "";
        x[193][0] = ""; x[193][1] = "";
        x[194][0] = ""; x[194][1] = "";
        x[195][0] = ""; x[195][1] = "";
        x[196][0] = ""; x[196][1] = "";
        x[197][0] = ""; x[197][1] = "";
        x[198][0] = ""; x[198][1] = "";
        x[199][0] = ""; x[199][1] = "";
        x[200][0] = ""; x[200][1] = "";
        x[201][0] = ""; x[201][1] = "";
        x[202][0] = ""; x[202][1] = "";
        x[203][0] = ""; x[203][1] = "";
        x[204][0] = ""; x[204][1] = "";
        x[205][0] = ""; x[205][1] = "";
        x[206][0] = ""; x[206][1] = "";
        x[207][0] = ""; x[207][1] = "";
        x[208][0] = ""; x[208][1] = "";
        x[209][0] = ""; x[209][1] = "";
        x[210][0] = ""; x[210][1] = "";
        x[211][0] = ""; x[211][1] = "";
        x[212][0] = ""; x[212][1] = "";
        x[213][0] = ""; x[213][1] = "";
        x[214][0] = ""; x[214][1] = "";
        x[215][0] = ""; x[215][1] = "";
        x[216][0] = ""; x[216][1] = "";
        x[217][0] = ""; x[217][1] = "";
        x[218][0] = ""; x[218][1] = "";
        x[219][0] = ""; x[219][1] = "";
        x[220][0] = ""; x[220][1] = "";
        x[221][0] = ""; x[221][1] = "";
        x[222][0] = ""; x[222][1] = "";
        x[223][0] = ""; x[223][1] = "";
        x[224][0] = ""; x[224][1] = "";
        x[225][0] = ""; x[225][1] = "";
        x[226][0] = ""; x[226][1] = "";
        x[227][0] = ""; x[227][1] = "";
        x[228][0] = ""; x[228][1] = "";
        x[229][0] = ""; x[229][1] = "";
        x[230][0] = ""; x[230][1] = "";
        x[231][0] = ""; x[231][1] = "";
        x[232][0] = ""; x[232][1] = "";
        x[233][0] = ""; x[233][1] = "";
        x[234][0] = ""; x[234][1] = "";
        x[235][0] = ""; x[235][1] = "";
        x[236][0] = ""; x[236][1] = "";
        x[237][0] = ""; x[237][1] = "";
        x[238][0] = ""; x[238][1] = "";
        x[239][0] = ""; x[239][1] = "";
        x[240][0] = ""; x[240][1] = "";
        x[241][0] = ""; x[241][1] = "";
        x[242][0] = ""; x[242][1] = "";
        x[243][0] = ""; x[243][1] = "";
        x[244][0] = ""; x[244][1] = "";
        x[245][0] = ""; x[245][1] = "";
        x[246][0] = ""; x[246][1] = "";
        x[247][0] = ""; x[247][1] = "";
        x[248][0] = ""; x[248][1] = "";
        x[249][0] = ""; x[249][1] = "";
        x[250][0] = ""; x[250][1] = "";
        x[251][0] = ""; x[251][1] = "";
        x[252][0] = ""; x[252][1] = "";
        x[253][0] = ""; x[253][1] = "";
        x[254][0] = ""; x[254][1] = "";
        x[255][0] = ""; x[255][1] = "";
        x[256][0] = ""; x[256][1] = "";
        x[257][0] = ""; x[257][1] = "";
        x[258][0] = ""; x[258][1] = "";
        x[259][0] = ""; x[259][1] = "";
        x[260][0] = ""; x[260][1] = "";
        x[261][0] = ""; x[261][1] = "";
        x[262][0] = ""; x[262][1] = "";
        x[263][0] = ""; x[263][1] = "";
        x[264][0] = ""; x[264][1] = "";
        x[265][0] = ""; x[265][1] = "";
        x[266][0] = ""; x[266][1] = "";
        x[267][0] = ""; x[267][1] = "";
        x[268][0] = ""; x[268][1] = "";
        x[269][0] = ""; x[269][1] = "";
        x[270][0] = ""; x[270][1] = "";
        x[271][0] = ""; x[271][1] = "";
        x[272][0] = ""; x[272][1] = "";
        x[273][0] = ""; x[273][1] = "";
        x[274][0] = ""; x[274][1] = "";
        x[275][0] = ""; x[275][1] = "";
        x[276][0] = ""; x[276][1] = "";
        x[277][0] = ""; x[277][1] = "";
        x[278][0] = ""; x[278][1] = "";
        x[279][0] = ""; x[279][1] = "";
        x[280][0] = ""; x[280][1] = "";
        x[281][0] = ""; x[281][1] = "";
        x[282][0] = ""; x[282][1] = "";
        x[283][0] = ""; x[283][1] = "";
        x[284][0] = ""; x[284][1] = "";
        x[285][0] = ""; x[285][1] = "";
        x[286][0] = ""; x[286][1] = "";
        x[287][0] = ""; x[287][1] = "";
        x[288][0] = ""; x[288][1] = "";
        x[289][0] = ""; x[289][1] = "";
        x[290][0] = ""; x[290][1] = "";
        x[291][0] = ""; x[291][1] = "";
        x[292][0] = ""; x[292][1] = "";
        x[293][0] = ""; x[293][1] = "";
        x[294][0] = ""; x[294][1] = "";
        x[295][0] = ""; x[295][1] = "";
        x[296][0] = ""; x[296][1] = "";
        x[297][0] = ""; x[297][1] = "";
        x[298][0] = ""; x[298][1] = "";
        x[299][0] = ""; x[299][1] = "";
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