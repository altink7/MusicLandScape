package MusicLandscape.entities;

public class TrackListItem {
Track track;
TrackListItem next;

TrackListItem(Track track){
    this.track=new Track(track);
}
}
