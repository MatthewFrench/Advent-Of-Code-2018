public class InstructionGtir extends Instruction {
    public void Run(Sample s) {
        //sets register C to 1 if value A is greater than register B.
        // Otherwise, register C is set to 0.
        s.AfterRegisterStates[s.C] = s.A > s.BeforeRegisterStates[s.B] ? 1 : 0;
    }
    public boolean Matches(Sample s) {
        Sample newSample = new Sample(s);
        Run(newSample);
        if (newSample.OutputMatches(s)) {
            MatchingSamples.add(s);
            return true;
        }
        return false;
    }
    public String GetName() {
        return "InstructionGtir";
    }
}
