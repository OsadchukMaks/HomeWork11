package record;

public class JazzMusic extends MusicComposion {
    private boolean americanJazz;

    public JazzMusic(int duration, boolean americanJazz) {
        super(duration, Style.JAZZ);
        this.americanJazz = americanJazz;
    }

    @Override
    public String toString() {
        return "Jazz music " + super.toString();
    }
}
