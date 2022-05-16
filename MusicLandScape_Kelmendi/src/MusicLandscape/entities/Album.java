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

public Album(String title, Artist artist, int year){
    this.title=title;
    this.artist=artist;
    this.year=year;
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

    if(idx>nrTracks()){
        return null;
    }else {
        Track deleted=getTrackListItem(idx).track;

        if (idx == 0) {
            trackListHead = trackListHead.next;
        } else {
            getTrackListItem(idx-1).next = getTrackListItem(idx + 1);
        }
        return deleted;
    }

}

public int nrTracks(){
    int count=0;
    TrackListItem x =trackListHead;
    while(x!=null){
        x=x.next;
        count++;
    }
    return count;
}

public Track[] getTracks(){
    Track[] x = new Track[nrTracks()];
    TrackListItem y=trackListHead;
    int i=0;
    while(y!=null){
        x[i]=y.track;
        i++;
        y=y.next;
    }
    return x;
}

    @Override
    public int totalTime() {
        int time=0;
        TrackListItem y=trackListHead;
        while(y!=null) {
            time+=y.track.getDuration();
            y=y.next;
        }
        return time;
    }

    @Override
    public String toString() {
    StringBuilder trackString= new StringBuilder();
        trackString.append("[");
    for(int i=0;i<nrTracks();i++){
        trackString.append("[").append(getTrackListItem(i).track.getTitle()).append("]");
    }
        trackString.append("]");
        return (title==null?"unknown":title)+"-"+(artist==null?"unknown":artist)+"-"+(year==0?"unknown":year)+"-"+totalTime()+"\n"+(nrTracks()==0?"[]":trackString);
    }
}
