package MusicLandscape.container;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyMatcher;
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
        int n = 0;

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
        int n=selection.size();
        reset();
        return n;
    }

    public int addAll(Track[] t){
        tracks.addAll(Arrays.asList(t));
        return t.length;
    }

    public int size(){
        return tracks.size();
    }

    public Track[] selection(){
        Track[] t= selection.toArray(new Track[0]);
        return t;
    }

    public boolean add(Track track){
        if(track!=null && !tracks.contains(track)) {
            tracks.add(track);
            return true;
        }
        return false;
    }
}
