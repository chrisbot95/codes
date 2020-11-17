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
        x[0][0] = "Weather:"; x[0][1] = "The physical conditions (temperature, pressure, moisture content wind velocity & direction) of the atmosphere at a given time and location.";
        x[1][0] = "Climate:"; x[1][1] = "The average weather conditions during the year.";
        x[2][0] = "look at the graph"; x[2][1] = "";
        x[3][0] = "whats the main reason for earths fluctuation in climate temperature?"; x[3][1] = "how much carbon is in the atmosphere as CO2 and CH4 (greenhouse gases)";
        x[4][0] = "with cycling of rock through tectonic motions >"; x[4][1] = "we cycle the carbon compounds from the earth into the atmosphere and then back into the earth";
        x[5][0] = "the change in the amount of greenhouse gases in the atmosphere goes at a rate comparable to"; x[5][1] = "tectonic events";
        x[6][0] = "at around 650,000 years ago, the cycle of warm/cold climates >"; x[6][1] = "slowed down and changes became more instense";
        x[7][0] = "before 650,000 years ago we have"; x[7][1] = "faster cycling with less intense changes";
        x[8][0] = "after 650,000 years ago we have"; x[8][1] = "slower cycling with more intense changes";
        x[9][0] = "before 650,000 years ago we go from warm to cold every"; x[9][1] = "40,000 years";
        x[10][0] = "after 650,000 years ago we go from warm to cold every"; x[10][1] = "100,000 years";
        x[11][0] = "the beginning of the quaternary period was about"; x[11][1] = "2 million years ago";
        x[12][0] = "milankovitch cycles"; x[12][1] = "the orbit of the earth switches from being more elliptical to more circular every 100,000 years";
        x[13][0] = "obliquity cycle"; x[13][1] = "the tilt of the earth on its axis, every 41 thousand years it points at a different angle";
        x[14][0] = "precession of the equinoxes"; x[14][1] = "19 and 23 k.y. the earth wobbles and changes which direction the axis is pointing, wobbles like a top";
        x[15][0] = "if you add the lines created by all them cycles, its similar looking to the oxygen isotope ratio graph from cores taken out of the ocean floor"; x[15][1] = "";
        x[16][0] = "glaciers to no glaciers periods are driven by"; x[16][1] = "how the earth orbits around the sun";
        x[17][0] = "we can predict where the climate is going by these cycle shits, >"; x[17][1] = "the earth is still currently cooling, and it will stop cooling ";
        x[18][0] = "8,000 years ago > "; x[18][1] = "the earth started to cool down";
        x[19][0] = "10,000 years from now > "; x[19][1] = "the earth will have a warm period";
        x[20][0] = "the atmosphere composition is roughly"; x[20][1] = "78 percent Nitrogen, 21 percent Oxygen, trace amounts of greenhouse gases. oxygen and hygrogen are also a greenhouse gas";
        x[21][0] = "what are the greenhouse gases?"; x[21][1] = "O2(can mix with hydrogen), CO2, CH4(methane), N2O(nitris oxide), H2(hydrogen, can mix with oxygen)";
        x[22][0] = "O2O3 ="; x[22][1] = "the ozone layer, blocks short damaging short wavelengths of light";
        x[23][0] = "the greenhouse gases block shorter wavelengths of light,"; x[23][1] = "the heat gets bounced back and the earth warms up";
        x[24][0] = "the carbon cycle"; x[24][1] = "CO2 can be stored in the lithosphere as oil gas or coal, can be in atmosphere, trapped in biosphere (plants and animals), they can also be dissolved in the water.";
        x[25][0] = ""; x[25][1] = "it can get trapped in the plants, oceans, deposited as sediments, start making limestone, marble, coal, dolostone.> the greenhouse blanket gets thinned. tectonics can put the gasses back into the atmosphere. volcanos can take the co2 in the lithosphere and put it into the atmosphere.";
        x[26][0] = "tree ring data shows"; x[26][1] = "over the past 150 years the temperatures have skyrocketed";
        x[27][0] = "the amount of co2 in our atmosphere now is"; x[27][1] = "412 ppm";
        x[28][0] = "the amount of methane in our atmosphere now is"; x[28][1] = "1872 ppm";
        x[29][0] = "the temperatures and green house gases started rising at"; x[29][1] = "around 1850";
        x[30][0] = "ipcc"; x[30][1] = "intergovernmental panel on climate change";
        x[31][0] = "RCPs"; x[31][1] = "representative concentration pathways. The recent metric to model how civilizations will behave when estimating future climate change scenarios.";
        x[32][0] = "Instead of rationalizing behavior, scientists now just use a"; x[32][1] = "series of forcing values:";
        x[33][0] = "once you put carbon dioxide into the atmosphere it stays there for about "; x[33][1] = "200 years";
        x[34][0] = "methane dissapears in about "; x[34][1] = "20-30 years";
        x[35][0] = "which of the models are we gonna follow"; x[35][1] = "";
        x[36][0] = "in the worst case scenario we expect the rising of the damned"; x[36][1] = "sea";
        x[37][0] = "with more CO2 in the atmosphere, the oceans absorb more and create"; x[37][1] = "carbonic acid, makes the water more acidic.";
        x[38][0] = "sea levels are going to rise at least a foot and a half best case scenario by"; x[38][1] = "2100";
        x[39][0] = "all countries signed the paris agreement at first except for"; x[39][1] = "The united states, Nicaragua, Syria";
        x[40][0] = "nicaragua and syria ended up signing"; x[40][1] = "the paris agreement";
        x[41][0] = "A special report put out by the IPCC in 2018 recommended four pathways to try to keep total global warming to"; x[41][1] = "1.5°C.";
        x[42][0] = "Communities:"; x[42][1] = "Climate change creates new risks and exacerbates existing vulnerabilities in communities across the United States, presenting growing challenges to human health and safety, quality of life, and the rate of economic growth.";
        x[43][0] = "Economy:"; x[43][1] = "Without substantial and sustained global mitigation and regional adaptation efforts, climate change is expected to cause growing losses to American infrastructure and property and impede the rate of economic growth over this century.";
        x[44][0] = "Interconnected Impacts:"; x[44][1] = "Climate change affects the natural, built, and social systems we rely on individually and through their connections to one another. These interconnected systems are increasingly vulnerable to cascading impacts that are often difficult to predict, threatening essential services within and beyond the Nation’s borders.";
        x[45][0] = "Actions to Reduce Risk:"; x[45][1] = "Communities, governments, and businesses are working to reduce risks from and costs associated with climate change by taking action to lower greenhouse gas emissions and implement adaptation strategies. While mitigation and adaptation efforts have expanded substantially in the last four years, they do not yet approach the scale considered necessary to avoid substantial damages to the economy, environment, and human health over the coming decades.";
        x[46][0] = "Water:"; x[46][1] = "The quality and quantity of water available for use by people and ecosystems across the country are being affected by climate change, increasing risks and costs to agriculture, energy production, industry, recreation, and the environment.";
        x[47][0] = "Health:"; x[47][1] = "Impacts from climate change on extreme weather and climate-related events, air quality, and the transmission of disease through insects and pests, food, and water increasingly threaten the health and well-being of the American people, particularly populations that are already vulnerable.";
        x[48][0] = "Indigenous Peoples:"; x[48][1] = "Climate change increasingly threatens Indigenous communities’ livelihoods, economies, health, and cultural identities by disrupting interconnected social, physical, and ecological systems.";
        x[49][0] = "Ecosystems and Ecosystem Services:"; x[49][1] = "Ecosystems and the benefits they provide to society are being altered by climate change, and these impacts are projected to continue. Without substantial and sustained reductions in global greenhouse gas emissions, transformative impacts on some ecosystems will occur; some coral reef and sea ice ecosystems are already experiencing such transformational changes.";
        x[50][0] = "Agriculture and Food:"; x[50][1] = "Rising temperatures, extreme heat, drought, wildfire on rangelands, and heavy downpours are expected to increasingly disrupt agricultural productivity in the United States. Expected increases in challenges to livestock health, declines in crop yields and quality, and changes in extreme events in the United States and abroad threaten rural livelihoods, sustainable food security, and price stability.";
        x[51][0] = "Infrastructure:"; x[51][1] = "Our Nation’s aging and deteriorating infrastructure is further stressed by increases in heavy precipitation events, coastal flooding, heat, wildfires, and other extreme events, as well as changes to average precipitation and temperature. Without adaptation, climate change will continue to degrade infrastructure performance over the rest of the century, with the potential for cascading impacts that threaten our economy, national security, essential services, and health and well-being.";
        x[52][0] = "Oceans and Coasts:"; x[52][1] = "Coastal communities and the ecosystems that support them are increasingly threatened by the impacts of climate change. Without significant reductions in global greenhouse gas emissions and regional adaptation measures, many coastal regions will be transformed by the latter part of this century, with impacts affecting other regions and sectors. Even in a future with lower greenhouse gas emissions, many communities are expected to suffer financial impacts as chronic high-tide flooding leads to higher costs and lower property values.";
        x[53][0] = "Tourism and Recreation:"; x[53][1] = "Outdoor recreation, tourist economies, and quality of life are reliant on benefits provided by our natural environment that will be degraded by the impacts of climate change in many ways.";
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