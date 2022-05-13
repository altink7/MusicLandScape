package MusicLandscape.util.formatters;

import MusicLandscape.entities.Track;

public class MyCSVTrackFormatter extends MyTrackFormatter {

    @Override
    public String format(Track t) {
        int x=t.getYear();
        if(t.getYear()==0){
            x=1900;
        }
        return String.format("%s,%s,%s,%d,%d;", t.getTitle(), t.getPerformer(), t.getWriter(), x, t.getDuration());

    }

}