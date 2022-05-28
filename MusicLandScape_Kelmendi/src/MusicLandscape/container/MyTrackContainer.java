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

    }

    public int filter(MyMatcher<Track> unfiltered){

        return 0;
    }

    public void reset(){

    }

    public int remove(){
        return 0;
    }

    public int addAll(Track[] t){
        tracks.addAll(tracks);
        return t.length;
    }

    public int size(){
        return tracks.size();
    }

    public Track[] selection(){
        Track[]tal=new Track[size()];
        for (int i=0;i<size();i++){

        }
        return tal;
    }

    public boolean add(Track track){
        if(track!=null) {
            tracks.add(track);
            return true;
        }
        return false;
    }
}
