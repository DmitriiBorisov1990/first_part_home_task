package com.epam.borisov.assignment_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

class Utility {

    private Utility() {
    }

    static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        return calendar.get(Calendar.YEAR);
    }
}
