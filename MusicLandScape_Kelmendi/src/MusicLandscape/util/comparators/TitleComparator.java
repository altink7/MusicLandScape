package MusicLandscape.util.comparators;

import MusicLandscape.entities.Track;

public class TitleComparator implements java.util.Comparator<Track> {

    public TitleComparator(){

    }
    @Override
    public int compare(Track t1, Track t2) {
        return t1.getTitle().toUpperCase().charAt(0) - t2.getTitle().toUpperCase().charAt(0);
    }

    @Override
    public String toString() {
        return "TitleComparator{}";
    }
}
