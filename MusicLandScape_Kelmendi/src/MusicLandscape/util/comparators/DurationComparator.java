package MusicLandscape.util.comparators;

import MusicLandscape.entities.Track;

public class DurationComparator implements java.util.Comparator<Track> {

    public DurationComparator(){
    }


    public int compare(Track t1, Track t2) {
        return t1.getDuration()-t2.getDuration();
    }

    @Override
    public String toString() {
        return "by duration";
    }
}
