package record;

import sheffpovar.Calculatable;
import sheffpovar.Printable;
import sheffpovar.Sortable;

import java.util.Arrays;

public class CompactDisk implements Calculatable, Sortable, Printable {

    private MusicComposion[] musicComposions;

    public CompactDisk(MusicComposion[] musicComposions) {
        this.musicComposions = musicComposions;
    }

    @Override
    public int calculate() {
        int fullDuration = 0;

        for (MusicComposion composion : musicComposions) {
            fullDuration += composion.getDuration();
        }

        return fullDuration;
    }

    /*
     * Rap, Jazz, Pop -> Jazz, Rap, Pop
     * Jazz, Rap, Pop -> Rap.compareTo(Pop) -> Jazz, Pop, Rap
     * */

    @Override
    public void sort() {//Rap, Jazz, Pop -> Rap.compareTo(Jazz)
        Arrays.sort(musicComposions);
    }

    @Override
    public void printByRange(int from, int to) {
        for (MusicComposion composion : musicComposions) {
            int duration = composion.getDuration();
            if (duration > from && duration < to) {
                System.out.println(composion);
            }
        }
    }

    @Override
    public void printAll() {
        for (MusicComposion composion : musicComposions) {

            System.out.println(composion);

        }
    }
}
