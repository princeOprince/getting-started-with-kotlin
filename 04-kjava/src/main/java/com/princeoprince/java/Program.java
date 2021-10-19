package com.princeoprince.java;

import com.princeoprince.kotlin.Meeting;
import com.princeoprince.kotlin.MeetingException;

public class Program {
    public static void main(String[] args) {
        Meeting board = new Meeting("Board Meeting");

        board.setLocation("London");

        System.out.println("The meeting is in " + board.getLocation());

        board.description = "A board meeting";

        int version = Meeting.APP_VERSION;

        Meeting.getAppVersion();

        try {
            board.addAttendee("");
        } catch (MeetingException me) {
            me.printStackTrace();
        }
    }
}
