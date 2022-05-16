package MusicLandscape.entities;

import MusicLandscape.util.ConsoleScanable;

import java.util.Scanner;

public class Track implements ConsoleScanable {

    Scanner sc = new Scanner(System.in);
    private String title;
    private int duration;
    private Artist writer=new Artist();
    private Artist performer=new Artist();
    private int year;

    public Track(){
    }
    public Track(String title){
        this.title=title;
    }

    public Track(Track other){
        this.title=other.title;
        this.duration=other.duration;
        this.writer=new Artist(other.writer);
        this.performer=new Artist(other.performer);
        this.year=other.year;
    }

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
        if(title==null||title.isEmpty()) {
        }else {
            this.title = title;
        }
    }
    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        if(writer==null) {
        }else{
            this.writer = writer;
        }
    }


    public Artist getPerformer() {
        return performer;
    }
    public void setPerformer(Artist performer) {
        if(performer==null) {
        }else{
            this.performer = performer;
        }
    }

    public boolean writerIsKnown(){

        if(writer!=null){
            if(writer.getName()!=null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String getString() {
        String titleF = String.format("%10s", "unknown");
        String namewF = String.format("%10s", "unknown");
        String namepF = String.format("%10s", "unknown");
        if(title!=null){
            titleF = String.format("%10s",title);
        }
        if(writerIsKnown()) {
             namewF = String.format("%10s", writer.getName());
        }

        if(performer==null||performer.getName()==null) {
        }else{
                namepF = String.format("%10s", performer.getName());
         }

        String timeF = String.format("(%02d:%02d)",duration/60,duration%60);

        return titleF.substring(0,10)+" by "+namewF.substring(0,10)+ " performed by "+namepF.substring(0,10)+" "+timeF;
    }


    @Override
    public String toString() {
        return this.getString();
    }

    @Override
    public boolean scan() {
        boolean fieldChanged = false;
        boolean objectChanged = false;
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.printf("current title: %s\n", this.title);
            System.out.print("enter new title (leave empty to keep):");
            input = sc.nextLine();

            if (input.length() == 0) { // keep old value?
                break;
            }

            fieldChanged = true;

            break;
        } while (true);
        if (fieldChanged) {
                setTitle(input);
        }
        if(sc.hasNext()) {
            int durationInput = sc.nextInt();
            while (durationInput < 0) {
                durationInput = sc.nextInt();
            }
            setDuration(durationInput);
        }

        objectChanged = objectChanged || fieldChanged;
        fieldChanged = false; // set up for next field


        return objectChanged;
    }

}
