package MusicLandscape.util.matcher;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyMatcher;

public class TitleMatcher extends MyMatcher<Track> {
    private String pattern;

    /**
     * Creates a Matcher object with a specified pattern.<br>
     *
     * @param pat the pattern of this matcher
     */
    public TitleMatcher(String pat) {
        super(pat);
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean matches(Track track) {
        return track.getTitle().matches(pattern + ".*");
    }

    public void setPattern(String pattern) {
        if(pattern!=null) {
            this.pattern = pattern;
        }
    }

    @Override
    public String toString() {
        return "title starts with ("+ pattern + ')';
    }
}
