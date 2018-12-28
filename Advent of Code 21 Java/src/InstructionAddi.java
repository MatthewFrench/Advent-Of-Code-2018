public class InstructionAddi extends Instruction {
    public void Run(final int[] beforeStates, final int[] afterStates, final int A, final int B, final int C) {
        //stores into register C the result of adding register A and value B.
        afterStates[C] = beforeStates[A] + B;
    }
}