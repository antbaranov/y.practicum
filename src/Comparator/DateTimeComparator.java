package Comparator;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        if(Integer.compare(dt1.year, dt2.year)==0){
            if (Integer.compare(dt1.month, dt2.month)==0){
                if (Integer.compare(dt1.day, dt2.day)==0){
                    if (Integer.compare(dt1.hours,dt2.hours)==0){
                        if (Integer.compare(dt1.minutes, dt2.minutes)==0){
                            if (Integer.compare(dt1.seconds, dt2.seconds)==0){
                                return 0;
                            }return Integer.compare(dt1.seconds, dt2.seconds);
                        }return Integer.compare(dt1.minutes, dt2.minutes);
                    }return Integer.compare(dt1.hours,dt2.hours);
                }else {
                    return Integer.compare(dt1.day, dt2.day);
                }
            }else{
                return Integer.compare(dt1.month, dt2.month);
            }
        }else {
            return Integer.compare(dt1.year, dt2.year);
        }
        //return 0;
    }
}