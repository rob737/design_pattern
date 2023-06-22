package pattern.behavioural.visitor.assignment;

public class CompressFilter implements AudioFilter{
    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Compressed : " + factSegment);
    }

    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Compressed : " + formatSegment);
    }
}
