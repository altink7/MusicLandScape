package MusicLandscape.entities;

import MusicLandscape.Date;
import MusicLandscape.Venue;

public class Event {
    protected Artist artist=new Artist();
    protected int attendees;
    protected Date date;
    String description="";
    protected Venue venue;

    public Event(){

    }

    public Event(Event other) {
        this.artist= new Artist(other.artist);
        this.attendees=other.attendees;
        this.date=new Date(other.date);
        this.description=other.description;
        this.venue=new Venue(other.venue);
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        if (artist==null){

        }else {
            this.artist = artist;
        }
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        if(attendees>=0) {
            this.attendees = attendees;
        }
    }

    public Date getDate() {
        if (date==null){
            return null;
        }
        return new Date(date);
    }

    public void setDate(Date date) {
        if(date==null){

        }else {
            this.date = new Date(date);
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description==null){
            this.description="";
        }else {
            this.description = description;
        }

    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public int impact(){
        return attendees*2;
    }

    @Override
    public String toString() {
        return String.format("%s @ %s on %s\n%s\n(%d attending (%d))",
                getArtist(),(venue==null?"unknown":venue.getName()),getDate(),getDescription(),getAttendees(), impact());
    }



}
