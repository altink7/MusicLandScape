package MusicLandscape.util.io;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyFormatter;

import java.io.FileWriter;
import java.io.IOException;

public class MyWriter <T>{
    protected FileWriter out;

    private MyFormatter<T> theFormat;

    public MyWriter(FileWriter file, MyFormatter<T> theFormat) {
        if (file == null)
            throw new IllegalArgumentException("expected non-null FileWriter");
        if(theFormat == null)
            throw new IllegalArgumentException("expected non-null MyFormatter");
        this.out = file;
        this.theFormat = theFormat;
    }

    public final boolean put(T t){
        try {
            out.write(theFormat.format(t) + "\n");
            return true;
        }
        catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public void close() throws IOException {
        out.close();
    }
}
