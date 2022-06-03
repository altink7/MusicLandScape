package MusicLandscape.util.formatters;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyFormatter;

public class CSVTrackFormatter implements MyFormatter<Track> {

    @Override
    public String header() {
        return "Title      (min:sec)";
    }

    @Override
    public String format(Track t) {
        int x=t.getYear();
        if(t.getYear()==0){
            x=1900;
        }
        return String.format("%s, %s, %s, %d, %d\n", t.getTitle(), t.getWriter(),t.getPerformer(),   t.getDuration(),x);

    }

    @Override
    public String topSeparator() {
        return "--------------------";
    }

}