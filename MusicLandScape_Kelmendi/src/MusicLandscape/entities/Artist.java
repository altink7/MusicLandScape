package MusicLandscape.entities;

public class Artist implements Comparable, ArtistInterface {
    private String name;

    public Artist(){
        name="unknown";
    }

    public Artist(String name){
            this.name = name;
    }

    public Artist(Artist other){
            this.name = other.name;
    }

    public void setName(String name){
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compareTo(Artist arg0) {
        return this.getName().compareTo(arg0.getName());
    }
}
