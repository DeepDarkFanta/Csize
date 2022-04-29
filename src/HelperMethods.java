public class HelperMethods{
    Memory memo = new Memory();
    public int setMemory(){
        if (memo.memory[memo.memory.length - 1] == 1){
            return 0;
        }else if (memo.memory[0] == 0){
            memo.memory[0] = 1;
            return 1;
        }
        int g = 1;
        while (memo.memory[g] != 0){
            g++;
        }
        memo.memory[g] = 1;
        return g;
    }
}
