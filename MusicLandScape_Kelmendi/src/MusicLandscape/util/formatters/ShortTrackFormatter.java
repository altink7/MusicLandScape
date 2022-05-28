package MusicLandscape.util.formatters;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyFormatter;

public class ShortTrackFormatter implements MyFormatter<Track> {


    public ShortTrackFormatter(){

    }

    @Override
    public String header() {
        return null;
    }

    @Override
    public String format(Track track) {
        return null;
    }

    @Override
    public String topSeparator() {
        return null;
    }

    @Override
    public String toString() {
        return "ShortTrackFormatter{}";
    }
}
