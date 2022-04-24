package MusicLandscape.entities;

@SuppressWarnings("StatementWithEmptyBody")
public class Track {
    private String title;
    private int duration;
    private Artist writer=new Artist();
    private Artist performer=new Artist();
    private int year;

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if(year>1900&&year<3000) {
            this.year = year;
        }
    }

    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        if(duration>0) {
            this.duration = duration;
        }
    }

    public String getTitle() {
        if(title==null){
            return "unknown title";
        }
        return title;
    }
    public void setTitle(String title) {
        if(title==null||title.equals("")) {
        }else {
            this.title = title;
        }
    }

    public Artist getWriter() {
        return writer;
    }
    public void setWriter(Artist writer) {
        if(writer!=null) {
            this.writer =writer;
        }
    }

    public Artist getPerformer() {
        return performer;
    }
    public void setPerformer(Artist performer) {
        if(performer!=null) {
            this.performer=performer;
        }
    }


    public boolean writerIsKnown(){
        return writer != null;
    }

    public String getString(){
         return title;
    }
}
