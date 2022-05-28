package MusicLandscape.util.matcher;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyMatcher;

public class DurationMatcher extends MyMatcher<Track> {
    private int lower;
    private int upper;

    public DurationMatcher(){
        lower=0;
        upper=Integer.MAX_VALUE;
    }

    public DurationMatcher(String pat) {
        setPattern(pat);
    }

    @Override
    public boolean matches(Track track) {
        return(track.getDuration()>=lower&&track.getDuration()<=upper);
    }

    @Override
    public void setPattern(String pat) {

            String[] num = pat.split(" ");

            if(num[0].matches("\\d") ||num[1].matches("\\d")|| num[0].equals(num[1])) {

                this.upper = Integer.MAX_VALUE;
                this.lower = Integer.parseInt(num[0]);

                if (Integer.parseInt(num[1]) >= lower) {
                    this.upper = Integer.parseInt(num[1]);
                }
            }else{
                this.upper = Integer.MAX_VALUE;
                this.lower = 0;
            }



    }

    @Override
    public String getPattern() {
        return lower+" "+upper;
    }

    @Override
    public String toString() {
        return "duration in range (" + lower +
                " " + upper +
                ')';
    }
}
