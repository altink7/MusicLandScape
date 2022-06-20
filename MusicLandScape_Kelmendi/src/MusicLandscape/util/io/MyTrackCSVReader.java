package MusicLandscape.util.io;

import MusicLandscape.entities.Artist;
import MusicLandscape.entities.Track;

import java.io.IOException;

public class MyTrackCSVReader extends MyReader<Track> {
    private static final int TITLE = 0;
    private static final int WRITER = 1;
    private static final int PERFORMER = 2;
    private static final int DURATION = 3;
    private static final int YEAR = 4;

    public MyTrackCSVReader(java.io.BufferedReader in){
        super(in);
    }

    public Track get(){
        String line = null;
        try {
            line = in.readLine();
            System.out.println(line);
            Track t = new Track();
            Artist a = new Artist();
            String[] strings = line.split(",");
            t.setTitle(strings[TITLE].trim());
            t.setWriter(new Artist(strings[WRITER].trim()));
            t.setPerformer(new Artist(strings[PERFORMER].trim()));
            t.setDuration(Integer.parseInt(strings[DURATION]));
            t.setYear(Integer.parseInt(strings[YEAR]));
            return t;
        }catch (IOException e) {
            System.out.println("Error reading.");
        }catch (Exception e){
            System.out.println("Error parsing.");
        }
        return null;
    }

}
