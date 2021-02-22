package com.example.finstagram;

import com.parse.LogOutCallback;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * A copy of the timeFormatter class used in the twitterclone project, modified to work with
 * the 'Date' object returned by Parse's POST's getCreatedAt method
 * String representating the relative time difference "2m", "6d", "23 May", "1 Jan 14", etc.
 * depending on how great the time difference between now and the given date is to
 * more closely match how Instagram formats their date
 */
public class TimeFormatter {
    public static String getTimeDifference(Date createdDate){
        String time = "";
        long diff = (System.currentTimeMillis() - createdDate.getTime()) / 1000;
        if (diff < 5)
            time = "Just now";
        else if (diff < 60)
            time = String.format(Locale.ENGLISH, "%d seconds ago", diff);
        else if (diff < 60*60)
            time = String.format(Locale.ENGLISH, "%d minutes ago", diff / 60);
        else if (diff < 60*60*24)
            time = String.format(Locale.ENGLISH, "%d hours ago", diff / (60 * 60));
        else if (diff < 60*60*24*30)
            time = String.format(Locale.ENGLISH, "%d days ago", diff / (60*60*24));
        else {
            Calendar now = Calendar.getInstance();
            Calendar then = Calendar.getInstance();
            then.setTime(createdDate);
            if (now.get(Calendar.YEAR) == then.get(Calendar.YEAR)) {
                time = String.valueOf(then.get(Calendar.DAY_OF_MONTH)) + " "
                        + then.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
            } else {
                time = String.valueOf(then.get(Calendar.DAY_OF_MONTH)) + " "
                        + then.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US)
                        + " " + String.valueOf(then.get(Calendar.YEAR) - 2000);
            }
        }

        return time;
    }
}
