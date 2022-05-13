package MusicLandscape.entities;

public class Album extends Release{
public TrackListItem trackListHead ;

public Album(){

}

public Album(Album other){
    this.trackListHead=other.trackListHead;
    this.artist=new Artist(other.artist);
    this.title=other.title;
    this.year=other.year;
}

public Album(String title1, Artist artist1, int year1){
    Track t=new Track();
    t.setTitle(title1);
    t.setPerformer(artist1);
    t.setYear(year1);
    trackListHead=new TrackListItem(t);
}

public boolean addTrack(Track t){
    if(t!=null){
        TrackListItem neu = new TrackListItem(t);

        if (trackListHead == null) {
            trackListHead = neu;
        } else {
            TrackListItem current = trackListHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = neu;
        }
        return true;
    }
    return false;
}

public TrackListItem getTrackListItem(int idx){
    TrackListItem x =trackListHead;
    for(int i=0; i < idx; i++){
        x = x.next;
    }
    return x;
}

public Track removeTrack(int idx){
    TrackListItem x =getTrackListItem(idx-1);
    TrackListItem y =getTrackListItem(idx+1);

    Track deleted =new Track(getTrackListItem(idx).track);

    if(idx==0){
        trackListHead=trackListHead.next;
    }
    else{
        x.next=y;
    }

    return deleted;
}

public int nrTracks(){
    int count=0;
    TrackListItem x =trackListHead;
    while(x!=null){
        x=x.next;
    }
    return count;
}

public Track[] getTracks(){
    Track[] x = new Track[nrTracks()];
    for(int i=0;i<x.length;i++){
        x[i]=getTrackListItem(i).track;
    }
    return x;
}

    @Override
    public int totalTime() {
        return 0;
    }

    @Override
    public String toString() {
        return "Album{" +
                "trackListHead=" + trackListHead +
                ", artist=" + artist +
                ", year=" + year +
                ", title='" + title + '\'' +
                '}';
    }
}
