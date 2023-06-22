package pattern.behavioural.visitor.assignment;

public class ReverbFilter implements AudioFilter {
    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Add reverb : " + factSegment);
    }

    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Add reverb : " + formatSegment);
    }
}
