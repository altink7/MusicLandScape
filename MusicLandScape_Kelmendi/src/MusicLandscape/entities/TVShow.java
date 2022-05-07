package MusicLandscape.entities;

import MusicLandscape.Date;
import MusicLandscape.Venue;

public class TVShow extends Event{
    private String name;
    private int viewers;

    public TVShow(){
    }
    public TVShow(Event e){
        this.artist= new Artist(e.artist);
        this.attendees=e.attendees;
        this.date= new Date(e.date);
        this.description=e.description;
        this.venue=new Venue(e.venue);
    }
    public TVShow(TVShow tvs){
        this.artist= new Artist(tvs.artist);
        this.attendees=tvs.attendees;
        this.date= new Date(tvs.date);
        this.description=tvs.description;
        this.venue=new Venue(tvs.venue);
        this.name=tvs.name;
        this.viewers=tvs.viewers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        if(viewers>0) {
            this.viewers = viewers;
        }
    }
    public int impact(){
        return (attendees+viewers)*2;
    }

    @Override
    public String toString() {
        return String.format("%s @ %s on %s\n%s\n(%d attending (%d))",
                getArtist(),(name==null?"unknown":name),getDate(),getDescription(),getAttendees()+getViewers(), impact());
    }
}
