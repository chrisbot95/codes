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
        x[0][0] = "stack frame has"; x[0][1] = "local variables, passed parameters, pointers that connect current method to previous method, User computed stack, grows and shrinks as the user executes the method> addresses grow up. each method has one of these units in the so called stack, stack of methods, each method contains a computed stack that grows and shrinks";
        x[1][0] = "stack frames are"; x[1][1] = "generally 32 bit words I guess";
        x[2][0] = "the program is in a different"; x[2][1] = "part of memory, whos addresses are given by bytes, which I think are 8 bits";
        x[3][0] = "the program is made up of"; x[3][1] = "4 8 bit memory locations????";
        x[4][0] = "the role of each byte in the invoke ,program,"; x[4][1] = "the first m[r-1] is for the opcode, m[r] and m[r+1] is for the 16 bit address, then m[r+2] is the opcode for the next instruction";
        x[5][0] = "LV register points towards the"; x[5][1] = "bottom of the stack frame, m[base]";
        x[6][0] = "SP register points towards the"; x[6][1] = "top of the stack frame with the user computed stack";
        x[7][0] = "LV points to the bottom of the stack, how does that then give you the local variables?"; x[7][1] = "at the bottom of the stack will be a pointer to another place in memory that has the local variables below";
        x[8][0] = "PC points to the next instruction but"; x[8][1] = "the address is a single byte address, it holds the next byte after the current byte, might not be an instruction opcode, could be data for the current instruction";
        x[9][0] = "TOS stands for"; x[9][1] = "top of stack";
        x[10][0] = "the value at the top of the stack must also be in a register labeled"; x[10][1] = "TOS";
        x[11][0] = "CPP means"; x[11][1] = "Constant pool pointer";
        x[12][0] = "jump multiplexer used for conditional branches is used for"; x[12][1] = "loading jump addresses into micropc which has the address for the next microinstruction referencing where in the microstore the microprogram should execute next";
        x[13][0] = "MBR is like the"; x[13][1] = "instruction register except it just contains a byte of memory(memory byte register)(8bits)";
        x[14][0] = "OPC ="; x[14][1] = "a kind of scratch pad register, other times used to hold the previous pc";
        x[15][0] = "the b bus can be loaded by any of the registers, where does the a bus come from? "; x[15][1] = "The H register, if you need to carry out an operation, the a bus needs to be loaded from the H register";
        x[16][0] = "after the data leaves the alu it passes through"; x[16][1] = "an external shifting unit(shifter) which shifts based on the input from the alu part of the instruction?";
        x[17][0] = "The result of the alu goes out on the "; x[17][1] = "C bus, back around into any of the registers, except mbr, only loaded from memory not from register(mbr holds next instruction op code, or data for the current inst)";
        x[18][0] = "the microinstructions have a different formatt from the h1>"; x[18][1] = "address field for microstore, condition codes for jumps which interacts with the n and z bits to determin whether or not there will be a jump, alu operations(2 lines go to the shifter, 6 lines go to the alu for operations(the alu is more complicated than the h1)...lines for which register to use for the destination of the c bus(c field), no a field or b field. a signal that activates one of the registers for loading onto the b bus. signals for rd wr, and fetch (read gets full word of memory using the address in mar, reading data into mdr) wr is opposite. Fetch retrieves next byte of memory and loads to mbr. on this machine the instructions are not full words, they are bytes and we fetch them into mbr";
        x[19][0] = "stack machine ="; x[19][1] = "adding two numbers will use stack for both operands, both operands have to be pushed, then the instruction can just be an op code(add) one byte op code that says add without any variables in the instruction";
        x[20][0] = "main 1 is"; x[20][1] = "the first microinstruction that acts as the fetch instruction";
        x[21][0] = "main1 = "; x[21][1] = "PC=PC+1; fetch, goto(MBR)";
        x[22][0] = "tHE OP CODE in mbr is used as a"; x[22][1] = "microstore address";
        x[23][0] = "the op code these 8bits give the microstore address of the microcode to execute this op code, no decoding needed"; x[23][1] = "fuck this guy";
        x[24][0] = "IADD(Integer add)all I shits"; x[24][1] = "in preperation,";
        x[25][0] = "true or false, this machine has or built in"; x[25][1] = "true";
        x[26][0] = "you can load both the mar and sp using the c bus, maybe at the same time"; x[26][1] = "";
        x[27][0] = "addition is a bitch"; x[27][1] = "u rite";
        x[28][0] = "the TOS variable gets loaded into the H register to then get loaded into the alu through the c bus"; x[28][1] = "";
        x[29][0] = "the result of the alu add operation has to go to "; x[29][1] = "mdr in preparation for the write to stack, and we also need to put the result in TOS aswell since it will be written to the top of the stack";
        x[30][0] = "IFEQ"; x[30][1] = "3 byte instruction, may be a jump, jump is given in 2 parts in a 2 byte offset to be combined into a single offset value";
        x[31][0] = "IFEQ compares"; x[31][1] = "numbers to 0, it can also compare two numbers by subtracting them to see if the result is 0, which would mean they are the same value";
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
                    if(x[z[i]][j]!=null){
                        System.out.print(x[z[i]][j]); 
                        n = user.nextLine();
                    }
                }
                System.out.println();
            }
        }
    }
}