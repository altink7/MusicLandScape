package MusicLandscape.util.formatters;

import MusicLandscape.entities.Track;
import MusicLandscape.entities.TrackListItem;
import MusicLandscape.util.MyFormatter;

public class ShortTrackFormatter implements MyFormatter<Track> {


    public ShortTrackFormatter(){

    }

    @Override
    public String header() {
        return "Title      (min:sec)";
    }

    @Override
    public String format(Track track) {

        return String.format("%-10s (%02d:%02d)",(track.getTitle().length()>9?track.getTitle().substring(0,10):track.getTitle())
                ,track.getDuration()/60,track.getDuration()%60);
    }

    @Override
    public String topSeparator() {
        return "--------------------";
    }

    @Override
    public String toString() {
        return "short format [Title (min:sec)]";
    }
}
