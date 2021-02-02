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
        x[0][0] = "Soil (agri)"; x[0][1] = "The surface layer of earth that is capable of supporting rooted plant life.  The lower limit generally coincides with the lower limit of biological activity and thus generally extends only a few meters below the surface. ";
        x[1][0] = "Soil (eng.):"; x[1][1] = "All unconsolidated earthy materials that overlie bedrock.";
        x[2][0] = "Regolith"; x[2][1] = "Regolith is the general term for the entire mantle of loose, unconsolidated rock material of whatever origin, that overlies coherent bedrock.";
        x[3][0] = "Residual Soil"; x[3][1] = "Weathered Soil";
        x[4][0] = "Transported Soil"; x[4][1] = "erosion. soil material was transported and desposited";
        x[5][0] = "Saprolite:"; x[5][1] = "Chemically weathered rock. (residual soil)";
        x[6][0] = "Transported Soils"; x[6][1] = "Alluvium, Colluvium, Eolian Deposits, Glacial Deposits, Marine Deposits, Lacustrine Deposits";
        x[7][0] = "Pedon: "; x[7][1] = "The smallest volume that can be recognized as a soil individual. It has three dimensions and its area ranges from 1 to 10 square meters, depending on the variability in the horizons. The shape of the pedon is roughly hexagonal.";
        x[8][0] = "Pedogenesis: "; x[8][1] = "The process of soil formation as the integral result of the combination of soil forming factors.";
        x[9][0] = "Soil Forming (Weathering) Factors"; x[9][1] = "Parent Material (mineral stability, permeability, joins and fractures), Climate, Vegetation, Topography, Time";
        x[10][0] = "Soil Horizons"; x[10][1] = "so apparently as the soil gets weathered by the water passing through it, cations get brought down, and the anions stay where they are.";
        x[11][0] = "zone of eluviation"; x[11][1] = "zone of leaching";
        x[12][0] = "Alluvium"; x[12][1] = "material transported by a river";
        x[13][0] = "Colluvium"; x[13][1] = "material transported by gravity";
        x[14][0] = "eolian deposits"; x[14][1] = "material transported by wind";
        x[15][0] = "glacial deposits"; x[15][1] = "materials transported by a glacier";
        x[16][0] = "marine deposits"; x[16][1] = "yeah I guess. marine salt water";
        x[17][0] = "Lacustrine deposits"; x[17][1] = "water deposit, in a lake. fresh water.";
        x[18][0] = "zone of illuviation"; x[18][1] = "zone of accumulation";
        x[19][0] = "zone e will be very high in"; x[19][1] = "residual silicate minerals";
        x[20][0] = "the o layer on top is the"; x[20][1] = "organic zone";
        x[21][0] = "loam"; x[21][1] = "mix of grain sizes";
        x[22][0] = "soil orders"; x[22][1] = "";
        x[23][0] = "entisol"; x[23][1] = "minimal soil profile development, no longer purely a c horizon, just barely soil";
        x[24][0] = "andisol"; x[24][1] = "develop on fresh organic ash";
        x[25][0] = "gelosol"; x[25][1] = "minimal soil profile development, permafrost regions";
        x[26][0] = "inceptisol"; x[26][1] = "well developed A-horizon, weak B-horizon";
        x[27][0] = "mollisol"; x[27][1] = "thick, dark, highly organic A-horizon";
        x[28][0] = "alfisol"; x[28][1] = "thin A-horizon over clay-rich B-horizon, well developed E horizon. water moves ions, moves clay sized particals.";
        x[29][0] = "Spodosol"; x[29][1] = "Strong eluviation in A and E horizons; moving full ass sized organics in B-horizon since were moving so much with water I guess";
        x[30][0] = "Aridosol"; x[30][1] = "Arid environments, net evaporation. thin A and B horizons with little organics, caliche in B or C hor. water evaporates out of the ground and leaves evaporite minerals like calcite in the soil, caliche - calite residue.";
        x[31][0] = "Histosol"; x[31][1] = "swampy soil, wet, organic-rich soils, thick O and A horizons";
        x[32][0] = "vertisol"; x[32][1] = "high clay content; (vermiculite clay example) shrinks and swells w/soil moisture variations. does not allow horizons to develop";
        x[33][0] = "Oxisols:"; x[33][1] = "highly weathered, red B-horizon from oxidized Fe";
        x[34][0] = "Ultisols:"; x[34][1] = "highly weathered, B-horizon enriched in clay and Al-oxides. so well developed, you're left with is silica, oxygen and aluminium.";
        x[35][0] = "entisol facts"; x[35][1] = "No diagnostic subsurface horizons. Very recent or young soil, little if any profile development. form on resistant P.M., mine spoils, steep slopes, floodplains";
        x[36][0] = "inceptisol facts"; x[36][1] = "Slightly more development than entisols. Young soils but beginning of profile development is evident. May have a cambic horizon.";
        x[37][0] = "mollisols facts"; x[37][1] = "typically form under grasslands, central US. Soils with a mollic epipedon: Thick humus-rich surface horizon, high % base saturation throughout profile, slightly leached, very fertile soils.";
        x[38][0] = "Alfisol facts"; x[38][1] = "do have an argillic horizon. about 35% base saturation. develop in humid, temperate regions. vegetation is usually deciduous (forests, savanna). gray to brown surface horizon. Good for grain production";
        x[39][0] = "Spodosols facts"; x[39][1] = "Have a spodic horizon. Form in humid, cool climates and occur most often in conifer forests (New England, Mich., Canada). Form in acid, coarse, quartz (sandy) bearing P.M. Low fertility.";
        x[40][0] = "Ultisol facts"; x[40][1] = "Have Argillic or Kandic with <35% Base saturation. Common in S.E. US, humid tropical, and subtropical regions. Warm and humid environs. Old, highly weathered, high degree of development (ult). Low fertility.";
        x[41][0] = "Oxisols facts"; x[41][1] = "Have an oxic horizon. Dominated by residual accumulations of Fe and Al oxides and kaolinite. Most extensively weathered soils (occur in tropical regions). Intense red or yellow (high in oxidized iron). Low % Base Saturation. extensively leached. Low fertility.";
        x[42][0] = "Histosols facts"; x[42][1] = "Organic soils (peats and mucks). Mainly found in cold climates (Alaska, Canada, Finland, Russia). Low-lying swampy areas. Virtually all Histosols occur in wetland environments. Have very low bulk densities and very high water holding capacity. ";
        x[43][0] = "Vertisols facts"; x[43][1] = "High clay soils (>30% sticky shrink-swell clays). Deep cracks upon drying. Materials from soil surface fill cracks and become part of the subsurface when the cracks close (inverted soil). ";
        x[44][0] = "Aridisols facts"; x[44][1] = "Form in aridic moisture regimes (dry). Dry at least 6 months. Low OM. Little leaching. High base sat. Can be very productive if irrigated.";
        x[45][0] = "Andisols facts"; x[45][1] = "Form from P.M. of volcanic origin. Soil forms by rapid weathering of volcanic ash to produce poorly crystallized aluminosilicates (allophane & imogolite). Andisols are young soils ( and they have high OM). In dry climates, can be susceptible to wind erosion. Can have unusually low bulk densities.";
        x[46][0] = "Gelisols facts"; x[46][1] = "Presence of permafrost layer within 100 cm of soil surface defines this soil class. Young soils with little profile development. Cold temperatures and frozen conditions for much of the year slow the process of soil formation. May show evidence of cryoturbation. physical disturbance of soil material caused by freezing and thawing. ";
        x[47][0] = "Soils from Regions of Climatic Extremes"; x[47][1] = "Tropical Regions (Oxisols and Laterites. Ultisols and Bauxite. feric bearing clay minerals or aluminium bearing clay minerals), Arid Regions (Aridisols and Caliche. carbonate rich soils), Permafrost Regions (Gelisols)";
        x[48][0] = "Subdividing Soil Orders into Suborders is based on "; x[48][1] = "soil moisture regimes, soil temperature regimes";
        x[49][0] = "Soil Moisture Regimes"; x[49][1] = "(refers to the presence or absence of water saturated conditions or plant-available soil water at a defined section of the soil (control section)";
        x[50][0] = "Aquic"; x[50][1] = "soils with saturated horizons";
        x[51][0] = "Aridic"; x[51][1] = "arid climates; dry in all portions of profile most of the time";
        x[52][0] = "Udic"; x[52][1] = "humid climates; moisture usually exceeds evapotranspiration";
        x[53][0] = "Ustic"; x[53][1] = "between aridic and udic (sufficient moisture for crop growth)";
        x[54][0] = "Xeric"; x[54][1] = "Mediterranean climates; cool, moist winters and hot dry summers";
        x[55][0] = "Temperature regimes "; x[55][1] = "(Based on mean tempt. differences of soils at 50 cm depth)";
        x[56][0] = "Pergelic"; x[56][1] = "MAST < 0 ºC permafrost";
        x[57][0] = "Cryic"; x[57][1] = "0 ºC – 8 ºC, summer Temp <15 ºC ";
        x[58][0] = "Frigid"; x[58][1] = "0 < 8 ºC (has warmer summers)";
        x[59][0] = "Mesic"; x[59][1] = "8 < 15 ºC ";
        x[60][0] = "Thermic"; x[60][1] = "15  to 22 ºC";
        x[61][0] = "Hyperthermic"; x[61][1] = "MAST > 22 ºC ";
        x[62][0] = "paleosol"; x[62][1] = "ancient soil";
        x[63][0] = "we can look at the different soil profiles within the layers of the ground to tell info bout it and shit."; x[63][1] = "";
        x[64][0] = "sols can lithify and form sedimentary rocks that have the same soil profile within the rock."; x[64][1] = "";
        x[65][0] = "MAST"; x[65][1] = "mean annual soil temperature";
        x[66][0] = "Ustolls"; x[66][1] = "dry Mollisols (Mollisols with Ustic moisture regime)";
        x[67][0] = "Udults"; x[67][1] = "moist Ultisols (Ultisols with Udic moisture regime)";
        x[68][0] = "Aquents"; x[68][1] = "wet Entisols (Entisols with aquic moisture regimes)";
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