package pattern.behavioural.visitor.assignment;

public class NormalizeFilter implements AudioFilter {
    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Normalize : " + factSegment);
    }

    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Normalize : " + formatSegment);
    }
}
