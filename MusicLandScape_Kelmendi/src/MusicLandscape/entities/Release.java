package MusicLandscape.entities;

public abstract class Release {
    protected Artist artist;
    protected int year;
    protected String title;


    Release(){
    }

    Release(Release other){
        this.artist=new Artist(other.artist);
        this.year=other.year;
        this.title=other.title;
    }

    Release(String title, Artist artist, int year){
        this.title=title;
        this.artist=new Artist(artist);
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
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    abstract int totalTime();

    @Override
    public String toString() {
        return "Release{" +
                "artist=" + artist +
                ", year=" + year +
                ", title='" + title + '\'' +
                '}';
    }
}
