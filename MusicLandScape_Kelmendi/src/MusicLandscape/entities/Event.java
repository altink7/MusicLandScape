package MusicLandscape.entities;

import MusicLandscape.Date;
import MusicLandscape.Venue;

public class Event {
    private Artist artist=new Artist();
    int attendees;
    private Date date;
    String description="";
    private Venue venue;

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
}
