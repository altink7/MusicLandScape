package MusicLandscape.util.comparators;

import MusicLandscape.entities.Event;

public class MyEventDateComparator extends MyEventComparator{

    @Override
    public int compare(Event e1, Event e2) {
        int sum1=-1;
        int sum2=-1;

        if(e1!=null){
            sum1=0;
        }
        if(e2!=null){
            sum2=0;
        }
        
        if(e1!=null&&e1.getDate()!=null) {
            sum1 = e1.getDate().getYear() * 10000;
            sum1 += e1.getDate().getMonth() * 100;
            sum1 += e1.getDate().getDay();
        }
        if(e2!=null&&e2.getDate()!=null) {
            sum2 += e2.getDate().getYear() * 10000;
            sum2 += e2.getDate().getMonth() * 100;
            sum2 += e2.getDate().getDay();
        }



        return sum1 -sum2;
    }
}
