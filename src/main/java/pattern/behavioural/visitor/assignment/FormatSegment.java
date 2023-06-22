package pattern.behavioural.visitor.assignment;

public class FormatSegment extends Segment implements Plugin{
    @Override
    public void apply(AudioFilter audioFilter) {
        audioFilter.filter(this);
    }
}
