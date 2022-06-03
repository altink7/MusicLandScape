package MusicLandscape.util.io;

import MusicLandscape.entities.Track;
import MusicLandscape.util.MyFormatter;
import java.io.IOException;

public class MyWriter <T>{

    protected java.io.FileWriter out;
    private MyFormatter<T> theFormat;

    public MyWriter(java.io.FileWriter file, MyFormatter<T> theFormat)throws IllegalArgumentException{
        if(file==null){
            throw new IllegalArgumentException("expected non-null FileWriter");
        }
        if(theFormat==null){
            throw new IllegalArgumentException("expected non-null MyFormatter");
        }
        out=file;
        this.theFormat=theFormat;
    }

    public void close() throws IOException {
        out.close();
    }

    public boolean put(T t) {
        try {
            out.write(theFormat.format(t));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
