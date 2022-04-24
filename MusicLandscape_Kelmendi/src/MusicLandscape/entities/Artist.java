package MusicLandscape.entities;

public class Artist {
    private String name;

    public Artist(){
    }
    public Artist(Artist other){
        this.name=other.name;
    }

    public void setName(String name){
        if(name==null||name.equals("")) {
        }else {
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }
}
