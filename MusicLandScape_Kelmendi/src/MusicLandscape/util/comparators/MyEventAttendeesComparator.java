package MusicLandscape.util.comparators;

import MusicLandscape.entities.Event;

public class MyEventAttendeesComparator extends MyEventComparator{


    @Override
    public int compare(Event e1, Event e2) {
        int sum1=0;
        int sum2=0;

        if(e1!=null){
            sum1=e1.getAttendees();
        }
        if(e2!=null){
            sum2=e2.getAttendees();
        }
        return sum1-sum2;
    }
}
