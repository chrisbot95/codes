import java.util.Random;
import java.util.Scanner;
class glaciers{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner user = new Scanner(System.in);
        String[][] x = new String[80][2];
        int length=78;
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
        x[0][0] = "glacier:"; x[0][1] = "a large, long-lasting mass of ice, formed on land that moves under the influence of gravity and its own weight";
        x[1][0] = "alpine glaciation"; x[1][1] = "found in mountainous regions";
        x[2][0] = "continental glaciation"; x[2][1] = "exists where a large part of a continent is covered by glacial ice";
        x[3][0] = "where do glaciers develop?"; x[3][1] = "they develop where all of annual snow doesn't melt away in summer(polar regions, heavy winter snowfall, high elevations, 85% of glacial ice is in Antarctica, 10% in greenland)";
        x[4][0] = "ingredients for making glaciers"; x[4][1] = "land, snow, cold summers, gravity, time";
        x[5][0] = "bafen island in canada is a "; x[5][1] = "continental glacier";
        x[6][0] = "north pole"; x[6][1] = "is not a glacier, its over an ocean, if you drill through the ice you hit the ocean. dead ice, floats on top of ocean.";
        x[7][0] = "vostok"; x[7][1] = "the highest point in antarctica";
        x[8][0] = "antarctica "; x[8][1] = "the south pole ice is a glacier, two different ice sheets.";
        x[9][0] = "east antarctica ice sheet"; x[9][1] = "is 2 thirds of antarctica with a mountain range inbetween";
        x[10][0] = "west antarctica ice sheet"; x[10][1] = "is one third of antarctica with a mountain range inbetween";
        x[11][0] = "the antarctica ice sheets operate >"; x[11][1] = "independently of one another";
        x[12][0] = "there is an actual pole where the south pole used to be on antarctica, but it has moved off of the south pole, and we have yet to place it correctly again"; x[12][1] = "";
        x[13][0] = "as you move towards the equator, you need to be higher in elevation to get"; x[13][1] = "glacial ice";
        x[14][0] = "Valley Glacier:"; x[14][1] = "a glacier that is confined to a valley and flows from a higher to a lower elevation; like streams, small valley glaciers may be tributaries to a larger trunk system";
        x[15][0] = "Valley glacier on the flanks of Mount Logan, Canada’s highest mountain"; x[15][1] = "";
        x[16][0] = "Types of Continental Glaciers"; x[16][1] = "Ice Sheet: Ice Cap:";
        x[17][0] = "Ice Sheet:"; x[17][1] = "a mass of ice that is not restricted to a valley but covers a large area of land (over 50,000 square km); Greenland and Antarctica are the only two places on earth to now have ice sheets";
        x[18][0] = "Ice Cap:"; x[18][1] = "a glacier covering a relatively small area of land but not restricted to a valley";
        x[19][0] = "denali national park is a park with a lot of"; x[19][1] = "valley glaciers";
        x[20][0] = "continental glaciers pile up and flow from"; x[20][1] = "where the ice is thickest to where the ice is thinnest";
        x[21][0] = "the snow and ice will be thickest where you get the most"; x[21][1] = "precipitation";
        x[22][0] = "Formation and Growth of Glaciers"; x[22][1] = "New snowfall may be in the form of light powdery snow which consists mostly of air trapped between snowflakes. After a while the snowflakes settle by compaction under their own weight and much of the air between them is driven out.";
        x[23][0] = "snow will turn into ice under"; x[23][1] = "weight, compaction";
        x[24][0] = "snow to ice"; x[24][1] = "snowflakes lose their points, and become granules/granular snow, then it becomes a little more dance, halfway between snow and ice > firn. after firn stage, the granules will weld themselves together";
        x[25][0] = "Ablation/wasted:"; x[25][1] = "under the influence of mass & gravity, glacier ice moves downward (outward) and is eventually lost or wasted by melting or breaking off (calving).";
        x[26][0] = "Icebergs:"; x[26][1] = "calving directly into water";
        x[27][0] = "if a block of ice falls onto land, it becomes"; x[27][1] = "dead ice, since it cant move i guess";
        x[28][0] = "Ablation on top of a glacier."; x[28][1] = "the picture shows a river cutting through ice";
        x[29][0] = "Glacial Budgets"; x[29][1] = "If the amount of snow a glacier gains is greater than the amount of ice and water it loses, the glacier’s budget is positive, if the opposite occurs the glacier’s budget is negative";
        x[30][0] = "advancing glaciers:"; x[30][1] = "glaciers with positive budgets that push outward and downward at their edges";
        x[31][0] = "receding glaciers:"; x[31][1] = "glaciers with negative budgets that grow smaller and their edges melt back";
        x[32][0] = "zone of accumulation:"; x[32][1] = "where we gain material. the upper part of the glacier with a perennial snow cover";
        x[33][0] = "zone of ablation:"; x[33][1] = "the lower part of the glacier where ice is lost";
        x[34][0] = "snow line:"; x[34][1] = "the equillibrium line where we gain as much as we lose. the boundary between these two zones of a glacier; it marks the highest point at which the glacier’s winter snow cover is lost during a melt season";
        x[35][0] = "terminus:"; x[35][1] = "the very end of active ice in a glacier";
        x[36][0] = "if the glacier has a positive budget, the equilibrium line will move"; x[36][1] = "downslope";
        x[37][0] = "if the glacier has a negative budget, the equilibrium line will move"; x[37][1] = "upslope";
        x[38][0] = "Basal sliding:"; x[38][1] = "the sliding of the glacier as a single body over the underlying rock (warm-based glaciers).";
        x[39][0] = "Plastic flow:"; x[39][1] = "movement that occurs within the glacier due to the plastic deformation of the ice itself (cold-based glaciers).";
        x[40][0] = "Rigid zone:"; x[40][1] = "the upper part of the glacier (brittle deformation).";
        x[41][0] = "with enough stress on the ice, we can crack it and get"; x[41][1] = "cravases";
        x[42][0] = "the cravases go down only as far as"; x[42][1] = "the rigid zone and stops at the plastic zone";
        x[43][0] = "the middle of the glaciers move"; x[43][1] = "quicker because they have less friction as they arent rubbing up against the sides of mounatins and shit";
        x[44][0] = "fluffy snow stays in cravases because"; x[44][1] = "the cravase protects the snow from sunlight";
        x[45][0] = "Glacial Erosion Under glacier"; x[45][1] = "Abrasion & plucking. Bedrock polished & striated. Rock flour washes out of glacier. Polishing and rounding. Striations- scratches & grooves on rock";
        x[46][0] = "Glacial Erosion above glacier"; x[46][1] = "Frost wedging takes place. Erosion by glaciers steepens slopes";
        x[47][0] = "Abrasion & plucking"; x[47][1] = "the glacier has pressure at bottom and can freeze onto the rock, if the ice tries to move and the rock is weak/has fracture, it can carry that rock up and if that rock continues to slide it can scratch the bedrock";
        x[48][0] = "Bedrock polished & striated"; x[48][1] = "remove the material from any rock the glaciers flowing over, grind it up into silt and clay, we call rock flour. rock flour gets mixed with ice and its like sand paper, it moves over bed rock and polishes it ";
        x[49][0] = "Striations- scratches & grooves on rock"; x[49][1] = "big rock leaves marks";
        x[50][0] = "Frost wedging takes place"; x[50][1] = "freezing and thawing breaking rocks apart I think he means";
        x[51][0] = "Erosion by glaciers steepens slopes"; x[51][1] = "glacier can cut into base of cliff, causing cliff to weaken and then we get landslides onto the glacier";
        x[52][0] = "with the crescent shaped dents we can tell which direction the glacier moved >"; x[52][1] = "towards the deeper ends of the dent";
        x[53][0] = "u-shaped valley:"; x[53][1] = "characteristic cross-profile of a valley carved by glacial erosion";
        x[54][0] = "hanging valley:"; x[54][1] = "a smaller valley that terminates abruptly high above a main valley";
        x[55][0] = "truncated spurs:"; x[55][1] = "ridges that have triangular facets produced by glacial erosion at their lower ends";
        x[56][0] = "rock-basin lakes (tarns):"; x[56][1] = "a lake occupying a depression caused by glacial erosion of bedrock";
        x[57][0] = "cirque:"; x[57][1] = "a steep-sided, half-bowl shaped recess carved into a mountain at the head of a glacial valley. bowls where snow first accumulated to make the glacier";
        x[58][0] = "horn:"; x[58][1] = "the sharp peak that remains after cirques have cut back into a mountain on several sides";
        x[59][0] = "arête:"; x[59][1] = "sharp ridges that separate adjacent glacially carved valleys";
        x[60][0] = "glaciers create more ____ shaped valleys"; x[60][1] = "U shaped";
        x[61][0] = "sometimes little lakes can form in ____ valleys"; x[61][1] = "glacial valleys";
        x[62][0] = "Till:"; x[62][1] = "the unsorted and unlayered rock debris carried or deposited by a glacier.";
        x[63][0] = "Outwash:"; x[63][1] = "sorted sediment deposited in front of the glacier by meltwater.";
        x[64][0] = "Erratic:"; x[64][1] = "an ice-transported boulder that has not been derived from the nearby bedrock.";
        x[65][0] = "Moraines:"; x[65][1] = "a body of till either being carried on a glacier or left behind after a glacier has receded";
        x[66][0] = "ground moraine:"; x[66][1] = "a blanket of till deposited by a glacier or released as glacier ice melted ";
        x[67][0] = "lateral moraines:"; x[67][1] = "elongate mounds of till which form along the sides of a valley glacier";
        x[68][0] = "medial moraine:"; x[68][1] = "a single long ridge of till on a glacier, formed by adjacent lateral moraines joining and being carried downglacier";
        x[69][0] = "end moraine:"; x[69][1] = "a ridge of till piled up along the front edge of a glacier";
        x[70][0] = "terminal moraine:"; x[70][1] = "the farthest end moraine";
        x[71][0] = "resessional moraines"; x[71][1] = "form when the glacer recesses";
        x[72][0] = "the longer we have a neutral budget>"; x[72][1] = "the bigger the pile of moraine at the end of the glacier";
        x[73][0] = "moraines are made usually of >"; x[73][1] = "poorly sorted material";
        x[74][0] = "Drumlins:"; x[74][1] = "landforms shaped into streamlined hills. You never know what’s inside until you look!";
        x[75][0] = "Esker:"; x[75][1] = "a long, sinuous ridge of sediment deposited by a river under a glacier. water cuts into the ice easier so it makes an inverted channel, it cuts through the ice instead of the rock below";
        x[76][0] = "Kettle:"; x[76][1] = "a depression caused by the melting of a calved ice-block that was buried in outwash. (May or may not for a small, round lake.)";
        x[77][0] = "you never find just one drumlin, you always find"; x[77][1] = "a bunch like a pack of pumpkins";
        x[78][0] = ""; x[78][1] = "";
        x[79][0] = ""; x[79][1] = "";
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