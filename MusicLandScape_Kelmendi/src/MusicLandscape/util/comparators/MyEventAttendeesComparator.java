package MusicLandscape.util.comparators;

import MusicLandscape.entities.Event;

public class MyEventAttendeesComparator extends MyEventComparator{


    @Override
    public int compare(Event e1, Event e2) {
        return e1.getAttendees()-e2.getAttendees();
    }
}
