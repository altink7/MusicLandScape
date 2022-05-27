package MusicLandscape.util.matcher;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyMatcher;

public class DurationMatcher extends MyMatcher<Track> {

    /**
     * Creates a Matcher object with a specified pattern.<br>
     *
     * @param pat the pattern of this matcher
     */
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

}
