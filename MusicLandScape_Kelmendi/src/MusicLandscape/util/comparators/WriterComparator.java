package MusicLandscape.util.comparators;

import MusicLandscape.entities.Track;

public class WriterComparator implements java.util.Comparator<Track>{


    public WriterComparator() {
    }

    @Override
    public int compare(Track o1, Track o2) {
        return o1.getWriter().compareTo(o2.getWriter());
    }

    @Override
    public String toString() {
        return "by writer";
    }
}
