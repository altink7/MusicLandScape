package MusicLandscape.entities;

public class Album extends Release{
public TrackListItem trackListHead ;

Album(){

}

Album(Album other){
    this.trackListHead=other.trackListHead;
}

Album(String title, Artist artist, int year){
    Track t=new Track(title);
    t.setPerformer(artist);
    t.setYear(year);
    trackListHead=new TrackListItem(t);
}

public boolean addTrack(Track track){
    TrackListItem neu = new TrackListItem(track);

    if(trackListHead== null){
        trackListHead = neu;
    }
    else{
        TrackListItem current = trackListHead;
        while(current.next != null) {
            current = current.next;
        }
        current.next = neu;
    }
    return true;
}

public Track removeTrack(int idx){
    TrackListItem x =trackListHead;
    for(int i=0; i < idx-1; i++){
        x = x.next;
    }
    TrackListItem y =trackListHead;
    for(int i=0; i < idx+1; i++){
        y = y.next;
    }
    TrackListItem z =trackListHead;
    for(int i=0; i < idx; i++){
        z = z.next;
    }
    Track deleted =new Track(z.track);

    if(idx==0){
        trackListHead=trackListHead.next;
    }
    else{
        x.next=y;
    }

    return deleted;
}

    @Override
    int totalTime() {
        return 0;
    }
}
