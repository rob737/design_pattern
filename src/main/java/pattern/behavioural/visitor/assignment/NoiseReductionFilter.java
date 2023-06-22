package pattern.behavioural.visitor.assignment;

public class NoiseReductionFilter implements AudioFilter {
    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Reduce noise : " + factSegment);
    }

    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Reduce noise : " + formatSegment);
    }
}
