package record;

public class MusicComposion implements Comparable<MusicComposion> {
    private int duration;
    private Style style;

    public MusicComposion(int duration, Style style) {
        this.duration = duration;
        this.style = style;
    }

    @Override
    public int compareTo(MusicComposion mc) {
        return this.style.name().compareTo(mc.style.name());
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "{" +
                "duration=" + duration +
                ", style=" + style +
                '}';
    }
}
