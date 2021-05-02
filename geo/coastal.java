import java.util.Random;
import java.util.Scanner;
class coastal{
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
        x[0][0] = "coastal geomorphology applies to the sea shore and very large lakes(depending on how much energy is hitting the shore line)"; x[0][1] = "";
        x[1][0] = "subtidal, intertidal, backshore"; x[1][1] = "";
        x[2][0] = "lambda stands for "; x[2][1] = "wavelength, horizontal distance between adjacent crests (or troughs)";
        x[3][0] = "H stands for"; x[3][1] = "wave height, The vertical distance between wave crest and trough";
        x[4][0] = "T stands for "; x[4][1] = "Wave period, The time between the passing of two successive wave crests.";
        x[5][0] = "T = "; x[5][1] = "L/V (length/velocity)";
        x[6][0] = "wind transfers energy to the water"; x[6][1] = "";
        x[7][0] = "wave energy has to reach the bottom for geomorphology"; x[7][1] = "near the shore";
        x[8][0] = "the wave breaks due to the friction of the wave energy hitting the ground"; x[8][1] = "";
        x[9][0] = "The nature of waves depend on"; x[9][1] = "Wind velocity, wind duration, fetch";
        x[10][0] = "fetch"; x[10][1] = "length of the water along which the wind blows. the wind builds transfers more energy into the water if it goes along a longer stretch of water";
        x[11][0] = "Airy Equation"; x[11][1] = "L = [gT2/2π] x [tanh(2πd)/L], (d = water depth), h = (hyperbolic tangent), For L > 4d this close to 1. So… L = (gT2)/(2π) = 1.56 T2, And therefore V = 1.56 T (since V=L/T), ";
        x[12][0] = "In deep water longer waves travel faster then shorter ones and will gradually leave the shorter ones behind. This is 'wave dispersion'!"; x[12][1] = "";
        x[13][0] = "In shallow water (when d/L < 1/20) tanh becomes insignificant"; x[13][1] = "";
        x[14][0] = "L= T (gd)^1/2"; x[14][1] = "";
        x[15][0] = "T = (gd)^1/2"; x[15][1] = "";
        x[16][0] = "As depth decreases then velocity and length decrease. What happens to height? "; x[16][1] = "The height increases";
        x[17][0] = "Energy = 1/8 (ρgH2)"; x[17][1] = "";
        x[18][0] = "water is a cohesive liquid, so you get a rolling surface kind of like a slump"; x[18][1] = "as you increase the height of the wave, the slope will be steep enough that gravity will overcome the cohesion of the water and the wave breaks, like a slump.";
        x[19][0] = "there is a bunch of circles within the wave that get smaller down to the line at which the wave energy is null"; x[19][1] = "when the circles intersect the bottom of the water, it creates friction and sends energy upwards which increases the height of the wave which causes the wave to break.";
        x[20][0] = "when the wave energy hits the bottom of the water it can cause"; x[20][1] = "erosion and transportation of the sediments";
        x[21][0] = "surf zone"; x[21][1] = "where the waves begin to break to the shore";
        x[22][0] = "waves break slightly differently:"; x[22][1] = "spilling(foamy boring kind), plunging(surf), surging(dull surf), collapsing(most boring)";
        x[23][0] = "wave refraction"; x[23][1] = "waves tend to face the shore because the parts of the wave closer to the shore slow down before the parts of the waves farther from the shore";
        x[24][0] = "a more interesting coast line will erode at the headlands and deposit at the beaches which will eventually create an even shoreline"; x[24][1] = "";
        x[25][0] = "Shorelines are"; x[25][1] = "places where bodies of water meet dry land";
        x[26][0] = "Coasts are"; x[26][1] = "landward of ocean shorelines. the land behind the shoreline.";
        x[27][0] = "Beach:"; x[27][1] = "a narrow strip of land, washed by waves or tides. covered with sediments";
        x[28][0] = "Ordinary Waves are caused by"; x[28][1] = "WIND";
        x[29][0] = "Waves are produced when"; x[29][1] = "wind drag causes the surface water of oceans/lakes to rise and fall";
        x[30][0] = "Waves get refracted on"; x[30][1] = "approaching shoreline";
        x[31][0] = "Foreshore"; x[31][1] = "the area between low tide and high tide";
        x[32][0] = "Backshore"; x[32][1] = "the area between high tide and sea cliff or inland vegetation line";
        x[33][0] = "Beach face"; x[33][1] = "is the steepest part of Foreshore";
        x[34][0] = "Berm"; x[34][1] = "a horizontal bench of storm sediment, around here its due to the winter winds apparently which are stronger, they dont stick around long";
        x[35][0] = "Longshore current is"; x[35][1] = "produced as water flows parallel to coastline, transporting sediment down the beach in the direction";
        x[36][0] = "Rip Currents are"; x[36][1] = "produced when water piles up in surf zones and flows seaward, generally perpendicular to the coast.";
        x[37][0] = "winter profile, summer berm, winter berm, zone of swash and backwash"; x[37][1] = "";
        x[38][0] = "bar is below the zone of breakers where the waves break apparently"; x[38][1] = "";
        x[39][0] = "Tides – Mostly the Moon"; x[39][1] = "Daily rise/fall of surfaces of oceans/lakes due to gravitational pull of the Moon/Sun on the Earth– also due to force created as Earth spins on its axis";
        x[40][0] = "Flood tides"; x[40][1] = "elevate sea surface that cause shoreline to move inland";
        x[41][0] = "Ebb Tides"; x[41][1] = "low sea surface that cause shoreline to move seaward";
        x[42][0] = "Tidal Bulges"; x[42][1] = "high tide towards the moon is caused by gravitational attraction of the moon and earths spin, high tide of the side facing away from the moon is caused by lessened gravitational attraction of the moon on the opposite side of the earth";
        x[43][0] = "tidal inlet submerged, dry tidal inlet"; x[43][1] = "";
        x[44][0] = "tidal bore"; x[44][1] = "";
        x[45][0] = "Wave erosion occurs when"; x[45][1] = "deep water waves hit the shore with full force";
        x[46][0] = "Air and water are forced into cracks at "; x[46][1] = "high pressure";
        x[47][0] = "Coastal Erosion (Crashing Surf)"; x[47][1] = "";
        x[48][0] = "salt wedging happens along marine shorelines with cracks in the rocks crystal wedging/ growth"; x[48][1] = "";
        x[49][0] = "depending on the rock, the force of the wave and air mixture hydraulic force could be enough to break the rock further."; x[49][1] = "";
        x[50][0] = "headland"; x[50][1] = "cliff that juts seaward";
        x[51][0] = "Wave-cut bench"; x[51][1] = "is produced when waves undercut headland";
        x[52][0] = "Sea Caves"; x[52][1] = "are produced when waves are refracted against the side  of headland";
        x[53][0] = "Sea Arch "; x[53][1] = "forms when two Sea Caves erode completely through the headland";
        x[54][0] = "Sea Stack"; x[54][1] = "is formed when Sea Arches collapse";
        x[55][0] = "wave cut notch"; x[55][1] = "undercut cliff I guess";
        x[56][0] = "energy is concentrated on the headlands, and the energy gets dispursed at the beach shore things because of the dispersion of the angles"; x[56][1] = "";
        x[57][0] = "tombolo"; x[57][1] = "deposition behind the sea stack, obvious at low tide";
        x[58][0] = "Riprap"; x[58][1] = "a bunch of rocks dumped to protect the shoreline, generally an economic choice, doesnt cost much to just dump rocks";
        x[59][0] = "Groins"; x[59][1] = "bunch of rocks lined up to stop the sand from moving down the beach by the longshore current";
        x[60][0] = "Jettys"; x[60][1] = "pair of long walls/structures/rocks used to keep deposition out of the river mouth. keep it from getting closed off or moved by natural processes.";
        x[61][0] = "step like Seawall"; x[61][1] = "step like structure that dissipates the energy of the wave, susceptible to chemical weathering, salt crystals can grow. concrete and rebar.";
        x[62][0] = "Volcanic Black Sand Beach"; x[62][1] = "there are beaches made of mafic material, only because that is the prominent parent material available. calcium plagis, olivines.";
        x[63][0] = "Spit"; x[63][1] = "is a finger-like ridge of sand deposited where Longshore drift encounters deeper water";
        x[64][0] = "Hook"; x[64][1] = "is a curved spit";
        x[65][0] = "Baymouth Bar"; x[65][1] = "is a spit that covers the access to a bay – the area behind it fills with sediment, develops a fresh water marsh.";
        x[66][0] = "wherever the sea level is, thats where the energy gets focused, were currently in a transgression, the sea level is rising, so the level at which sea shore processes are happening is consistent with that."; x[66][1] = "";
        x[67][0] = "Glaciers lower sea-level slowly"; x[67][1] = "They melt quickly – sea level rises";
        x[68][0] = "Mid Ocean Ridges (MOR’s)"; x[68][1] = "Mid Ocean Ridge raises sea level if large and active, pumping out shit faster, creating sea floor faster. Lowers sea level if activity slows - becomes smaller < 34:00";
        x[69][0] = "Ocean Temperature"; x[69][1] = "Ocean water can thermally expand or contract";
        x[70][0] = "Ustatic"; x[70][1] = "";
        x[71][0] = "Local or Regional Tectonics"; x[71][1] = "east vs west coast. Can raise or lower local sea level, May be punctuated change";
        x[72][0] = "Glacial Isostatic Equilibrium Change"; x[72][1] = "Can raise of lower local sea level. Smooth linear or exponential change";
        x[73][0] = "you get a different shoreline on a passive margin than an active margin"; x[73][1] = "";
        x[74][0] = "the east coast allows a more dynamaic equilibrium to go on for longer. the west coast you get something going and then something shifts."; x[74][1] = "";
        x[75][0] = "Primary Coasts"; x[75][1] = "morphology is Mostly Non-Marine based. Coast types formed  mainly from non-marine processes such as glaciation (Long Island) , stream deposition (deltas) , fluctuating sea levels. Also Organic Coasts - reefs, mangroves";
        x[76][0] = "Fjords"; x[76][1] = "glacial valleys I think, can be filled with water due to transgression and glacial valleys tend to be lower due to the weight of the glaciers pushing down on the crust isostatically.";
        x[77][0] = "if you see signs of only glacial activity that has been drowned by water it is a "; x[77][1] = "type 1 shoreline or coast whatever.";
        x[78][0] = "raised beaches"; x[78][1] = "the land will rise due to isostatic rebound and leave a bunch of beaches at different elevations";
        x[79][0] = "upthrown block beaches"; x[79][1] = "due to tectonic uplift, has uplifted coastal terraces.";
        x[80][0] = "deltas are type 1 non marine"; x[80][1] = "if your primary shoreline is a delta";
        x[81][0] = "the rate at which the sea level rises and the land isostatically rebounds can be different. land can rise quicker than sea level, which I believe would be considered a regression."; x[81][1] = "";
        x[82][0] = "in an active volcano area, the rate at which new land is created can exceed the rate of sea level rise."; x[82][1] = "";
        x[83][0] = "Fringing Reef"; x[83][1] = "initially surround land, grow seaward";
        x[84][0] = "Barrier Reef"; x[84][1] = "separated from coast by a lagoon";
        x[85][0] = "Atoll"; x[85][1] = "circular structure from great depth that encloses shallow lagoon. the volcano will go cold and sink and leave the coral reefs in a ring shape around the sunken volcano.";
        x[86][0] = "Mangroves"; x[86][1] = "forests with ecosystems that like the marine water. can the forests keep up with the change in sea level? forests that grow out into the water";
        x[87][0] = "coral reefs grow to keep up with sea level"; x[87][1] = "works as a break water for the land behind it, the energy hits the coral reefs instead of the shoreline of the volcano area.48:50, dont be there in a typhoon, not high above sea level";
        x[88][0] = "great barrier reef is suffering because the excess carbon dioxide is getting into the water and making the water more acidic. lower ph"; x[88][1] = "";
        x[89][0] = "Coast Types II – Secondary Coasts Marine Processes"; x[89][1] = "Ongoing marine erosion and deposition. Erosion: Headlands, wave cut terraces, sea caves, stacks, and arches. Deposition: Beaches, spits, hooks, tombolos. Barrier Islands(beach spits) are nearly continuous ridges of sand parallel to main coast.";
        x[90][0] = "an inlet is created when a storm punches through a barrier island"; x[90][1] = "this inlet is now a dynamic shore environment with longshore drift and tidal fluctuations. eventually slowly it could heal itself. what if you dont want it to heal? create jettys";
        x[91][0] = "Divergent/Convergent plate boundaries possess steep continental shelves        "; x[91][1] = "shifting the crust faster than the ocean can get to equilibrium with the shoreline";
        x[92][0] = "Passive Continental Margins- have broad continental shelves and have beaches with spit"; x[92][1] = "plenty of time to develop type 2 shorelines";
        x[93][0] = "Island Arcs can protect coastlines"; x[93][1] = "form behind subduction zones, come out of nowhere Allows deltas to form";
        x[94][0] = "west coast active margin, east coast passive margin"; x[94][1] = "";
        x[95][0] = "Break waters, groins, and jetties all cause deposition of sediment somewhere"; x[95][1] = "Other areas lose beach sand. Development destroys vital shoreline vegetation. Water and petroleum pumping cause subsidence.";
        x[96][0] = "subsidence"; x[96][1] = "the gradual caving in or sinking of an area of land.";
        x[97][0] = "houston is sinking because of water and oil extraction, and sea level is rising, so its fucked."; x[97][1] = "";
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