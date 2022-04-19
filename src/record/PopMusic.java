package record;

public class PopMusic extends MusicComposion {
    private boolean europePop;

    public PopMusic(int duration, boolean europePop) {
        super(duration, Style.POP);
        this.europePop = europePop;
    }

    @Override
    public String toString() {
        return "Pop music " + super.toString();
    }
}
