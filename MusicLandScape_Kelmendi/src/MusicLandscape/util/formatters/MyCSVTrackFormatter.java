package MusicLandscape.util.formatters;

import MusicLandscape.entities.Track;

public class MyCSVTrackFormatter extends MyTrackFormatter {

    @Override
    public String format(Track t) {
        return String.format("%10s %10s %10s %10d %10d", t.getTitle(), t.getPerformer(), t.getWriter(), t.getYear(), t.getDuration());

    }

}