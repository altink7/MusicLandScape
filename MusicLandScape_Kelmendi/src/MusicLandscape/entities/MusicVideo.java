package MusicLandscape.entities;

public class MusicVideo extends Release{

    private Track track;

    public MusicVideo(){

    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    @Override
    public int totalTime() {
        return track.getDuration();
    }

    @Override
    public String toString() {

        return (title==null?"unknown":title)+"-"+(artist==null?"unknown":artist)+"-"+(year==0?"unknown":year)+"-0-(Video)";
    }
}
