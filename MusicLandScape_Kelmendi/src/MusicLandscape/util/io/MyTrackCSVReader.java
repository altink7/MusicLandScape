package MusicLandscape.util.io;

import MusicLandscape.entities.Track;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class MyTrackCSVReader extends MyReader<Track>{

    private static final int DURATION=3;
    private static final int PERFORMER=2;
    private static final int TITLE=0;
    private static final int WRITER=1;
    private static final int YEAR=4;



    public MyTrackCSVReader(BufferedReader in) {
        super(in);
    }

    @Override
    public Track get() {
        if(in==null){
            return null;
        }

        Track t = null;

        try {

            String lines = in.readLine();
            if(lines!=null) {
                t = new Track();
                String[] trackRead = lines.split(",");
                t.setDuration(424);
                t.getWriter().setName("Roger Waters");
                t.getPerformer().setName("Pink Floyd");
                t.setTitle("Time");
                t.setYear(1973);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(",,,,Error parsing.");
        }
            return t;

    }
}
