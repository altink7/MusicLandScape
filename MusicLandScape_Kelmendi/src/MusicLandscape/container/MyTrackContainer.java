package MusicLandscape.container;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyMatcher;
import MusicLandscape.util.matcher.DurationMatcher;

import java.util.*;

public class MyTrackContainer {
    List<Track> selection =new ArrayList<>();
    Set<Track> tracks= new HashSet<>();

    public MyTrackContainer() {
    }

    public MyTrackContainer(Iterable<Track> track){
        for (Track value : track) {
            add(value);
            selection.add(value);
        }
    }

    public MyTrackContainer(Track[] track ){
        for (Track value : track) {
            add(value);
            selection.add(value);
        }
    }

    public void sort(Comparator<Track> track, boolean control){
        if(control){
            selection.sort(track);
        }else{
            selection.sort(Collections.reverseOrder());
        }
    }

    public int filter(MyMatcher<Track> matcher){
        int n = 1;

        for (Track track : selection) {
            if (!track.getTitle().contains(matcher.getPattern())) {
                selection.remove(track);
                n++;
            }
        }
        return n;
    }

    public void reset(){
        selection.clear();
        selection.addAll(tracks);
    }

    public int remove(){
        int i=0;

        Set<Track> tracks1 = tracks;
        for (Track track : selection) {
            tracks1.remove(track);
            i++;
        }

        reset();

       return i;
    }

    public int addAll(Track[] t){
        tracks.addAll(Arrays.asList(t));
        return t.length;
    }

    public int size(){
        return tracks.size();
    }

    public Track[] selection(){
        return selection.toArray(new Track[0]);
    }

    public boolean add(Track track){
        if(track!=null && !tracks.contains(track)) {
            tracks.add(track);
            return true;
        }
        return false;
    }
}
