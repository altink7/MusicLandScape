package MusicLandscape.entities;

public abstract class Release {
    protected Artist artist=new Artist();
    protected int year=1900;
    protected String title;


    public Release(){
    }

    public Release(Release other){
        this.artist=new Artist(other.artist);
        this.year=other.year;
        this.title=other.title;
    }

    public Release(String title, Artist artist, int year){
        this.title=title;
        this.artist=artist;
        this.year=year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>-1) {
            this.year = year;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract int totalTime();

    @Override
    public String toString() {
        return (title==null?"unknown":title)+"-"+(artist==null?"unknown":artist)+"-"+(year==0?"unknown":year)+"-0";
    }
}
