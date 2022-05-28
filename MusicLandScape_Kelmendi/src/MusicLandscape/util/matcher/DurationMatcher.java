package MusicLandscape.util.matcher;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyMatcher;

public class DurationMatcher extends MyMatcher<Track> {
    private int lower;
    private int upper;

    public DurationMatcher(){
    }

    public DurationMatcher(String pat) {
        super(pat);
    }

    @Override
    public boolean matches(Track track) {
        return false;
    }

    @Override
    public void setPattern(String pat) {

    }

    @Override
    public String getPattern() {
        return null;
    }

    @Override
    public String toString() {
        return "DurationMatcher{" +
                "lower=" + lower +
                ", upper=" + upper +
                '}';
    }
}
