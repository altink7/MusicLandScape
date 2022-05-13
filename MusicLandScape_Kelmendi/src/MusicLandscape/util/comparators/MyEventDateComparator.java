package MusicLandscape.util.comparators;

import MusicLandscape.entities.Event;

public class MyEventDateComparator extends MyEventComparator{

    @Override
    public int compare(Event e1, Event e2) {
        int sum1= e1.getDate().getYear()*10000;
        sum1+=e1.getDate().getMonth()*100;
        sum1+=e1.getDate().getDay();

        int sum2= e1.getDate().getYear()*10000;
        sum2+=e1.getDate().getMonth()*100;
        sum2+=e1.getDate().getDay();

        return sum1 -sum2;
    }
}
