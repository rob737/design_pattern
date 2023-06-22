package pattern.behavioural.visitor.assignment;

public class AssignmentDriver {
    public static void main(String[] args) {
        WavFile wavFile = WavFile.read("test.mav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new NormalizeFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new CompressFilter());
    }
}
