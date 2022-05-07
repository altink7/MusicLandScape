package MusicLandscape.entities;


public class Concert extends Event{
    private Track[] setList;
    private int nextIdx=0;

    public boolean addTrack(Track track){
        if(track==null){
            return false;
        }
        else {
            if (setList ==null) {
                setList =new Track[1];
                setList[nextIdx] = track;
                nextIdx+=1;
            } else {
                ensureCapacity(setList.length+1);
                nextIdx+=1;
                setList[setList.length - 1] = track;
            }
            return true;
        }
    }

    public int duration(){
        int allDuration=0;
        if(setList==null){
            return 0;
        }
        for (Track track : setList) {
            allDuration += track.getDuration();
        }
        return allDuration;
    }


    public Track[] getSetList(){
        Track[]a =new Track[setList.length];
        for(int i=0;i<setList.length;i++){
            a[i]=new Track(setList[i]);
        }
        return a;
    }


    public int nrTracks(){
        if(setList!=null) {
            return setList.length;
        }
        return 0;
    }

    public void resetSetList(){
        setList=new Track[0];
        nextIdx=0;
    }

    public void setSetList(Track[] tracks){
        if(tracks!=null) {
            for (Track track : tracks) {
                if(track!=null) {
                    addTrack(new Track(track));
                }
            }
        }
    }
    @Override
    public int impact(){
        return attendees*(duration()/1800+1);
    }

    private void ensureCapacity(int length){
        Track[] newTrack =new Track[length];
        System.arraycopy(setList,0,newTrack,0, setList.length);
        setList =newTrack;
    }

    @Override
    public String toString() {
        return String.format("%s @ %s on %s\n%s\n(%d attending (%d))\n%d tracks played, total duration %02d:%02d.",
                getArtist(),(venue==null?"unknown":venue.getName()),getDate(),getDescription(),getAttendees(), impact(),nrTracks(),duration()/3600, duration()/60%60);
    }

}
