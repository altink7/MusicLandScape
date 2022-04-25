package MusicLandscape.entities;

public class Artist {
    private String name;

    public void setName(String name){
        if(name==null||name.isEmpty()||name.trim().isEmpty()) {
        }else {
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }
}
