package pattern.behavioural.visitor.assignment;

public interface AudioFilter {
    void filter(FactSegment factSegment);
    void filter(FormatSegment formatSegment);
}
