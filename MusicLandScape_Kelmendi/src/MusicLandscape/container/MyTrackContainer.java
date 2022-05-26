package MusicLandscape.container;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyMatcher;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class MyTrackContainer {
    Set<Track> tracks;
    List<Track> selection;

    public MyTrackContainer(){

    }

    public MyTrackContainer(Iterable<Track>){

    }

    public MyTrackContainer(Track[] track ){

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

    public int addAll(Track[] tracks){
        return 0;
    }

    public int size(){
        return 0;
    }

    public Track[] selection(){
        return new Track[1];
    }

    public boolean add(Track){
        return false;
    }
}
